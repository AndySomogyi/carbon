/*
 * MxConvert.cpp
 *
 *  Created on: Nov 18, 2020
 *      Author: andy
 */

#include "CConvert.hpp"
#include <iostream>

static std::string pyerror_str()
{
    std::string result;
    // get the error details
    PyObject *pExcType = NULL , *pExcValue = NULL , *pExcTraceback = NULL ;
    PyErr_Fetch( &pExcType , &pExcValue , &pExcTraceback ) ;
    if ( pExcType != NULL )
    {
        PyObject* pRepr = PyObject_Repr( pExcType ) ;
        
        PyObject * str=PyUnicode_AsASCIIString(pRepr);
        result += std::string("EXC type: ") + PyBytes_AsString(str);
        Py_DECREF(str);
        
        Py_DecRef( pRepr ) ;
        Py_DecRef( pExcType ) ;
    }
    if ( pExcValue != NULL )
    {
        PyObject* pRepr = PyObject_Repr( pExcValue ) ;

        PyObject * str=PyUnicode_AsASCIIString(pRepr);
        result += std::string("EXC value: ") + PyBytes_AsString(str);
        Py_DECREF(str);
        
        Py_DecRef( pRepr ) ;
        Py_DecRef( pExcValue ) ;
    }
    if ( pExcTraceback != NULL )
    {
        PyObject* pRepr = PyObject_Repr( pExcValue ) ;
        
        PyObject * str=PyUnicode_AsASCIIString(pRepr);
        result += std::string("EXC traceback: ") + PyBytes_AsString(str);
        Py_DECREF(str);
        
        Py_DecRef( pRepr ) ;
        Py_DecRef( pExcTraceback ) ;
    }
    
    return result;
}

namespace carbon {
    

template<>
float cast(PyObject *obj) {
if(PyNumber_Check(obj)) {
    return PyFloat_AsDouble(obj);
}
throw std::domain_error("can not convert to number");
}

template<>
PyObject* cast(const float &f) {
    return PyFloat_FromDouble(f);
}

template<>
bool cast(PyObject *obj) {
    if(PyBool_Check(obj)) {
        return obj == Py_True ? true : false;
    }
    throw std::domain_error("can not convert to boolean");
}

template<>
PyObject* cast(const bool &b) {
    if(b) {
        Py_RETURN_TRUE;
    }
    else {
        Py_RETURN_FALSE;
    }
}

    
template <>
bool check<bool>(PyObject *o) {
    return PyBool_Check(o);
}
    

PyObject *arg(const char* name, int index, PyObject *_args, PyObject *_kwargs) {
    PyObject *kwobj = _kwargs ?  PyDict_GetItemString(_kwargs, name) : NULL;
    PyObject *aobj = _args && (PyTuple_Size(_args) > index) ? PyTuple_GetItem(_args, index) : NULL;
    
    if(aobj && kwobj) {
        std::string msg = std::string("Error, argument \"") + name + "\" given both as a keyword and positional";
        throw std::logic_error(msg.c_str());
    }
    
    return aobj ? aobj : kwobj;
}
    
    
template<>
PyObject* cast(const double &f){
    return PyFloat_FromDouble(f);
}

template<>
double cast(PyObject *obj) {
if(PyNumber_Check(obj)) {
    return PyFloat_AsDouble(obj);
}
    throw std::domain_error("can not convert to number");
}

template<>
PyObject* cast(const int &i) {
    return PyLong_FromLong(i);
}

template<>
int cast(PyObject *obj){
    if(PyNumber_Check(obj)) {
        return PyLong_AsLong(obj);
    }
    throw std::domain_error("can not convert to number");
}

template<>
PyObject* cast(const std::string &s) {
    return PyUnicode_FromString(s.c_str());
}

template<>
std::string cast(PyObject *o) {
    if(PyUnicode_Check(o)) {
        const char* c = PyUnicode_AsUTF8(o);
        return std::string(c);
    }
    else {
        std::string msg = "could not convert ";
        msg += o->ob_type->tp_name;
        msg += " to string";
        throw std::domain_error(msg);
    }
}


template <>
bool check<std::string>(PyObject *o) {
    return o && PyUnicode_Check(o);
}

}


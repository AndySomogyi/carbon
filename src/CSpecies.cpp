/*
 * cspecies.cpp
 *
 *  Created on: Jun 4, 2020 *      Author: andy
 */

#include <CSpecies.hpp>
#include <c_object.hpp>
#include <CConvert.hpp>

#include <sbml/Species.h>
#include <sbml/SBMLNamespaces.h>

#include <iostream>


static libsbml::SBMLNamespaces *sbmlns = NULL;

libsbml::SBMLNamespaces* C_GetSBMLNamespaces() {
    if(!sbmlns) {
        sbmlns = new libsbml::SBMLNamespaces();
    }
    return sbmlns;
}

CSpecies_t *CSpecies_create(unsigned int level,
        unsigned int version)
{
    return 0;
}

void CSpecies_free(CSpecies_t *s)
{
}

CSpecies_t *CSpecies_clone(const CSpecies_t *s)
{
    return 0;
}

void CSpecies_initDefaults(CSpecies_t *s)
{
}

PyObject* CSpecies_getId(const CSpecies_t *s)
{
    return 0;
}

PyObject* CSpecies_getName(const CSpecies_t *s)
{
    //lib
    //return carbon::cast(s->getNa)
}

const char* CSpecies_getSpeciesType(const CSpecies_t *s)
{
    return 0;
}

const char* CSpecies_getCompartment(const CSpecies_t *s)
{
    return 0;
}

double CSpecies_getInitialAmount(const CSpecies_t *s)
{
    return 0;
}

double CSpecies_getInitialConcentration(const CSpecies_t *s)
{
    return 0;
}

const char* CSpecies_getSubstanceUnits(const CSpecies_t *s)
{
    return 0;
}

const char* CSpecies_getSpatialSizeUnits(const CSpecies_t *s)
{
    return 0;
}

const char* CSpecies_getUnits(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_getHasOnlySubstanceUnits(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_getBoundaryCondition(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_getCharge(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_getConstant(const CSpecies_t *s)
{
    return 0;
}

const char* CSpecies_getConversionFactor(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetId(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetName(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetSpeciesType(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetCompartment(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetInitialAmount(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetInitialConcentration(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetSubstanceUnits(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetSpatialSizeUnits(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetUnits(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetCharge(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetConversionFactor(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetConstant(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetBoundaryCondition(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_isSetHasOnlySubstanceUnits(const CSpecies_t *s)
{
    return 0;
}

int CSpecies_setId(CSpecies_t *s, const char *sid)
{
    return 0;
}

int CSpecies_setName(CSpecies_t *s, const char *name)
{
    return 0;
}

int CSpecies_setSpeciesType(CSpecies_t *s, const char *sid)
{
    return 0;
}

int CSpecies_setCompartment(CSpecies_t *s, const char *sid)
{
    return 0;
}

int CSpecies_setInitialAmount(CSpecies_t *s, double value)
{
    return 0;
}

int CSpecies_setInitialConcentration(CSpecies_t *s, double value)
{
    return 0;
}

int CSpecies_setSubstanceUnits(CSpecies_t *s, const char *sid)
{
    return 0;
}

int CSpecies_setSpatialSizeUnits(CSpecies_t *s, const char *sid)
{
    return 0;
}

int CSpecies_setUnits(CSpecies_t *s, const char *sname)
{
    return 0;
}

int CSpecies_setHasOnlySubstanceUnits(CSpecies_t *s, int value)
{
    return 0;
}

int CSpecies_setBoundaryCondition(CSpecies_t *s, int value)
{
    return 0;
}

int CSpecies_setCharge(CSpecies_t *s, int value)
{
    return 0;
}

int CSpecies_setConstant(CSpecies_t *s, int value)
{
    return 0;
}

int CSpecies_setConversionFactor(CSpecies_t *s, const char *sid)
{
    return 0;
}

int CSpecies_unsetId(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetName(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetConstant(CSpecies_t *c)
{
    return 0;
}

int CSpecies_unsetSpeciesType(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetInitialAmount(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetInitialConcentration(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetSubstanceUnits(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetSpatialSizeUnits(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetUnits(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetCharge(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetConversionFactor(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetCompartment(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetBoundaryCondition(CSpecies_t *s)
{
    return 0;
}

int CSpecies_unsetHasOnlySubstanceUnits(CSpecies_t *s)
{
    return 0;
}

int CSpecies_hasRequiredAttributes(CSpecies_t *s)
{
    return 0;
}

static int cspecies_init(CSpecies *self, PyObject *args, PyObject *kwargs) {
    std::cout << MX_FUNCTION << std::endl;
    
    PyObject *arg = NULL;
    
    if(args && PyTuple_Check(args) && PyTuple_Size(args) == 1) {
        arg = PyTuple_GetItem(args, 0);
    }
    else {
        arg = args;
    }
    
    if(carbon::check<std::string>(arg)) {
        std::string s = carbon::cast<std::string>(arg);
        if(libsbml::SyntaxChecker_isValidSBMLSId(s.c_str())) {
            self->species = new libsbml::Species(C_GetSBMLNamespaces());
            self->species->setId(s.c_str());
        }
        else {
            PyErr_SetString(PyExc_ValueError, "invalid species id string");
        }
    }
    else {
        PyErr_SetString(PyExc_ValueError, "Species(args) must be a string");
        return -1;
    }
}

static void cspecies_dealloc(CSpecies *self) {
    std::cout << MX_FUNCTION << std::endl;
    delete self->species;
    self->ob_type->tp_free(self);
}

CSpecies* CSpecies_NewFromPyArgs(PyObject *args, PyObject *kwargs) {
    CSpecies *obj = (CSpecies*)PyType_GenericNew(&CSpecies_Type, NULL, NULL);
    if(!obj) {
        PyErr_SetString(PyExc_ValueError, "could not allocate CSpecies object");
        return NULL;
    }
    
    if(!cspecies_init(obj, args, kwargs)) {
        Py_DECREF(obj);
        return NULL;
    }
    
    return obj;
}

static PyMethodDef species_methods[] = {
        { NULL, NULL, 0, NULL }
};

PyGetSetDef cspecies_getsets[] = {
    {
        .name = "id",
        .get = [](PyObject *obj, void *p) -> PyObject* {
            CSpecies *self = (CSpecies*)obj;
            return PySpecies_getId(self->species);
        },
        .set = [](PyObject *obj, PyObject *val, void *p) -> int {
            CSpecies *self = (CSpecies*)obj;
            return PySpecies_setId(self->species, val);
        },
        .doc = "test doc",
        .closure = NULL
    },
    {
        .name = "name",
        .get = [](PyObject *obj, void *p) -> PyObject* {
            CSpecies *self = (CSpecies*)obj;
            return PySpecies_getName(self->species);
        },
        .set = [](PyObject *obj, PyObject *val, void *p) -> int {
            CSpecies *self = (CSpecies*)obj;
            return PySpecies_setName(self->species, val);
        },
        .doc = "test doc",
        .closure = NULL
    },
    {NULL}
};


static PyObject* species_str(CSpecies *self) {
    std::string s = "Species('";
    s += self->species->getId();
    s += "')";
    return carbon::cast(s);
}




PyTypeObject CSpecies_Type = {
  CVarObject_HEAD_INIT(NULL, 0)
  "Species"                             , // .tp_name
  sizeof(CSpecies)                      , // .tp_basicsize
  0                                     , // .tp_itemsize
  (destructor )cspecies_dealloc         , // .tp_dealloc
  0                                     , // .tp_print
  0                                     , // .tp_getattr
  0                                     , // .tp_setattr
  0                                     , // .tp_as_async
  (reprfunc)species_str                 , // .tp_repr
  0                                     , // .tp_as_number
  0                                     , // .tp_as_sequence
  0                                     , // .tp_as_mapping
  0                                     , // .tp_hash
  0                                     , // .tp_call
  (reprfunc)species_str                 , // .tp_str
  0                                     , // .tp_getattro
  0                                     , // .tp_setattro
  0                                     , // .tp_as_buffer
  Py_TPFLAGS_DEFAULT | Py_TPFLAGS_BASETYPE , // .tp_flags
  0                                     , // .tp_doc
  0                                     , // .tp_traverse
  0                                     , // .tp_clear
  0                                     , // .tp_richcompare
  0                                     , // .tp_weaklistoffset
  0                                     , // .tp_iter
  0                                     , // .tp_iternext
  species_methods                       , // .tp_methods
  0                                     , // .tp_members
  cspecies_getsets                      , // .tp_getset
  0                                     , // .tp_base
  0                                     , // .tp_dict
  0                                     , // .tp_descr_get
  0                                     , // .tp_descr_set
  0                                     , // .tp_dictoffset
  (initproc)cspecies_init               , // .tp_init
  0                                     , // .tp_alloc
  PyType_GenericNew                     , // .tp_new
  0                                     , // .tp_free
  0                                     , // .tp_is_gc
  0                                     , // .tp_bases
  0                                     , // .tp_mro
  0                                     , // .tp_cache
  0                                     , // .tp_subclasses
  0                                     , // .tp_weaklist
  0                                     , // .tp_del
  0                                     , // .tp_version_tag
  0                                     , // .tp_finalize
  #ifdef COUNT_ALLOCS
  0                                     , // .tp_allocs
  0                                     , // .tp_frees
  0                                     , // .tp_maxalloc
  0                                     , // .tp_prev
  0                                     , // .tp_next
  #endif
};

    
PyObject* PySpecies_getId(const libsbml::Species* s)
{
    if(s->isSetId()) {
        return carbon::cast(s->getId());
    }
    else {
        Py_RETURN_NONE;
    }
}

PyObject* PySpecies_getName(const libsbml::Species *s)
{
    if(s->isSetName()) {
        return carbon::cast(s->getName());
    }
    else {
        Py_RETURN_NONE;
    }
}

PyObject* PySpecies_getInitialAmount(const libsbml::Species *s)
{
    if(s->isSetInitialAmount()) {
        return carbon::cast(s->getInitialAmount());
    }
    else {
        Py_RETURN_NONE;
    }
}

PyObject* PySpecies_getInitialConcentration(const libsbml::Species *s)
{
    if(s->isSetInitialConcentration()) {
        return carbon::cast(s->getInitialConcentration());
    }
    else {
        Py_RETURN_NONE;
    }
}

PyObject* PySpecies_getBoundaryCondition(const libsbml::Species *s)
{
    if(s->isSetBoundaryCondition()) {
        return carbon::cast(s->getBoundaryCondition());
    }
    else {
        Py_RETURN_NONE;
    }
}

PyObject* PySpecies_getConstant(const libsbml::Species *s)
{
    if(s->isSetConstant()) {
        return carbon::cast(s->getConstant());
    }
    else {
        Py_RETURN_NONE;
    }
}

int PySpecies_setId(libsbml::Species *s, PyObject *str)
{
    return s->setId(carbon::cast<std::string>(str));
}

int PySpecies_setName(libsbml::Species *s, PyObject *str)
{
    return s->setName(carbon::cast<std::string>(str));
}

int PySpecies_setInitialAmount(libsbml::Species *s, PyObject *value)
{
}

int PySpecies_setInitialConcentration(libsbml::Species *s, PyObject *value)
{
}

int PySpecies_setBoundaryCondition(libsbml::Species *s, PyObject *value)
{
}

int PySpecies_setConstant(libsbml::Species *s, PyObject *value)
{
}

C_BASIC_PYTHON_TYPE_INIT(Species)

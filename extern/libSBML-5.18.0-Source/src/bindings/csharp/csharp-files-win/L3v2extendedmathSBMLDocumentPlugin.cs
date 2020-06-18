//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.12
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace libsbml {

 using System;
 using System.Runtime.InteropServices;

/** 
 * @sbmlpackage{l3v2extendedmath}
 *
@htmlinclude pkg-marker-l3v2extendedmath.html Extension of SBMLDocument.
 */

public class L3v2extendedmathSBMLDocumentPlugin : SBMLDocumentPlugin {
	private HandleRef swigCPtr;
	
	internal L3v2extendedmathSBMLDocumentPlugin(IntPtr cPtr, bool cMemoryOwn) : base(libsbmlPINVOKE.L3v2extendedmathSBMLDocumentPlugin_SWIGUpcast(cPtr), cMemoryOwn)
	{
		//super(libsbmlPINVOKE.L3v2extendedmathSBMLDocumentPluginUpcast(cPtr), cMemoryOwn);
		swigCPtr = new HandleRef(this, cPtr);
	}
	
	internal static HandleRef getCPtr(L3v2extendedmathSBMLDocumentPlugin obj)
	{
		return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
	}
	
	internal static HandleRef getCPtrAndDisown (L3v2extendedmathSBMLDocumentPlugin obj)
	{
		HandleRef ptr = new HandleRef(null, IntPtr.Zero);
		
		if (obj != null)
		{
			ptr             = obj.swigCPtr;
			obj.swigCMemOwn = false;
		}
		
		return ptr;
	}

  ~L3v2extendedmathSBMLDocumentPlugin() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libsbmlPINVOKE.delete_L3v2extendedmathSBMLDocumentPlugin(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  
/**
   * Creates a new L3v2extendedmathSBMLDocumentPlugin using the given URI,
   * prefix and package namespace.
   *
   * @param uri a string, representing the URI of the SBML Level&nbsp;3 package
   * implemented by this libSBML package extension.
   *
   * @param prefix a string, the XML namespace prefix being used for this
   * package.
   *
   * @param l3v2extendedmathns a pointer to the namesspaces object
   * (L3v2extendedmathPkgNamespaces) for this package.
   *
   *
 * 
 * In the XML representation of an SBML document, XML namespaces are used to
 * identify the origin of each XML construct used.  XML namespaces are
 * identified by their unique resource identifiers (URIs).  The core SBML
 * specifications stipulate the namespaces that must be used for core SBML
 * constructs; for example, all XML elements that belong to SBML Level&nbsp;3
 * Version&nbsp;1 Core must be placed in the XML namespace identified by the URI
 * <code>'http://www.sbml.org/sbml/level3/version1/core'</code>.  Individual
 * SBML Level&nbsp;3 packages define their own XML namespaces; for example,
 * all elements belonging to the SBML Level&nbsp;3 %Layout Version&nbsp;1
 * package must be placed in the XML namespace
 * <code>'http://www.sbml.org/sbml/level3/version1/layout/version1/'</code>.
 *
 *
   *
   *
 * 
 * The SBMLNamespaces object encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and (in
 * Level&nbsp;3) packages used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's SBMLNamespaces facilities is to create an
 * SBMLNamespaces object somewhere in a program once, then hand that object
 * as needed to object constructors that accept SBMLNamespaces as arguments.
 *
 *
   */ public
 L3v2extendedmathSBMLDocumentPlugin(string uri, string prefix, L3v2extendedmathPkgNamespaces l3v2extendedmathns) : this(libsbmlPINVOKE.new_L3v2extendedmathSBMLDocumentPlugin__SWIG_0(uri, prefix, L3v2extendedmathPkgNamespaces.getCPtr(l3v2extendedmathns)), true) {
  }

  
/**
   * Copy constructor for L3v2extendedmathSBMLDocumentPlugin.
   *
   * @param orig the L3v2extendedmathSBMLDocumentPlugin instance to copy.
   */ public
 L3v2extendedmathSBMLDocumentPlugin(L3v2extendedmathSBMLDocumentPlugin orig) : this(libsbmlPINVOKE.new_L3v2extendedmathSBMLDocumentPlugin__SWIG_1(L3v2extendedmathSBMLDocumentPlugin.getCPtr(orig)), true) {
    if (libsbmlPINVOKE.SWIGPendingException.Pending) throw libsbmlPINVOKE.SWIGPendingException.Retrieve();
  }

  
/**
   * Creates and returns a deep copy of this L3v2extendedmathSBMLDocumentPlugin
   * object.
   *
   * @return a (deep) copy of this L3v2extendedmathSBMLDocumentPlugin object.
   */ public new
 SBasePlugin clone() {
    global::System.IntPtr cPtr = libsbmlPINVOKE.L3v2extendedmathSBMLDocumentPlugin_clone(swigCPtr);
    L3v2extendedmathSBMLDocumentPlugin ret = (cPtr == global::System.IntPtr.Zero) ? null : new L3v2extendedmathSBMLDocumentPlugin(cPtr, true);
    return ret;
  }

  
/** */ /* libsbml-internal */ public new
 bool isCompFlatteningImplemented() {
    bool ret = libsbmlPINVOKE.L3v2extendedmathSBMLDocumentPlugin_isCompFlatteningImplemented(swigCPtr);
    return ret;
  }

  
/** */ /* libsbml-internal */ public new
 long checkConsistency() { return (long)libsbmlPINVOKE.L3v2extendedmathSBMLDocumentPlugin_checkConsistency(swigCPtr); }

}

}
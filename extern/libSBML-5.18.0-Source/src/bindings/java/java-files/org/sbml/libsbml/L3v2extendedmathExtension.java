/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Base extension class for the package.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  This class is not prescribed by
the SBML specifications, although it is used to implement features
defined in SBML.
</p>

 <p>
 * This is the L3v2extendedmath package extension of the {@link SBMLExtension} class
 * that is used to facilitate libSBML plug-ins in the implementation of an
 * SBMLLevel&nbsp;3 package.
 */

public class L3v2extendedmathExtension extends SBMLExtension {
   private long swigCPtr;

   protected L3v2extendedmathExtension(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.L3v2extendedmathExtension_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(L3v2extendedmathExtension obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (L3v2extendedmathExtension obj)
   {
     long ptr = 0;

     if (obj != null)
     {
       ptr             = obj.swigCPtr;
       obj.swigCMemOwn = false;
     }

     return ptr;
   }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsbmlJNI.delete_L3v2extendedmathExtension(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Returns the nickname of the SBML Level&nbsp;3 package implemented by this
   * libSBML extension.
   <p>
   * @return the package nickname, as a string.
   <p>
   * 
   */ public
 static String getPackageName() {
    return libsbmlJNI.L3v2extendedmathExtension_getPackageName();
  }

  
/**
   * Returns the default SBML Level implemented by this libSBML extension.
   <p>
   * @return the SBML Level, as a long integereger.
   <p>
   * 
   */ public
 static long getDefaultLevel() {
    return libsbmlJNI.L3v2extendedmathExtension_getDefaultLevel();
  }

  
/**
   * Returns the default SBML Version implemented by this libSBML extension.
   <p>
   * @return the Version within the default SBML Level, as a long integereger.
   <p>
   * 
   */ public
 static long getDefaultVersion() {
    return libsbmlJNI.L3v2extendedmathExtension_getDefaultVersion();
  }

  
/**
   * Returns the default version of the SBML Level&nbsp;3 package implemented
   * by this libSBML extension.
   <p>
   * @return the default version number of the SBML Level&nbsp;3 package
   * definition, as a long integereger.
   <p>
   * 
   */ public
 static long getDefaultPackageVersion() {
    return libsbmlJNI.L3v2extendedmathExtension_getDefaultPackageVersion();
  }

  
/**
   * Returns the XML namespace URI of the SBML Level&nbsp;3 package implemented
   * by this libSBML extension.
   <p>
   * @return the XML namespace, as a string.
   <p>
   * 
   */ public
 static String getXmlnsL3V1V1() {
    return libsbmlJNI.L3v2extendedmathExtension_getXmlnsL3V1V1();
  }

  
/**
  * Returns the XML namespace URI of the SBML Level&nbsp;3 package automatically
  * included in L3V2.
  <p>
  * @return the XML namespace, as a string.
  <p>
  * 
  */ public
 static String getXmlnsL3V2() {
    return libsbmlJNI.L3v2extendedmathExtension_getXmlnsL3V2();
  }

  
/**
   * Creates a new {@link L3v2extendedmathExtension} instance.
   */ public
 L3v2extendedmathExtension() {
    this(libsbmlJNI.new_L3v2extendedmathExtension__SWIG_0(), true);
  }

  
/**
   * Copy constructor for {@link L3v2extendedmathExtension}.
   <p>
   * @param orig the {@link L3v2extendedmathExtension} instance to copy.
   */ public
 L3v2extendedmathExtension(L3v2extendedmathExtension orig) {
    this(libsbmlJNI.new_L3v2extendedmathExtension__SWIG_1(L3v2extendedmathExtension.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link L3v2extendedmathExtension} object.
   <p>
   * @return a (deep) copy of this {@link L3v2extendedmathExtension} object.
   */ public
 SBMLExtension cloneObject() {
    long cPtr = libsbmlJNI.L3v2extendedmathExtension_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new L3v2extendedmathExtension(cPtr, true);
  }

  
/**
   * Returns the name of this SBML Level&nbsp;3 package ('l3v2extendedmath').
   <p>
   * @return a string representing the name of this package
   * ('l3v2extendedmath').
   */ public
 String getName() {
    return libsbmlJNI.L3v2extendedmathExtension_getName(swigCPtr, this);
  }

  
/**
   * Returns a string representing the SBML XML namespace of this SBML
   * Level&nbsp;3 package.
   <p>
   * @param sbmlLevel the level of SBML.
   <p>
   * @param sbmlVersion the version of SBML.
   <p>
   * @param pkgVersion the version of this package.
   <p>
   * @return a string representing the name of this package
   * ('l3v2extendedmath').
   <p>
   * The namespace URI constructed by this method corresponds to the
   * combination of the Level and Version of SBML, and the Version of the SBML
   * Level&nbsp;3 package. (At the time of this writing, the only SBML Level
   * that supports packages is Level&nbsp;3, so the value of <code>sbmlLevel</code> is
   * necessarily always <code>3</code>.)
   */ public
 String getURI(long sbmlLevel, long sbmlVersion, long pkgVersion) {
    return libsbmlJNI.L3v2extendedmathExtension_getURI(swigCPtr, this, sbmlLevel, sbmlVersion, pkgVersion);
  }

  
/**
   * Returns the SBML Level for the given URI of this package.
   <p>
   * @param uri the string of the URI that represents one of the versions of
   * the 'l3v2extendedmath' package.
   <p>
   * @return the SBML Level for the given URI of this package, or <code>0</code> if the
   * given URI is invalid, or for a different package.
   */ public
 long getLevel(String uri) {
    return libsbmlJNI.L3v2extendedmathExtension_getLevel(swigCPtr, this, uri);
  }

  
/**
   * Returns the Version within the SBML Level for the given URI of this
   * package.
   <p>
   * @param uri the string of the URI that represents one of the versions of
   * the 'l3v2extendedmath' package.
   <p>
   * @return the SBML Version within the SBML Level for the given URI of this
   * package, or <code>0</code> if the given URI is invalid, or for a different package.
   */ public
 long getVersion(String uri) {
    return libsbmlJNI.L3v2extendedmathExtension_getVersion(swigCPtr, this, uri);
  }

  
/**
   * Returns the SBML Level&nbsp;3 package version for the given URI of this
   * package.
   <p>
   * @param uri the string of the URI that represents one of the versions of
   * the 'l3v2extendedmath' package.
   <p>
   * @return the version of the SBML Level&nbsp;3 package for the given URI of
   * this package, or <code>0</code> if the given URI is invalid, or for a different
   * package.
   */ public
 long getPackageVersion(String uri) {
    return libsbmlJNI.L3v2extendedmathExtension_getPackageVersion(swigCPtr, this, uri);
  }

  
/**
   * Returns a {@link L3v2extendedmathPkgNamespaces} object.
   <p>
   * @param uri the string of the URI that represents one of the versions of
   * the 'l3v2extendedmath' package.
   <p>
   * @return {@link L3v2extendedmathPkgNamespaces} object corresponding to the given
   * URI of this package, or <code>null</code> if the given URI is not defined in the
   * 'l3v2extendedmath' package.
   */ public
 SBMLNamespaces getSBMLExtensionNamespaces(String uri) {
  return libsbml.DowncastSBMLNamespaces(libsbmlJNI.L3v2extendedmathExtension_getSBMLExtensionNamespaces(swigCPtr, this, uri), false);
}

  
/**
   * Takes a type code of the &ldquo;l3v2extendedmath&rdquo; package and
   * returns a string describing the code.
   <p>
   * @param typeCode a libSBML type code defined by the libSBML extension
   * implementing support for the SBML Level&nbsp;3
   * &ldquo;l3v2extendedmath&rdquo; package.
   <p>
   * @return a text string representing the type code given by <code>typeCode</code>. If
   * the type code is unrecognized for this implementation of the libSBML
   * &ldquo;l3v2extendedmath&rdquo; package, the string returned will be
   * <code>'(Unknown SBML L3v2extendedmath Type)'</code>.
   */ public
 String getStringFromTypeCode(int typeCode) {
    return libsbmlJNI.L3v2extendedmathExtension_getStringFromTypeCode(swigCPtr, this, typeCode);
  }

  
/** * @internal */ public
 SWIGTYPE_p_packageErrorTableEntry getErrorTable(long index) {
    return new SWIGTYPE_p_packageErrorTableEntry(libsbmlJNI.L3v2extendedmathExtension_getErrorTable(swigCPtr, this, index), true);
  }

  
/** * @internal */ public
 long getErrorTableIndex(long errorId) {
    return libsbmlJNI.L3v2extendedmathExtension_getErrorTableIndex(swigCPtr, this, errorId);
  }

  
/** * @internal */ public
 long getErrorIdOffset() {
    return libsbmlJNI.L3v2extendedmathExtension_getErrorIdOffset(swigCPtr, this);
  }

  
/** * @internal */ public
 static void init() {
    libsbmlJNI.L3v2extendedmathExtension_init();
  }

}

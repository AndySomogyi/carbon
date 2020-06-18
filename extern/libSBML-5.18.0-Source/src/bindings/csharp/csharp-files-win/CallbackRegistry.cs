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

public class CallbackRegistry : global::System.IDisposable {
	private HandleRef swigCPtr;
	protected bool swigCMemOwn;
	
	internal CallbackRegistry(IntPtr cPtr, bool cMemoryOwn)
	{
		swigCMemOwn = cMemoryOwn;
		swigCPtr    = new HandleRef(this, cPtr);
	}
	
	internal static HandleRef getCPtr(CallbackRegistry obj)
	{
		return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
	}
	
	internal static HandleRef getCPtrAndDisown (CallbackRegistry obj)
	{
		HandleRef ptr = new HandleRef(null, IntPtr.Zero);
		
		if (obj != null)
		{
			ptr             = obj.swigCPtr;
			obj.swigCMemOwn = false;
		}
		
		return ptr;
	}

  ~CallbackRegistry() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libsbmlPINVOKE.delete_CallbackRegistry(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

  
/**
	 * Invokes all registered callbacks on the given document. If the callbacks indicate
	 * that processing should be stopped they return a value other than operation success.
	 * 
	 * @return LIBSBML_OPERATION_SUCCESS to indicate that processing should be continued, 
	 *         any other value to stop processing
	 */ public
 static int invokeCallbacks(SBMLDocument doc) {
    int ret = libsbmlPINVOKE.CallbackRegistry_invokeCallbacks(SBMLDocument.getCPtr(doc));
    return ret;
  }

  
/**
   * Clears all registered processing callbacks
   */ public
 static void clearCallbacks() {
    libsbmlPINVOKE.CallbackRegistry_clearCallbacks();
  }

  
/**
   * Registers a new processing callback that will be called with a newly instantiated
   * ModelDefinition object. This allows for all post processing on it that needs to
   * happen before integrating it with the target document.
   *
   * @param cb the callback.
   */ public
 static void addCallback(Callback cb) {
    libsbmlPINVOKE.CallbackRegistry_addCallback(Callback.getCPtr(cb));
  }

  
/**
	 * @return the number of registered callbacks.
	 */ public
 static int getNumCallbacks() {
    int ret = libsbmlPINVOKE.CallbackRegistry_getNumCallbacks();
    return ret;
  }

  
/**
   * Removes the callback with given index.
   *
   * @param index the index of the callback to be removed from the list.
   *
   */ public
 static void removeCallback(int index) {
    libsbmlPINVOKE.CallbackRegistry_removeCallback__SWIG_0(index);
  }

  
/**
	 * Removes the specified callback from the list of registered callbacks
	 *
	 * @param cb the callback to be removed.
	 */ public
 static void removeCallback(Callback cb) {
    libsbmlPINVOKE.CallbackRegistry_removeCallback__SWIG_1(Callback.getCPtr(cb));
  }

}

}

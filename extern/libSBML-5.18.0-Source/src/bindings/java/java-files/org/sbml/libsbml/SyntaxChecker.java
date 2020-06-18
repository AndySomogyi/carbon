/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Methods for checking the validity of SBML identifiers.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  This class is not prescribed by
the SBML specifications, although it is used to implement features
defined in SBML.
</p>

 <p>
 * This utility class provides static methods for checking the syntax of
 * identifiers and other text used in an SBML model.  The methods allow
 * callers to verify that strings such as SBML identifiers and XHTML notes
 * text conform to the SBML specifications.
 */

public class SyntaxChecker {
   private long swigCPtr;
   protected boolean swigCMemOwn;

   protected SyntaxChecker(long cPtr, boolean cMemoryOwn)
   {
     swigCMemOwn = cMemoryOwn;
     swigCPtr    = cPtr;
   }

   protected static long getCPtr(SyntaxChecker obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SyntaxChecker obj)
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
        libsbmlJNI.delete_SyntaxChecker(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  
/**
   * Returns <code>true</code> or <code>false</code> depending on whether the argument
   * string conforms to the syntax of SBML identifiers.
   <p>
   * <p>
 * In SBML, identifiers that are the values of 'id' attributes on objects
 * must conform to a data type called <code>SId</code> in the SBML
 * specifications.  LibSBML does not provide an explicit <code>SId</code>
 * data type; it uses ordinary character strings, which is easier for
 * applications to support.  (LibSBML does, however, test for identifier
 * validity at various times, such as when reading in models from files
 * and data streams.) 
   <p>
   * This method provides programs with the ability to test explicitly that
   * the identifier strings they create conform to the SBML identifier
   * syntax.
   <p>
   * @param sid string to be checked for conformance to SBML identifier
   * syntax.
   <p>
   * @return <code>true</code> if the string conforms to type SBML data type
   * <code>SId</code>, <code>false</code> otherwise.
   <p>
   * The identifier given by an object's 'id' attribute value
   * is used to identify the object within the SBML model definition.
   * Other objects can refer to the component using this identifier.  The
   * data type of 'id' is always <code>SId</code> or a type derived
   * from that, such as <code>UnitSId</code>, depending on the object in 
   * question.  All data types are defined as follows:
   * <pre style='margin-left: 2em; border: none; font-weight: bold; color: black'>
   *   letter .= 'a'..'z','A'..'Z'
   *   digit  .= '0'..'9'
   *   idChar .= letter | digit | '_'
   *   SId    .= ( letter | '_' ) idChar*
   * </pre>
   <p>
   * The equality of <code>SId</code> and <code>SId</code>-derived values
   * in SBML is determined by an exact character sequence match; i.e.,
   * comparisons of these identifiers must be performed in a case-sensitive
   * manner.  This applies to all uses of <code>SId</code>, 
   * <code>SIdRef</code>, and derived types.
   <p>
   * 
   <p>
   * @see SyntaxChecker#isValidUnitSId(String sid) 
   * @see SyntaxChecker#isValidXMLID(String sid) 
   */ public
 static boolean isValidSBMLSId(String sid) {
    return libsbmlJNI.SyntaxChecker_isValidSBMLSId(sid);
  }

  
/**
   * Returns <code>true</code> or <code>false</code> depending on whether the argument string
   * conforms to the XML data type <code>ID</code>.
   <p>
   * <p>
 * The optional attribute named 'metaid', present on every major SBML
 * component type, is for supporting metadata annotations using RDF (<a
 * href='http://www.w3.org/RDF/'>Resource Description Format</a>).  The
 * attribute value has the data type <a
 * href='http://www.w3.org/TR/REC-xml/#id'>XML <code>ID</code></a>, the XML
 * identifier type, which means each 'metaid' value must be globally unique
 * within an SBML file.  The latter point is important, because the
 * uniqueness criterion applies across <em>any</em> attribute with type
 * <code>ID</code> anywhere in the file, not just the 'metaid' attribute used
 * by SBML&mdash;something to be aware of if your application-specific XML
 * content inside the 'annotation' subelement happens to use the XML
 * <code>ID</code> type.  Although SBML itself specifies the use of <a
 * href='http://www.w3.org/TR/REC-xml/#id'>XML <code>ID</code></a> only for
 * the 'metaid' attribute, SBML-compatible applications should be careful if
 * they use XML <code>ID</code>'s in XML portions of a model that are not
 * defined by SBML, such as in the application-specific content of the
 * 'annotation' subelement.  Finally, note that LibSBML does not provide an
 * explicit XML <code>ID</code> data type; it uses ordinary character
 * strings, which is easier for applications to support. 
   <p>
   * This method provides programs with the ability to test explicitly that
   * the identifier strings they create conform to the SBML identifier
   * syntax.
   <p>
   * @param id string to be checked for conformance to the syntax of
   * <a target='_blank' href='http://www.w3.org/TR/REC-xml/#id'>XML ID</a>.
   <p>
   * @return <code>true</code> if the string is a syntactically-valid value for the
   * XML type <a target='_blank'
   * href='http://www.w3.org/TR/REC-xml/#id'>ID</a>, <code>false</code> otherwise.
   <p>
   * @note The following is a summary of the definition of the XML&nbsp;1.0 data type
<a target="_blank" href="http://www.w3.org/TR/REC-xml/#id">ID</a>.  We
express the syntax using an extended form of BNF notation:
<p>
<nobr><code style="margin-left: 2em; letter-spacing: -1px">NCNameChar ::= letter | digit | '.' | '-' | '_' | ':' | CombiningChar | Extender</code><br></nobr>
<code style="margin-left: 2em; letter-spacing: -1px">ID ::= ( letter | '_' | ':' ) NCNameChar*</code><br>
<p>
The characters <code>(</code> and <code>)</code> are used for grouping, the
character <code>*</code> means "zero or more times", and the character
<code>|</code> indicates logical "or". The production <code>letter</code>
consists of the basic upper and lower case alphabetic characters of the
Latin alphabet along with a large number of related characters defined by
Unicode&nbsp;2.0; similarly, the production <code>digit</code> consists of
the numerals <code>0..9</code> along with related Unicode&nbsp;2.0
characters.  The <code>CombiningChar</code> production is a list of
characters that add such things as accents to the preceding character. (For
example, the Unicode character <code>\#x030A</code> when combined with
<code>a</code> produces <code>a</code>.)  The <code>Extender</code>
production is a list of characters that extend the shape of the preceding
character.  Please consult the <a target="_blank"
href="http://www.w3.org/TR/2004/REC-xml-20040204/">XML&nbsp;1.0
specification</a> for the complete definitions of <code>letter</code>,
<code>digit</code>, <code>CombiningChar</code>, and <code>Extender</code>.
<p>

   <p>
   * 
   <p>
   * @see SyntaxChecker#isValidSBMLSId(String sid) 
   * @see SyntaxChecker#isValidUnitSId(String sid) 
   */ public
 static boolean isValidXMLID(String id) {
    return libsbmlJNI.SyntaxChecker_isValidXMLID(id);
  }

  
/**
   * Returns <code>true</code> or <code>false</code> depending on whether the <code>uri</code> argument string
   * conforms to the XML data type <code>anyURI</code>.
   <p>
   * Type anyURI is defined by XML Schema 1.0. It is a character string 
   * data type whose values are interpretable as URIs (Universal Resource 
   * Identifiers) as described by the W3C document RFC 3986.  LibSBML
   * does not provide an explicit XML <code>anyURI</code> data type; it uses
   * ordinary character strings, which is easier for applications to
   * support.  LibSBML does, however, test for anyURI validity at
   * various times, such as when reading in models from files and data
   * streams.
   <p>
   * This method provides programs with the ability to test explicitly that
   * the strings they create conform to the XML anyURI syntax.
   <p>
   * @param uri string to be checked for conformance to the syntax of
   * <a target='_blank' 
   * href='http://www.w3.org/TR/xmlschema-2/#anyURI'>anyURI</a>.
   <p>
   * @return <code>true</code> if the string is a syntactically-valid value for the
   * XML type <a target='_blank'
   * href='http://www.w3.org/TR/xmlschema-2/#anyURI'>anyURI</a>, 
   * <code>false</code> otherwise.
   <p>
   * 
   */ public
 static boolean isValidXMLanyURI(String uri) {
    return libsbmlJNI.SyntaxChecker_isValidXMLanyURI(uri);
  }

  
/**
   * Returns <code>true</code> or <code>false</code> depending on whether the argument string
   * conforms to the syntax of SBML unit identifiers.
   <p>
   * In SBML, the identifiers of units (of both the predefined units and
   * user-defined units) must conform to a data type called
   * <code>UnitSId</code> in the SBML specifications.  LibSBML does not
   * provide an explicit <code>UnitSId</code> data type; it uses ordinary
   * character strings, which is easier for applications to support.
   * LibSBML does, however, test for identifier validity at various times,
   * such as when reading in models from files and data streams.
   <p>
   * This method provides programs with the ability to test explicitly that
   * the identifier strings they create conform to the SBML identifier
   * syntax.
   <p>
   * @param units string to be checked for conformance to SBML unit
   * identifier syntax.
   <p>
   * @return <code>true</code> if the string conforms to type SBML data type
   * <code>UnitSId</code>, <code>false</code> otherwise.
   <p>
   * @note The following is a summary of the definition of the SBML identifier type
<code>UnitSId</code>, which defines the permitted syntax of identifiers.
We express the syntax using an extended form of BNF notation:
<p>
<code style="margin-left: 2em">letter ::= 'a'..'z','A'..'Z'</code><br>
<code style="margin-left: 2em">digit  ::= '0'..'9'</code><br>
<code style="margin-left: 2em">idChar ::= letter | digit | '_'</code><br>
<code style="margin-left: 2em">SId    ::= ( letter | '_' ) idChar*</code><br>
<p>
The characters <code>(</code> and <code>)</code> are used for grouping, the
character <code>*</code> "zero or more times", and the character
<code>|</code> indicates logical "or".  The equality of SBML unit
identifiers is determined by an exact character sequence match; i.e.,
comparisons must be performed in a case-sensitive manner.  In addition,
there are a few conditions for the uniqueness of unit identifiers in an
SBML model.  Please consult the SBML specifications for the exact
formulations.
<p>

   <p>
   * 
   <p>
   * @see SyntaxChecker#isValidSBMLSId(String sid) 
   * @see SyntaxChecker#isValidXMLID(String sid) 
   */ public
 static boolean isValidUnitSId(String units) {
    return libsbmlJNI.SyntaxChecker_isValidUnitSId(units);
  }

  
/**
   * Returns <code>true</code> or <code>false</code> depending on whether the given {@link XMLNode}
   * object contains valid XHTML content.
   <p>
   * <p>
 * The optional SBML element named 'notes', present on every major SBML
 * component type (and in SBML Level&nbsp;3, the 'message' subelement of
 * {@link Constraint}), is intended as a place for storing optional information
 * intended to be seen by humans.  An example use of the 'notes' element
 * would be to contain formatted user comments about the model element in
 * which the 'notes' element is enclosed.  Every object derived directly or
 * indirectly from type {@link SBase} can have a separate value for 'notes', allowing
 * users considerable freedom when adding comments to their models.
 <p>
 * The format of 'notes' elements conform to the definition of <a
 * target='_blank' href='http://www.w3.org/TR/xhtml1/'>XHTML&nbsp;1.0</a>.
 * However, the content cannot be <em>entirely</em> free-form; it must satisfy
 * certain requirements defined in the <a target='_blank'
 * href='http://sbml.org/Documents/Specifications'>SBML specifications</a>
 * for specific SBML Levels.  To help verify the formatting of 'notes'
 * content, libSBML provides the static utility method
 * {@link SyntaxChecker#hasExpectedXHTMLSyntax(XMLNode)}; this
 * method implements a verification process that lets callers check whether
 * the content of a given {@link XMLNode} object conforms to the SBML requirements
 * for 'notes' and 'message' structure.  Developers are urged to consult the
 * appropriate <a target='_blank'
 * href='http://sbml.org/Documents/Specifications'>SBML specification
 * document</a> for the Level and Version of their model for more in-depth
 * explanations of using 'notes' in SBML.  The SBML Level&nbsp;2 and&nbsp;3
 * specifications have considerable detail about how 'notes' element content
 * must be structured.
   <p>
   * An aspect of XHTML validity is that the content is declared to be in
   * the XML namespace for XHTML&nbsp;1.0.  There is more than one way in
   * which this can be done in XML.  In particular, a model might not
   * contain the declaration within the 'notes' or 'message' subelement
   * itself, but might instead place the declaration on an enclosing
   * element and use an XML namespace prefix within the 'notes' element to
   * refer to it.  In other words, the following is valid:
   * <pre class='fragment'>
&lt;sbml xmlns='http://www.sbml.org/sbml/level2/version3' level='2' version='3'
      xmlns:xhtml='http://www.w3.org/1999/xhtml'&gt;
  &lt;model&gt;
    &lt;notes&gt;
      &lt;xhtml:body&gt;
        &lt;xhtml:center&gt;&lt;xhtml:h2&gt;A Simple Mitotic Oscillator&lt;/xhtml:h2&gt;&lt;/xhtml:center&gt;
        &lt;xhtml:p&gt;A minimal cascade model for the mitotic oscillator.&lt;/xhtml:p&gt;
      &lt;/xhtml:body&gt;
    &lt;/notes&gt;
  ... rest of model ...
&lt;/sbml&gt;
</pre>
   * Contrast the above with the following, self-contained version, which
   * places the XML namespace declaration within the <code>&lt;notes&gt;</code>
   * element itself:
   * <pre class='fragment'>
&lt;sbml xmlns='http://www.sbml.org/sbml/level2/version3' level='2' version='3'&gt;
  &lt;model&gt;
    &lt;notes&gt;
      &lt;html xmlns='http://www.w3.org/1999/xhtml'&gt;
        &lt;head&gt;
          &lt;title/&gt;
        &lt;/head&gt;
        &lt;body&gt;
          &lt;center&gt;&lt;h2&gt;A Simple Mitotic Oscillator&lt;/h2&gt;&lt;/center&gt;
          A minimal cascade model for the mitotic oscillator.&lt;/p&gt;
        &lt;/body&gt;
      &lt;/html&gt;
    &lt;/notes&gt;
  ... rest of model ...
&lt;/sbml&gt;
</pre>
   <p>
   * Both of the above are valid XML.  The purpose of the <code>sbmlns</code>
   * argument to this method is to allow callers to check the validity of
   * 'notes' and 'message' subelements whose XML namespace declarations
   * have been put elsewhere in the manner illustrated above.  Callers can
   * can pass in the {@link SBMLNamespaces} object of a higher-level model
   * component if the {@link XMLNode} object does not itself have the XML namespace
   * declaration for XHTML&nbsp;1.0.
   <p>
   * @param xhtml the {@link XMLNode} to be checked for conformance.
   * @param sbmlns the {@link SBMLNamespaces} associated with the object.
   <p>
   * @return <code>true</code> if the {@link XMLNode} content conforms, <code>false</code> otherwise.
   <p>
   * 
   <p>
   * 
</dl><dl class="docnote"><dt><b>Documentation note:</b></dt><dd>
The native C++ implementation of this method defines a default argument
value. In the documentation generated for different libSBML language
bindings, you may or may not see corresponding arguments in the method
declarations. For example, in Java and C#, a default argument is handled by
declaring two separate methods, with one of them having the argument and
the other one lacking the argument. However, the libSBML documentation will
be <em>identical</em> for both methods. Consequently, if you are reading
this and do not see an argument even though one is described, please look
for descriptions of other variants of this method near where this one
appears in the documentation.
</dd></dl>
 
   */ public
 static boolean hasExpectedXHTMLSyntax(XMLNode xhtml, SBMLNamespaces sbmlns) {
    return libsbmlJNI.SyntaxChecker_hasExpectedXHTMLSyntax__SWIG_0(XMLNode.getCPtr(xhtml), xhtml, SBMLNamespaces.getCPtr(sbmlns), sbmlns);
  }

  
/**
   * Returns <code>true</code> or <code>false</code> depending on whether the given {@link XMLNode}
   * object contains valid XHTML content.
   <p>
   * <p>
 * The optional SBML element named 'notes', present on every major SBML
 * component type (and in SBML Level&nbsp;3, the 'message' subelement of
 * {@link Constraint}), is intended as a place for storing optional information
 * intended to be seen by humans.  An example use of the 'notes' element
 * would be to contain formatted user comments about the model element in
 * which the 'notes' element is enclosed.  Every object derived directly or
 * indirectly from type {@link SBase} can have a separate value for 'notes', allowing
 * users considerable freedom when adding comments to their models.
 <p>
 * The format of 'notes' elements conform to the definition of <a
 * target='_blank' href='http://www.w3.org/TR/xhtml1/'>XHTML&nbsp;1.0</a>.
 * However, the content cannot be <em>entirely</em> free-form; it must satisfy
 * certain requirements defined in the <a target='_blank'
 * href='http://sbml.org/Documents/Specifications'>SBML specifications</a>
 * for specific SBML Levels.  To help verify the formatting of 'notes'
 * content, libSBML provides the static utility method
 * {@link SyntaxChecker#hasExpectedXHTMLSyntax(XMLNode)}; this
 * method implements a verification process that lets callers check whether
 * the content of a given {@link XMLNode} object conforms to the SBML requirements
 * for 'notes' and 'message' structure.  Developers are urged to consult the
 * appropriate <a target='_blank'
 * href='http://sbml.org/Documents/Specifications'>SBML specification
 * document</a> for the Level and Version of their model for more in-depth
 * explanations of using 'notes' in SBML.  The SBML Level&nbsp;2 and&nbsp;3
 * specifications have considerable detail about how 'notes' element content
 * must be structured.
   <p>
   * An aspect of XHTML validity is that the content is declared to be in
   * the XML namespace for XHTML&nbsp;1.0.  There is more than one way in
   * which this can be done in XML.  In particular, a model might not
   * contain the declaration within the 'notes' or 'message' subelement
   * itself, but might instead place the declaration on an enclosing
   * element and use an XML namespace prefix within the 'notes' element to
   * refer to it.  In other words, the following is valid:
   * <pre class='fragment'>
&lt;sbml xmlns='http://www.sbml.org/sbml/level2/version3' level='2' version='3'
      xmlns:xhtml='http://www.w3.org/1999/xhtml'&gt;
  &lt;model&gt;
    &lt;notes&gt;
      &lt;xhtml:body&gt;
        &lt;xhtml:center&gt;&lt;xhtml:h2&gt;A Simple Mitotic Oscillator&lt;/xhtml:h2&gt;&lt;/xhtml:center&gt;
        &lt;xhtml:p&gt;A minimal cascade model for the mitotic oscillator.&lt;/xhtml:p&gt;
      &lt;/xhtml:body&gt;
    &lt;/notes&gt;
  ... rest of model ...
&lt;/sbml&gt;
</pre>
   * Contrast the above with the following, self-contained version, which
   * places the XML namespace declaration within the <code>&lt;notes&gt;</code>
   * element itself:
   * <pre class='fragment'>
&lt;sbml xmlns='http://www.sbml.org/sbml/level2/version3' level='2' version='3'&gt;
  &lt;model&gt;
    &lt;notes&gt;
      &lt;html xmlns='http://www.w3.org/1999/xhtml'&gt;
        &lt;head&gt;
          &lt;title/&gt;
        &lt;/head&gt;
        &lt;body&gt;
          &lt;center&gt;&lt;h2&gt;A Simple Mitotic Oscillator&lt;/h2&gt;&lt;/center&gt;
          A minimal cascade model for the mitotic oscillator.&lt;/p&gt;
        &lt;/body&gt;
      &lt;/html&gt;
    &lt;/notes&gt;
  ... rest of model ...
&lt;/sbml&gt;
</pre>
   <p>
   * Both of the above are valid XML.  The purpose of the <code>sbmlns</code>
   * argument to this method is to allow callers to check the validity of
   * 'notes' and 'message' subelements whose XML namespace declarations
   * have been put elsewhere in the manner illustrated above.  Callers can
   * can pass in the {@link SBMLNamespaces} object of a higher-level model
   * component if the {@link XMLNode} object does not itself have the XML namespace
   * declaration for XHTML&nbsp;1.0.
   <p>
   * @param xhtml the {@link XMLNode} to be checked for conformance.
   * @param sbmlns the {@link SBMLNamespaces} associated with the object.
   <p>
   * @return <code>true</code> if the {@link XMLNode} content conforms, <code>false</code> otherwise.
   <p>
   * 
   <p>
   * 
</dl><dl class="docnote"><dt><b>Documentation note:</b></dt><dd>
The native C++ implementation of this method defines a default argument
value. In the documentation generated for different libSBML language
bindings, you may or may not see corresponding arguments in the method
declarations. For example, in Java and C#, a default argument is handled by
declaring two separate methods, with one of them having the argument and
the other one lacking the argument. However, the libSBML documentation will
be <em>identical</em> for both methods. Consequently, if you are reading
this and do not see an argument even though one is described, please look
for descriptions of other variants of this method near where this one
appears in the documentation.
</dd></dl>
 
   */ public
 static boolean hasExpectedXHTMLSyntax(XMLNode xhtml) {
    return libsbmlJNI.SyntaxChecker_hasExpectedXHTMLSyntax__SWIG_1(XMLNode.getCPtr(xhtml), xhtml);
  }

  
/** * @internal */ public
 static boolean isValidInternalSId(String sid) {
    return libsbmlJNI.SyntaxChecker_isValidInternalSId(sid);
  }

  
/** * @internal */ public
 static boolean isValidInternalUnitSId(String sid) {
    return libsbmlJNI.SyntaxChecker_isValidInternalUnitSId(sid);
  }

  public SyntaxChecker() {
    this(libsbmlJNI.new_SyntaxChecker(), true);
  }

}

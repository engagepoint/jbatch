//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vIBM 2.2.3-11/28/2011 06:21 AM(foreman)- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.01 at 03:04:46 PM EDT 
//


package jsr352.batch.jsl;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExceptionClassFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionClassFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="include" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exclude" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionClassFilter", propOrder = {
    "include",
    "exclude"
})
@Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
public class ExceptionClassFilter {

    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected ExceptionClassFilter.Include include;
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    protected ExceptionClassFilter.Exclude exclude;

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionClassFilter.Include }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public ExceptionClassFilter.Include getInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionClassFilter.Include }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setInclude(ExceptionClassFilter.Include value) {
        this.include = value;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionClassFilter.Exclude }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public ExceptionClassFilter.Exclude getExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionClassFilter.Exclude }
     *     
     */
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public void setExclude(ExceptionClassFilter.Exclude value) {
        this.exclude = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public static class Exclude {

        @XmlAttribute(name = "class", required = true)
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        protected String clazz;

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        public String getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        public void setClazz(String value) {
            this.clazz = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
    public static class Include {

        @XmlAttribute(name = "class", required = true)
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        protected String clazz;

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        public String getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.ibm.jtc.jax.tools.xjc.Driver", date = "2012-10-01T03:04:46-04:00", comments = "JAXB RI v2.2.3-11/28/2011 06:21 AM(foreman)-")
        public void setClazz(String value) {
            this.clazz = value;
        }

    }

}

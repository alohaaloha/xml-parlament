//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.13 at 05:11:41 PM CEST 
//


package hello.entity.gov.gradskaskupstina;

import hello.entity.org.w3._2000._09.xmldsig.SignatureType;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="Naslov">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Deo" type="{http://www.gradskaskupstina.gov/}TDeo" maxOccurs="unbounded"/>
 *           &lt;element name="Glava" type="{http://www.gradskaskupstina.gov/}TGlava" maxOccurs="unbounded"/>
 *           &lt;element name="Clan" type="{http://www.gradskaskupstina.gov/}TClan" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="ZavrsniDeo" type="{http://www.gradskaskupstina.gov/}TZavrsniDeo"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"  minOccurs="0" maxOccurs="1"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"  minOccurs="0" maxOccurs="1"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "naslov",
    "documentId",
    "deo",
    "glava",
    "clan",
    "zavrsniDeo",
    "userName",
    "timeStamp",
    "signature"
})
@XmlRootElement(name = "Akt")
public class Akt {

    @XmlElement(name = "Naslov", required = true, defaultValue = "Akt")
    protected String naslov;
    @XmlElement(name = "DocumentId")
    protected String documentId;
    @XmlElement(name = "Deo")
    protected List<TDeo> deo;
    @XmlElement(name = "Glava")
    protected List<TGlava> glava;
    @XmlElement(name = "Clan")
    protected List<TClan> clan;
    @XmlElement(name = "ZavrsniDeo", required = true)
    protected TZavrsniDeo zavrsniDeo;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    /**
     * Gets the value of the naslov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaslov() {
        return naslov;
    }

    /**
     * Sets the value of the naslov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaslov(String value) {
        this.naslov = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the deo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDeo }
     * 
     * 
     */
    public List<TDeo> getDeo() {
        if (deo == null) {
            deo = new ArrayList<TDeo>();
        }
        return this.deo;
    }

    /**
     * Gets the value of the glava property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glava property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlava().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TGlava }
     * 
     * 
     */
    public List<TGlava> getGlava() {
        if (glava == null) {
            glava = new ArrayList<TGlava>();
        }
        return this.glava;
    }

    /**
     * Gets the value of the clan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TClan }
     * 
     * 
     */
    public List<TClan> getClan() {
        if (clan == null) {
            clan = new ArrayList<TClan>();
        }
        return this.clan;
    }

    /**
     * Gets the value of the zavrsniDeo property.
     * 
     * @return
     *     possible object is
     *     {@link TZavrsniDeo }
     *     
     */
    public TZavrsniDeo getZavrsniDeo() {
        return zavrsniDeo;
    }

    /**
     * Sets the value of the zavrsniDeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TZavrsniDeo }
     *     
     */
    public void setZavrsniDeo(TZavrsniDeo value) {
        this.zavrsniDeo = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}

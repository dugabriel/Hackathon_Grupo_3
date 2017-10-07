
package services.com.totvs.technology.ecm.workflow.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de webServiceMessage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="webServiceMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="documentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="foo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="webServiceMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webServiceMessage", propOrder = {
    "companyId",
    "documentDescription",
    "documentId",
    "foo",
    "version",
    "webServiceMessage"
})
public class WebServiceMessage {

    protected long companyId;
    protected String documentDescription;
    protected int documentId;
    @XmlElement(nillable = true)
    protected List<String> foo;
    protected int version;
    protected String webServiceMessage;

    /**
     * Obt�m o valor da propriedade companyId.
     * 
     */
    public long getCompanyId() {
        return companyId;
    }

    /**
     * Define o valor da propriedade companyId.
     * 
     */
    public void setCompanyId(long value) {
        this.companyId = value;
    }

    /**
     * Obt�m o valor da propriedade documentDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDescription() {
        return documentDescription;
    }

    /**
     * Define o valor da propriedade documentDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDescription(String value) {
        this.documentDescription = value;
    }

    /**
     * Obt�m o valor da propriedade documentId.
     * 
     */
    public int getDocumentId() {
        return documentId;
    }

    /**
     * Define o valor da propriedade documentId.
     * 
     */
    public void setDocumentId(int value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the foo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFoo() {
        if (foo == null) {
            foo = new ArrayList<String>();
        }
        return this.foo;
    }

    /**
     * Obt�m o valor da propriedade version.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

    /**
     * Obt�m o valor da propriedade webServiceMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebServiceMessage() {
        return webServiceMessage;
    }

    /**
     * Define o valor da propriedade webServiceMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebServiceMessage(String value) {
        this.webServiceMessage = value;
    }

}

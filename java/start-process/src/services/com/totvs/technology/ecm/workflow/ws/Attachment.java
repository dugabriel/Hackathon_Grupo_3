
package services.com.totvs.technology.ecm.workflow.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de attachment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="attachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attach" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="descriptor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="editing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSelected" type="{http://ws.workflow.ecm.technology.totvs.com/}attachment" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="filecontent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fullPatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iconPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pathName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachment", propOrder = {
    "attach",
    "descriptor",
    "editing",
    "fileName",
    "fileSelected",
    "fileSize",
    "filecontent",
    "fullPatch",
    "iconPath",
    "mobile",
    "pathName",
    "principal"
})
public class Attachment {

    protected Boolean attach;
    protected Boolean descriptor;
    protected Boolean editing;
    protected String fileName;
    protected Attachment fileSelected;
    protected long fileSize;
    protected byte[] filecontent;
    protected String fullPatch;
    protected String iconPath;
    protected Boolean mobile;
    protected String pathName;
    protected Boolean principal;

    /**
     * Obt�m o valor da propriedade attach.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttach() {
        return attach;
    }

    /**
     * Define o valor da propriedade attach.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttach(Boolean value) {
        this.attach = value;
    }

    /**
     * Obt�m o valor da propriedade descriptor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescriptor() {
        return descriptor;
    }

    /**
     * Define o valor da propriedade descriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescriptor(Boolean value) {
        this.descriptor = value;
    }

    /**
     * Obt�m o valor da propriedade editing.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditing() {
        return editing;
    }

    /**
     * Define o valor da propriedade editing.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditing(Boolean value) {
        this.editing = value;
    }

    /**
     * Obt�m o valor da propriedade fileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Define o valor da propriedade fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Obt�m o valor da propriedade fileSelected.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getFileSelected() {
        return fileSelected;
    }

    /**
     * Define o valor da propriedade fileSelected.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setFileSelected(Attachment value) {
        this.fileSelected = value;
    }

    /**
     * Obt�m o valor da propriedade fileSize.
     * 
     */
    public long getFileSize() {
        return fileSize;
    }

    /**
     * Define o valor da propriedade fileSize.
     * 
     */
    public void setFileSize(long value) {
        this.fileSize = value;
    }

    /**
     * Obt�m o valor da propriedade filecontent.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFilecontent() {
        return filecontent;
    }

    /**
     * Define o valor da propriedade filecontent.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFilecontent(byte[] value) {
        this.filecontent = value;
    }

    /**
     * Obt�m o valor da propriedade fullPatch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPatch() {
        return fullPatch;
    }

    /**
     * Define o valor da propriedade fullPatch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPatch(String value) {
        this.fullPatch = value;
    }

    /**
     * Obt�m o valor da propriedade iconPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * Define o valor da propriedade iconPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconPath(String value) {
        this.iconPath = value;
    }

    /**
     * Obt�m o valor da propriedade mobile.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobile() {
        return mobile;
    }

    /**
     * Define o valor da propriedade mobile.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobile(Boolean value) {
        this.mobile = value;
    }

    /**
     * Obt�m o valor da propriedade pathName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * Define o valor da propriedade pathName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathName(String value) {
        this.pathName = value;
    }

    /**
     * Obt�m o valor da propriedade principal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipal() {
        return principal;
    }

    /**
     * Define o valor da propriedade principal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipal(Boolean value) {
        this.principal = value;
    }

}


package services.com.totvs.technology.ecm.workflow.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de processAttachmentDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="processAttachmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="attachments" type="{http://ws.workflow.ecm.technology.totvs.com/}attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="colleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="crc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createDateTimestamp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newAttach" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="originalMovementSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processInstanceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processAttachmentDto", propOrder = {
    "attachmentSequence",
    "attachments",
    "colleagueId",
    "colleagueName",
    "companyId",
    "crc",
    "createDate",
    "createDateTimestamp",
    "deleted",
    "description",
    "documentId",
    "documentType",
    "fileName",
    "newAttach",
    "originalMovementSequence",
    "permission",
    "processInstanceId",
    "size",
    "version"
})
public class ProcessAttachmentDto {

    protected int attachmentSequence;
    @XmlElement(nillable = true)
    protected List<Attachment> attachments;
    protected String colleagueId;
    protected String colleagueName;
    protected long companyId;
    protected Long crc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected Long createDateTimestamp;
    protected Boolean deleted;
    protected String description;
    protected Integer documentId;
    protected String documentType;
    protected String fileName;
    protected Boolean newAttach;
    protected Integer originalMovementSequence;
    protected String permission;
    protected int processInstanceId;
    protected float size;
    protected Integer version;

    /**
     * Obt�m o valor da propriedade attachmentSequence.
     * 
     */
    public int getAttachmentSequence() {
        return attachmentSequence;
    }

    /**
     * Define o valor da propriedade attachmentSequence.
     * 
     */
    public void setAttachmentSequence(int value) {
        this.attachmentSequence = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<Attachment>();
        }
        return this.attachments;
    }

    /**
     * Obt�m o valor da propriedade colleagueId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleagueId() {
        return colleagueId;
    }

    /**
     * Define o valor da propriedade colleagueId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleagueId(String value) {
        this.colleagueId = value;
    }

    /**
     * Obt�m o valor da propriedade colleagueName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleagueName() {
        return colleagueName;
    }

    /**
     * Define o valor da propriedade colleagueName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleagueName(String value) {
        this.colleagueName = value;
    }

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
     * Obt�m o valor da propriedade crc.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCrc() {
        return crc;
    }

    /**
     * Define o valor da propriedade crc.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCrc(Long value) {
        this.crc = value;
    }

    /**
     * Obt�m o valor da propriedade createDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Define o valor da propriedade createDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Obt�m o valor da propriedade createDateTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreateDateTimestamp() {
        return createDateTimestamp;
    }

    /**
     * Define o valor da propriedade createDateTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreateDateTimestamp(Long value) {
        this.createDateTimestamp = value;
    }

    /**
     * Obt�m o valor da propriedade deleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * Define o valor da propriedade deleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleted(Boolean value) {
        this.deleted = value;
    }

    /**
     * Obt�m o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obt�m o valor da propriedade documentId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentId() {
        return documentId;
    }

    /**
     * Define o valor da propriedade documentId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentId(Integer value) {
        this.documentId = value;
    }

    /**
     * Obt�m o valor da propriedade documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define o valor da propriedade documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
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
     * Obt�m o valor da propriedade newAttach.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewAttach() {
        return newAttach;
    }

    /**
     * Define o valor da propriedade newAttach.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAttach(Boolean value) {
        this.newAttach = value;
    }

    /**
     * Obt�m o valor da propriedade originalMovementSequence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginalMovementSequence() {
        return originalMovementSequence;
    }

    /**
     * Define o valor da propriedade originalMovementSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginalMovementSequence(Integer value) {
        this.originalMovementSequence = value;
    }

    /**
     * Obt�m o valor da propriedade permission.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermission() {
        return permission;
    }

    /**
     * Define o valor da propriedade permission.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermission(String value) {
        this.permission = value;
    }

    /**
     * Obt�m o valor da propriedade processInstanceId.
     * 
     */
    public int getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * Define o valor da propriedade processInstanceId.
     * 
     */
    public void setProcessInstanceId(int value) {
        this.processInstanceId = value;
    }

    /**
     * Obt�m o valor da propriedade size.
     * 
     */
    public float getSize() {
        return size;
    }

    /**
     * Define o valor da propriedade size.
     * 
     */
    public void setSize(float value) {
        this.size = value;
    }

    /**
     * Obt�m o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

}

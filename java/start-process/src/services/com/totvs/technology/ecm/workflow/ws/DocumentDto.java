
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
 * <p>Classe Java de documentDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="documentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="activeUserApprover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="activeVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="additionalComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowMuiltiCardsPerUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approvalAndOr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approvedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="articleContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://ws.workflow.ecm.technology.totvs.com/}attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="atualizationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="backgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backgroundImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bannerImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="crc" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createDateInMilliseconds" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="datasetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateFormStarted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="documentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="documentKeyWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentPropertyNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="documentPropertyVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downloadEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="draft" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expiredForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="favorite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fileURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="forAproval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="iconId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="iconPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imutable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indexed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="inheritSecurity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="internalVisualizer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEncrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="keyWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaListId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="metaListRecordId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="newStructure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="onCheckout" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parentDocumentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pdfRenderEngine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="phisicalFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phisicalFileSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="privateColleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="privateDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="protectedCopy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="publisherId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedFiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restrictionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="securityLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sociableDocumentDto" type="{http://ws.workflow.ecm.technology.totvs.com/}sociableDocumentDto" minOccurs="0"/>
 *         &lt;element name="socialDocument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="topicId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="translated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateIsoProperties" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="userAnswerForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userNotify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="userPermission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="validationStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="versionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versionOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visualization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volumeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentDto", propOrder = {
    "accessCount",
    "activeUserApprover",
    "activeVersion",
    "additionalComments",
    "allowMuiltiCardsPerUser",
    "approvalAndOr",
    "approved",
    "approvedDate",
    "articleContent",
    "attachments",
    "atualizationId",
    "backgroundColor",
    "backgroundImage",
    "bannerImage",
    "cardDescription",
    "colleagueId",
    "colleagueName",
    "companyId",
    "crc",
    "createDate",
    "createDateInMilliseconds",
    "datasetName",
    "dateFormStarted",
    "deleted",
    "documentDescription",
    "documentId",
    "documentKeyWord",
    "documentPropertyNumber",
    "documentPropertyVersion",
    "documentType",
    "documentTypeId",
    "downloadEnabled",
    "draft",
    "expirationDate",
    "expiredForm",
    "expires",
    "externalDocumentId",
    "favorite",
    "fileURL",
    "folderId",
    "forAproval",
    "iconId",
    "iconPath",
    "imutable",
    "indexed",
    "inheritSecurity",
    "internalVisualizer",
    "isEncrypted",
    "keyWord",
    "languageId",
    "languageIndicator",
    "lastModifiedDate",
    "lastModifiedTime",
    "metaListId",
    "metaListRecordId",
    "newStructure",
    "onCheckout",
    "parentDocumentId",
    "pdfRenderEngine",
    "permissionType",
    "phisicalFile",
    "phisicalFileSize",
    "priority",
    "privateColleagueId",
    "privateDocument",
    "protectedCopy",
    "publisherId",
    "publisherName",
    "relatedFiles",
    "restrictionType",
    "rowId",
    "searchNumber",
    "securityLevel",
    "siteCode",
    "sociableDocumentDto",
    "socialDocument",
    "tool",
    "topicId",
    "translated",
    "uuid",
    "updateIsoProperties",
    "userAnswerForm",
    "userNotify",
    "userPermission",
    "validationStartDate",
    "version",
    "versionDescription",
    "versionOption",
    "visualization",
    "volumeId"
})
public class DocumentDto {

    protected Integer accessCount;
    protected Boolean activeUserApprover;
    protected Boolean activeVersion;
    protected String additionalComments;
    protected Boolean allowMuiltiCardsPerUser;
    protected Boolean approvalAndOr;
    protected Boolean approved;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvedDate;
    protected String articleContent;
    @XmlElement(nillable = true)
    protected List<Attachment> attachments;
    protected Integer atualizationId;
    protected String backgroundColor;
    protected String backgroundImage;
    protected String bannerImage;
    protected String cardDescription;
    protected String colleagueId;
    protected String colleagueName;
    protected long companyId;
    protected Long crc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected long createDateInMilliseconds;
    protected String datasetName;
    protected Boolean dateFormStarted;
    protected Boolean deleted;
    protected String documentDescription;
    protected Integer documentId;
    protected String documentKeyWord;
    protected Integer documentPropertyNumber;
    protected Integer documentPropertyVersion;
    protected String documentType;
    protected String documentTypeId;
    protected Boolean downloadEnabled;
    protected Boolean draft;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected Boolean expiredForm;
    protected Boolean expires;
    protected String externalDocumentId;
    protected Boolean favorite;
    protected String fileURL;
    protected Integer folderId;
    protected boolean forAproval;
    protected Integer iconId;
    protected String iconPath;
    protected Boolean imutable;
    protected Boolean indexed;
    protected boolean inheritSecurity;
    protected Boolean internalVisualizer;
    protected Boolean isEncrypted;
    protected String keyWord;
    protected String languageId;
    protected String languageIndicator;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected String lastModifiedTime;
    protected Integer metaListId;
    protected Integer metaListRecordId;
    protected Boolean newStructure;
    protected boolean onCheckout;
    protected Integer parentDocumentId;
    protected String pdfRenderEngine;
    protected Integer permissionType;
    protected String phisicalFile;
    protected Float phisicalFileSize;
    protected Integer priority;
    protected String privateColleagueId;
    protected Boolean privateDocument;
    protected Boolean protectedCopy;
    protected String publisherId;
    protected String publisherName;
    protected String relatedFiles;
    protected Integer restrictionType;
    protected int rowId;
    protected Integer searchNumber;
    protected int securityLevel;
    protected String siteCode;
    protected SociableDocumentDto sociableDocumentDto;
    protected String socialDocument;
    protected Boolean tool;
    protected Integer topicId;
    protected boolean translated;
    @XmlElement(name = "UUID")
    protected String uuid;
    protected boolean updateIsoProperties;
    protected Boolean userAnswerForm;
    protected Boolean userNotify;
    protected Integer userPermission;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validationStartDate;
    protected int version;
    protected String versionDescription;
    protected String versionOption;
    protected String visualization;
    protected String volumeId;

    /**
     * Obt�m o valor da propriedade accessCount.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessCount() {
        return accessCount;
    }

    /**
     * Define o valor da propriedade accessCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessCount(Integer value) {
        this.accessCount = value;
    }

    /**
     * Obt�m o valor da propriedade activeUserApprover.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveUserApprover() {
        return activeUserApprover;
    }

    /**
     * Define o valor da propriedade activeUserApprover.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveUserApprover(Boolean value) {
        this.activeUserApprover = value;
    }

    /**
     * Obt�m o valor da propriedade activeVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveVersion() {
        return activeVersion;
    }

    /**
     * Define o valor da propriedade activeVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveVersion(Boolean value) {
        this.activeVersion = value;
    }

    /**
     * Obt�m o valor da propriedade additionalComments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalComments() {
        return additionalComments;
    }

    /**
     * Define o valor da propriedade additionalComments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalComments(String value) {
        this.additionalComments = value;
    }

    /**
     * Obt�m o valor da propriedade allowMuiltiCardsPerUser.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowMuiltiCardsPerUser() {
        return allowMuiltiCardsPerUser;
    }

    /**
     * Define o valor da propriedade allowMuiltiCardsPerUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowMuiltiCardsPerUser(Boolean value) {
        this.allowMuiltiCardsPerUser = value;
    }

    /**
     * Obt�m o valor da propriedade approvalAndOr.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApprovalAndOr() {
        return approvalAndOr;
    }

    /**
     * Define o valor da propriedade approvalAndOr.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApprovalAndOr(Boolean value) {
        this.approvalAndOr = value;
    }

    /**
     * Obt�m o valor da propriedade approved.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * Define o valor da propriedade approved.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproved(Boolean value) {
        this.approved = value;
    }

    /**
     * Obt�m o valor da propriedade approvedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovedDate() {
        return approvedDate;
    }

    /**
     * Define o valor da propriedade approvedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovedDate(XMLGregorianCalendar value) {
        this.approvedDate = value;
    }

    /**
     * Obt�m o valor da propriedade articleContent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * Define o valor da propriedade articleContent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleContent(String value) {
        this.articleContent = value;
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
     * Obt�m o valor da propriedade atualizationId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAtualizationId() {
        return atualizationId;
    }

    /**
     * Define o valor da propriedade atualizationId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAtualizationId(Integer value) {
        this.atualizationId = value;
    }

    /**
     * Obt�m o valor da propriedade backgroundColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Define o valor da propriedade backgroundColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Obt�m o valor da propriedade backgroundImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * Define o valor da propriedade backgroundImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundImage(String value) {
        this.backgroundImage = value;
    }

    /**
     * Obt�m o valor da propriedade bannerImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBannerImage() {
        return bannerImage;
    }

    /**
     * Define o valor da propriedade bannerImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBannerImage(String value) {
        this.bannerImage = value;
    }

    /**
     * Obt�m o valor da propriedade cardDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDescription() {
        return cardDescription;
    }

    /**
     * Define o valor da propriedade cardDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDescription(String value) {
        this.cardDescription = value;
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
     * Obt�m o valor da propriedade createDateInMilliseconds.
     * 
     */
    public long getCreateDateInMilliseconds() {
        return createDateInMilliseconds;
    }

    /**
     * Define o valor da propriedade createDateInMilliseconds.
     * 
     */
    public void setCreateDateInMilliseconds(long value) {
        this.createDateInMilliseconds = value;
    }

    /**
     * Obt�m o valor da propriedade datasetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * Define o valor da propriedade datasetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetName(String value) {
        this.datasetName = value;
    }

    /**
     * Obt�m o valor da propriedade dateFormStarted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateFormStarted() {
        return dateFormStarted;
    }

    /**
     * Define o valor da propriedade dateFormStarted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateFormStarted(Boolean value) {
        this.dateFormStarted = value;
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
     * Obt�m o valor da propriedade documentKeyWord.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentKeyWord() {
        return documentKeyWord;
    }

    /**
     * Define o valor da propriedade documentKeyWord.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentKeyWord(String value) {
        this.documentKeyWord = value;
    }

    /**
     * Obt�m o valor da propriedade documentPropertyNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentPropertyNumber() {
        return documentPropertyNumber;
    }

    /**
     * Define o valor da propriedade documentPropertyNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentPropertyNumber(Integer value) {
        this.documentPropertyNumber = value;
    }

    /**
     * Obt�m o valor da propriedade documentPropertyVersion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentPropertyVersion() {
        return documentPropertyVersion;
    }

    /**
     * Define o valor da propriedade documentPropertyVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentPropertyVersion(Integer value) {
        this.documentPropertyVersion = value;
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
     * Obt�m o valor da propriedade documentTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeId() {
        return documentTypeId;
    }

    /**
     * Define o valor da propriedade documentTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeId(String value) {
        this.documentTypeId = value;
    }

    /**
     * Obt�m o valor da propriedade downloadEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDownloadEnabled() {
        return downloadEnabled;
    }

    /**
     * Define o valor da propriedade downloadEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDownloadEnabled(Boolean value) {
        this.downloadEnabled = value;
    }

    /**
     * Obt�m o valor da propriedade draft.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDraft() {
        return draft;
    }

    /**
     * Define o valor da propriedade draft.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDraft(Boolean value) {
        this.draft = value;
    }

    /**
     * Obt�m o valor da propriedade expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define o valor da propriedade expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obt�m o valor da propriedade expiredForm.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpiredForm() {
        return expiredForm;
    }

    /**
     * Define o valor da propriedade expiredForm.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpiredForm(Boolean value) {
        this.expiredForm = value;
    }

    /**
     * Obt�m o valor da propriedade expires.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpires() {
        return expires;
    }

    /**
     * Define o valor da propriedade expires.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpires(Boolean value) {
        this.expires = value;
    }

    /**
     * Obt�m o valor da propriedade externalDocumentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDocumentId() {
        return externalDocumentId;
    }

    /**
     * Define o valor da propriedade externalDocumentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDocumentId(String value) {
        this.externalDocumentId = value;
    }

    /**
     * Obt�m o valor da propriedade favorite.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFavorite() {
        return favorite;
    }

    /**
     * Define o valor da propriedade favorite.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFavorite(Boolean value) {
        this.favorite = value;
    }

    /**
     * Obt�m o valor da propriedade fileURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileURL() {
        return fileURL;
    }

    /**
     * Define o valor da propriedade fileURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileURL(String value) {
        this.fileURL = value;
    }

    /**
     * Obt�m o valor da propriedade folderId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     * Define o valor da propriedade folderId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderId(Integer value) {
        this.folderId = value;
    }

    /**
     * Obt�m o valor da propriedade forAproval.
     * 
     */
    public boolean isForAproval() {
        return forAproval;
    }

    /**
     * Define o valor da propriedade forAproval.
     * 
     */
    public void setForAproval(boolean value) {
        this.forAproval = value;
    }

    /**
     * Obt�m o valor da propriedade iconId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIconId() {
        return iconId;
    }

    /**
     * Define o valor da propriedade iconId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIconId(Integer value) {
        this.iconId = value;
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
     * Obt�m o valor da propriedade imutable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImutable() {
        return imutable;
    }

    /**
     * Define o valor da propriedade imutable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImutable(Boolean value) {
        this.imutable = value;
    }

    /**
     * Obt�m o valor da propriedade indexed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndexed() {
        return indexed;
    }

    /**
     * Define o valor da propriedade indexed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndexed(Boolean value) {
        this.indexed = value;
    }

    /**
     * Obt�m o valor da propriedade inheritSecurity.
     * 
     */
    public boolean isInheritSecurity() {
        return inheritSecurity;
    }

    /**
     * Define o valor da propriedade inheritSecurity.
     * 
     */
    public void setInheritSecurity(boolean value) {
        this.inheritSecurity = value;
    }

    /**
     * Obt�m o valor da propriedade internalVisualizer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternalVisualizer() {
        return internalVisualizer;
    }

    /**
     * Define o valor da propriedade internalVisualizer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternalVisualizer(Boolean value) {
        this.internalVisualizer = value;
    }

    /**
     * Obt�m o valor da propriedade isEncrypted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEncrypted() {
        return isEncrypted;
    }

    /**
     * Define o valor da propriedade isEncrypted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEncrypted(Boolean value) {
        this.isEncrypted = value;
    }

    /**
     * Obt�m o valor da propriedade keyWord.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * Define o valor da propriedade keyWord.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyWord(String value) {
        this.keyWord = value;
    }

    /**
     * Obt�m o valor da propriedade languageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageId() {
        return languageId;
    }

    /**
     * Define o valor da propriedade languageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageId(String value) {
        this.languageId = value;
    }

    /**
     * Obt�m o valor da propriedade languageIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageIndicator() {
        return languageIndicator;
    }

    /**
     * Define o valor da propriedade languageIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageIndicator(String value) {
        this.languageIndicator = value;
    }

    /**
     * Obt�m o valor da propriedade lastModifiedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Define o valor da propriedade lastModifiedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Obt�m o valor da propriedade lastModifiedTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Define o valor da propriedade lastModifiedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedTime(String value) {
        this.lastModifiedTime = value;
    }

    /**
     * Obt�m o valor da propriedade metaListId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMetaListId() {
        return metaListId;
    }

    /**
     * Define o valor da propriedade metaListId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMetaListId(Integer value) {
        this.metaListId = value;
    }

    /**
     * Obt�m o valor da propriedade metaListRecordId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMetaListRecordId() {
        return metaListRecordId;
    }

    /**
     * Define o valor da propriedade metaListRecordId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMetaListRecordId(Integer value) {
        this.metaListRecordId = value;
    }

    /**
     * Obt�m o valor da propriedade newStructure.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewStructure() {
        return newStructure;
    }

    /**
     * Define o valor da propriedade newStructure.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewStructure(Boolean value) {
        this.newStructure = value;
    }

    /**
     * Obt�m o valor da propriedade onCheckout.
     * 
     */
    public boolean isOnCheckout() {
        return onCheckout;
    }

    /**
     * Define o valor da propriedade onCheckout.
     * 
     */
    public void setOnCheckout(boolean value) {
        this.onCheckout = value;
    }

    /**
     * Obt�m o valor da propriedade parentDocumentId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentDocumentId() {
        return parentDocumentId;
    }

    /**
     * Define o valor da propriedade parentDocumentId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentDocumentId(Integer value) {
        this.parentDocumentId = value;
    }

    /**
     * Obt�m o valor da propriedade pdfRenderEngine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfRenderEngine() {
        return pdfRenderEngine;
    }

    /**
     * Define o valor da propriedade pdfRenderEngine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfRenderEngine(String value) {
        this.pdfRenderEngine = value;
    }

    /**
     * Obt�m o valor da propriedade permissionType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPermissionType() {
        return permissionType;
    }

    /**
     * Define o valor da propriedade permissionType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPermissionType(Integer value) {
        this.permissionType = value;
    }

    /**
     * Obt�m o valor da propriedade phisicalFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhisicalFile() {
        return phisicalFile;
    }

    /**
     * Define o valor da propriedade phisicalFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhisicalFile(String value) {
        this.phisicalFile = value;
    }

    /**
     * Obt�m o valor da propriedade phisicalFileSize.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPhisicalFileSize() {
        return phisicalFileSize;
    }

    /**
     * Define o valor da propriedade phisicalFileSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPhisicalFileSize(Float value) {
        this.phisicalFileSize = value;
    }

    /**
     * Obt�m o valor da propriedade priority.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Define o valor da propriedade priority.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Obt�m o valor da propriedade privateColleagueId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateColleagueId() {
        return privateColleagueId;
    }

    /**
     * Define o valor da propriedade privateColleagueId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateColleagueId(String value) {
        this.privateColleagueId = value;
    }

    /**
     * Obt�m o valor da propriedade privateDocument.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateDocument() {
        return privateDocument;
    }

    /**
     * Define o valor da propriedade privateDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivateDocument(Boolean value) {
        this.privateDocument = value;
    }

    /**
     * Obt�m o valor da propriedade protectedCopy.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtectedCopy() {
        return protectedCopy;
    }

    /**
     * Define o valor da propriedade protectedCopy.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtectedCopy(Boolean value) {
        this.protectedCopy = value;
    }

    /**
     * Obt�m o valor da propriedade publisherId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherId() {
        return publisherId;
    }

    /**
     * Define o valor da propriedade publisherId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherId(String value) {
        this.publisherId = value;
    }

    /**
     * Obt�m o valor da propriedade publisherName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Define o valor da propriedade publisherName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    /**
     * Obt�m o valor da propriedade relatedFiles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedFiles() {
        return relatedFiles;
    }

    /**
     * Define o valor da propriedade relatedFiles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedFiles(String value) {
        this.relatedFiles = value;
    }

    /**
     * Obt�m o valor da propriedade restrictionType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionType() {
        return restrictionType;
    }

    /**
     * Define o valor da propriedade restrictionType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionType(Integer value) {
        this.restrictionType = value;
    }

    /**
     * Obt�m o valor da propriedade rowId.
     * 
     */
    public int getRowId() {
        return rowId;
    }

    /**
     * Define o valor da propriedade rowId.
     * 
     */
    public void setRowId(int value) {
        this.rowId = value;
    }

    /**
     * Obt�m o valor da propriedade searchNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchNumber() {
        return searchNumber;
    }

    /**
     * Define o valor da propriedade searchNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchNumber(Integer value) {
        this.searchNumber = value;
    }

    /**
     * Obt�m o valor da propriedade securityLevel.
     * 
     */
    public int getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Define o valor da propriedade securityLevel.
     * 
     */
    public void setSecurityLevel(int value) {
        this.securityLevel = value;
    }

    /**
     * Obt�m o valor da propriedade siteCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Define o valor da propriedade siteCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCode(String value) {
        this.siteCode = value;
    }

    /**
     * Obt�m o valor da propriedade sociableDocumentDto.
     * 
     * @return
     *     possible object is
     *     {@link SociableDocumentDto }
     *     
     */
    public SociableDocumentDto getSociableDocumentDto() {
        return sociableDocumentDto;
    }

    /**
     * Define o valor da propriedade sociableDocumentDto.
     * 
     * @param value
     *     allowed object is
     *     {@link SociableDocumentDto }
     *     
     */
    public void setSociableDocumentDto(SociableDocumentDto value) {
        this.sociableDocumentDto = value;
    }

    /**
     * Obt�m o valor da propriedade socialDocument.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialDocument() {
        return socialDocument;
    }

    /**
     * Define o valor da propriedade socialDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialDocument(String value) {
        this.socialDocument = value;
    }

    /**
     * Obt�m o valor da propriedade tool.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTool() {
        return tool;
    }

    /**
     * Define o valor da propriedade tool.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTool(Boolean value) {
        this.tool = value;
    }

    /**
     * Obt�m o valor da propriedade topicId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     * Define o valor da propriedade topicId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopicId(Integer value) {
        this.topicId = value;
    }

    /**
     * Obt�m o valor da propriedade translated.
     * 
     */
    public boolean isTranslated() {
        return translated;
    }

    /**
     * Define o valor da propriedade translated.
     * 
     */
    public void setTranslated(boolean value) {
        this.translated = value;
    }

    /**
     * Obt�m o valor da propriedade uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Define o valor da propriedade uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Obt�m o valor da propriedade updateIsoProperties.
     * 
     */
    public boolean isUpdateIsoProperties() {
        return updateIsoProperties;
    }

    /**
     * Define o valor da propriedade updateIsoProperties.
     * 
     */
    public void setUpdateIsoProperties(boolean value) {
        this.updateIsoProperties = value;
    }

    /**
     * Obt�m o valor da propriedade userAnswerForm.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserAnswerForm() {
        return userAnswerForm;
    }

    /**
     * Define o valor da propriedade userAnswerForm.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserAnswerForm(Boolean value) {
        this.userAnswerForm = value;
    }

    /**
     * Obt�m o valor da propriedade userNotify.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserNotify() {
        return userNotify;
    }

    /**
     * Define o valor da propriedade userNotify.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserNotify(Boolean value) {
        this.userNotify = value;
    }

    /**
     * Obt�m o valor da propriedade userPermission.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserPermission() {
        return userPermission;
    }

    /**
     * Define o valor da propriedade userPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserPermission(Integer value) {
        this.userPermission = value;
    }

    /**
     * Obt�m o valor da propriedade validationStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidationStartDate() {
        return validationStartDate;
    }

    /**
     * Define o valor da propriedade validationStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidationStartDate(XMLGregorianCalendar value) {
        this.validationStartDate = value;
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
     * Obt�m o valor da propriedade versionDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * Define o valor da propriedade versionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionDescription(String value) {
        this.versionDescription = value;
    }

    /**
     * Obt�m o valor da propriedade versionOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionOption() {
        return versionOption;
    }

    /**
     * Define o valor da propriedade versionOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionOption(String value) {
        this.versionOption = value;
    }

    /**
     * Obt�m o valor da propriedade visualization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualization() {
        return visualization;
    }

    /**
     * Define o valor da propriedade visualization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualization(String value) {
        this.visualization = value;
    }

    /**
     * Obt�m o valor da propriedade volumeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * Define o valor da propriedade volumeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeId(String value) {
        this.volumeId = value;
    }

}

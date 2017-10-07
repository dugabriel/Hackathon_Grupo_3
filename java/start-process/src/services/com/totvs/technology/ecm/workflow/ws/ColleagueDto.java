
package services.com.totvs.technology.ecm.workflow.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de colleagueDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="colleagueDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adminUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="area1Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="area2Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="area3Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="area4Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="area5Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="colleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleaguebackground" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="currentProject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dialectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecmVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailHtml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="especializationArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gedUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guestUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="homePage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxPrivateSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="menuConfig" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nominalUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="passwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="photoPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usedSpace" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "colleagueDto", propOrder = {
    "active",
    "adminUser",
    "area1Id",
    "area2Id",
    "area3Id",
    "area4Id",
    "area5Id",
    "colleagueId",
    "colleagueName",
    "colleaguebackground",
    "companyId",
    "currentProject",
    "defaultLanguage",
    "dialectId",
    "ecmVersion",
    "emailHtml",
    "especializationArea",
    "extensionNr",
    "gedUser",
    "groupId",
    "guestUser",
    "homePage",
    "login",
    "mail",
    "maxPrivateSize",
    "menuConfig",
    "nominalUser",
    "passwd",
    "photoPath",
    "rowId",
    "sessionId",
    "usedSpace",
    "volumeId"
})
public class ColleagueDto {

    protected Boolean active;
    protected Boolean adminUser;
    protected Integer area1Id;
    protected Integer area2Id;
    protected Integer area3Id;
    protected Integer area4Id;
    protected Integer area5Id;
    protected String colleagueId;
    protected String colleagueName;
    protected String colleaguebackground;
    protected long companyId;
    protected String currentProject;
    protected String defaultLanguage;
    protected String dialectId;
    protected String ecmVersion;
    protected Boolean emailHtml;
    protected String especializationArea;
    protected String extensionNr;
    protected Boolean gedUser;
    protected String groupId;
    protected Boolean guestUser;
    protected String homePage;
    protected String login;
    protected String mail;
    protected Float maxPrivateSize;
    protected Integer menuConfig;
    protected Boolean nominalUser;
    protected String passwd;
    protected String photoPath;
    protected int rowId;
    protected String sessionId;
    protected Float usedSpace;
    protected String volumeId;

    /**
     * Obt�m o valor da propriedade active.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Define o valor da propriedade active.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Obt�m o valor da propriedade adminUser.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdminUser() {
        return adminUser;
    }

    /**
     * Define o valor da propriedade adminUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdminUser(Boolean value) {
        this.adminUser = value;
    }

    /**
     * Obt�m o valor da propriedade area1Id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea1Id() {
        return area1Id;
    }

    /**
     * Define o valor da propriedade area1Id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea1Id(Integer value) {
        this.area1Id = value;
    }

    /**
     * Obt�m o valor da propriedade area2Id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea2Id() {
        return area2Id;
    }

    /**
     * Define o valor da propriedade area2Id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea2Id(Integer value) {
        this.area2Id = value;
    }

    /**
     * Obt�m o valor da propriedade area3Id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea3Id() {
        return area3Id;
    }

    /**
     * Define o valor da propriedade area3Id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea3Id(Integer value) {
        this.area3Id = value;
    }

    /**
     * Obt�m o valor da propriedade area4Id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea4Id() {
        return area4Id;
    }

    /**
     * Define o valor da propriedade area4Id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea4Id(Integer value) {
        this.area4Id = value;
    }

    /**
     * Obt�m o valor da propriedade area5Id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArea5Id() {
        return area5Id;
    }

    /**
     * Define o valor da propriedade area5Id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArea5Id(Integer value) {
        this.area5Id = value;
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
     * Obt�m o valor da propriedade colleaguebackground.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleaguebackground() {
        return colleaguebackground;
    }

    /**
     * Define o valor da propriedade colleaguebackground.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleaguebackground(String value) {
        this.colleaguebackground = value;
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
     * Obt�m o valor da propriedade currentProject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentProject() {
        return currentProject;
    }

    /**
     * Define o valor da propriedade currentProject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentProject(String value) {
        this.currentProject = value;
    }

    /**
     * Obt�m o valor da propriedade defaultLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Define o valor da propriedade defaultLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    /**
     * Obt�m o valor da propriedade dialectId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialectId() {
        return dialectId;
    }

    /**
     * Define o valor da propriedade dialectId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialectId(String value) {
        this.dialectId = value;
    }

    /**
     * Obt�m o valor da propriedade ecmVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcmVersion() {
        return ecmVersion;
    }

    /**
     * Define o valor da propriedade ecmVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcmVersion(String value) {
        this.ecmVersion = value;
    }

    /**
     * Obt�m o valor da propriedade emailHtml.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailHtml() {
        return emailHtml;
    }

    /**
     * Define o valor da propriedade emailHtml.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailHtml(Boolean value) {
        this.emailHtml = value;
    }

    /**
     * Obt�m o valor da propriedade especializationArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecializationArea() {
        return especializationArea;
    }

    /**
     * Define o valor da propriedade especializationArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecializationArea(String value) {
        this.especializationArea = value;
    }

    /**
     * Obt�m o valor da propriedade extensionNr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionNr() {
        return extensionNr;
    }

    /**
     * Define o valor da propriedade extensionNr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionNr(String value) {
        this.extensionNr = value;
    }

    /**
     * Obt�m o valor da propriedade gedUser.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGedUser() {
        return gedUser;
    }

    /**
     * Define o valor da propriedade gedUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGedUser(Boolean value) {
        this.gedUser = value;
    }

    /**
     * Obt�m o valor da propriedade groupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Define o valor da propriedade groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Obt�m o valor da propriedade guestUser.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestUser() {
        return guestUser;
    }

    /**
     * Define o valor da propriedade guestUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestUser(Boolean value) {
        this.guestUser = value;
    }

    /**
     * Obt�m o valor da propriedade homePage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePage() {
        return homePage;
    }

    /**
     * Define o valor da propriedade homePage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePage(String value) {
        this.homePage = value;
    }

    /**
     * Obt�m o valor da propriedade login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o valor da propriedade login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obt�m o valor da propriedade mail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Define o valor da propriedade mail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Obt�m o valor da propriedade maxPrivateSize.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxPrivateSize() {
        return maxPrivateSize;
    }

    /**
     * Define o valor da propriedade maxPrivateSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxPrivateSize(Float value) {
        this.maxPrivateSize = value;
    }

    /**
     * Obt�m o valor da propriedade menuConfig.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMenuConfig() {
        return menuConfig;
    }

    /**
     * Define o valor da propriedade menuConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMenuConfig(Integer value) {
        this.menuConfig = value;
    }

    /**
     * Obt�m o valor da propriedade nominalUser.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNominalUser() {
        return nominalUser;
    }

    /**
     * Define o valor da propriedade nominalUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNominalUser(Boolean value) {
        this.nominalUser = value;
    }

    /**
     * Obt�m o valor da propriedade passwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * Define o valor da propriedade passwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswd(String value) {
        this.passwd = value;
    }

    /**
     * Obt�m o valor da propriedade photoPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     * Define o valor da propriedade photoPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoPath(String value) {
        this.photoPath = value;
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
     * Obt�m o valor da propriedade sessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Define o valor da propriedade sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Obt�m o valor da propriedade usedSpace.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUsedSpace() {
        return usedSpace;
    }

    /**
     * Define o valor da propriedade usedSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUsedSpace(Float value) {
        this.usedSpace = value;
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

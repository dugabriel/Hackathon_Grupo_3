
package services.com.totvs.technology.ecm.workflow.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sociableDocumentDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sociableDocumentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commented" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="denounced" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="following" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="liked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numberComments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberDenouncements" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberFollows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberLikes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberShares" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="shared" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sociableId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "sociableDocumentDto", propOrder = {
    "commented",
    "denounced",
    "documentId",
    "following",
    "liked",
    "numberComments",
    "numberDenouncements",
    "numberFollows",
    "numberLikes",
    "numberShares",
    "shared",
    "sociableId",
    "version"
})
public class SociableDocumentDto {

    protected boolean commented;
    protected boolean denounced;
    protected Integer documentId;
    protected boolean following;
    protected boolean liked;
    protected Integer numberComments;
    protected Integer numberDenouncements;
    protected Integer numberFollows;
    protected Integer numberLikes;
    protected Integer numberShares;
    protected boolean shared;
    protected Long sociableId;
    protected Integer version;

    /**
     * Obt�m o valor da propriedade commented.
     * 
     */
    public boolean isCommented() {
        return commented;
    }

    /**
     * Define o valor da propriedade commented.
     * 
     */
    public void setCommented(boolean value) {
        this.commented = value;
    }

    /**
     * Obt�m o valor da propriedade denounced.
     * 
     */
    public boolean isDenounced() {
        return denounced;
    }

    /**
     * Define o valor da propriedade denounced.
     * 
     */
    public void setDenounced(boolean value) {
        this.denounced = value;
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
     * Obt�m o valor da propriedade following.
     * 
     */
    public boolean isFollowing() {
        return following;
    }

    /**
     * Define o valor da propriedade following.
     * 
     */
    public void setFollowing(boolean value) {
        this.following = value;
    }

    /**
     * Obt�m o valor da propriedade liked.
     * 
     */
    public boolean isLiked() {
        return liked;
    }

    /**
     * Define o valor da propriedade liked.
     * 
     */
    public void setLiked(boolean value) {
        this.liked = value;
    }

    /**
     * Obt�m o valor da propriedade numberComments.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberComments() {
        return numberComments;
    }

    /**
     * Define o valor da propriedade numberComments.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberComments(Integer value) {
        this.numberComments = value;
    }

    /**
     * Obt�m o valor da propriedade numberDenouncements.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDenouncements() {
        return numberDenouncements;
    }

    /**
     * Define o valor da propriedade numberDenouncements.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDenouncements(Integer value) {
        this.numberDenouncements = value;
    }

    /**
     * Obt�m o valor da propriedade numberFollows.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberFollows() {
        return numberFollows;
    }

    /**
     * Define o valor da propriedade numberFollows.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberFollows(Integer value) {
        this.numberFollows = value;
    }

    /**
     * Obt�m o valor da propriedade numberLikes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberLikes() {
        return numberLikes;
    }

    /**
     * Define o valor da propriedade numberLikes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberLikes(Integer value) {
        this.numberLikes = value;
    }

    /**
     * Obt�m o valor da propriedade numberShares.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberShares() {
        return numberShares;
    }

    /**
     * Define o valor da propriedade numberShares.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberShares(Integer value) {
        this.numberShares = value;
    }

    /**
     * Obt�m o valor da propriedade shared.
     * 
     */
    public boolean isShared() {
        return shared;
    }

    /**
     * Define o valor da propriedade shared.
     * 
     */
    public void setShared(boolean value) {
        this.shared = value;
    }

    /**
     * Obt�m o valor da propriedade sociableId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSociableId() {
        return sociableId;
    }

    /**
     * Define o valor da propriedade sociableId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSociableId(Long value) {
        this.sociableId = value;
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

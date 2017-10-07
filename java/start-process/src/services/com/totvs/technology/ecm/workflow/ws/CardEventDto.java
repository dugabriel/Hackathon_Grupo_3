
package services.com.totvs.technology.ecm.workflow.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cardEventDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cardEventDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventVersAnt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardEventDto", propOrder = {
    "eventDescription",
    "eventId",
    "eventVersAnt"
})
public class CardEventDto {

    protected String eventDescription;
    protected String eventId;
    protected Boolean eventVersAnt;

    /**
     * Obt�m o valor da propriedade eventDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Define o valor da propriedade eventDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDescription(String value) {
        this.eventDescription = value;
    }

    /**
     * Obt�m o valor da propriedade eventId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Define o valor da propriedade eventId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Obt�m o valor da propriedade eventVersAnt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventVersAnt() {
        return eventVersAnt;
    }

    /**
     * Define o valor da propriedade eventVersAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventVersAnt(Boolean value) {
        this.eventVersAnt = value;
    }

}

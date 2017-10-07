
package services.com.totvs.technology.ecm.workflow.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de processTaskAppointmentDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="processTaskAppointmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appointmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="appointmentSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="appointmentSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="colleagueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colleagueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="isNewRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="movementSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="processInstanceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transferenceSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processTaskAppointmentDto", propOrder = {
    "appointmentDate",
    "appointmentSeconds",
    "appointmentSequence",
    "colleagueId",
    "colleagueName",
    "companyId",
    "isNewRecord",
    "movementSequence",
    "processInstanceId",
    "transferenceSequence"
})
public class ProcessTaskAppointmentDto {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointmentDate;
    protected Integer appointmentSeconds;
    protected int appointmentSequence;
    protected String colleagueId;
    protected String colleagueName;
    protected long companyId;
    protected Boolean isNewRecord;
    protected int movementSequence;
    protected int processInstanceId;
    protected int transferenceSequence;

    /**
     * Obt�m o valor da propriedade appointmentDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Define o valor da propriedade appointmentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentDate(XMLGregorianCalendar value) {
        this.appointmentDate = value;
    }

    /**
     * Obt�m o valor da propriedade appointmentSeconds.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppointmentSeconds() {
        return appointmentSeconds;
    }

    /**
     * Define o valor da propriedade appointmentSeconds.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppointmentSeconds(Integer value) {
        this.appointmentSeconds = value;
    }

    /**
     * Obt�m o valor da propriedade appointmentSequence.
     * 
     */
    public int getAppointmentSequence() {
        return appointmentSequence;
    }

    /**
     * Define o valor da propriedade appointmentSequence.
     * 
     */
    public void setAppointmentSequence(int value) {
        this.appointmentSequence = value;
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
     * Obt�m o valor da propriedade isNewRecord.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNewRecord() {
        return isNewRecord;
    }

    /**
     * Define o valor da propriedade isNewRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNewRecord(Boolean value) {
        this.isNewRecord = value;
    }

    /**
     * Obt�m o valor da propriedade movementSequence.
     * 
     */
    public int getMovementSequence() {
        return movementSequence;
    }

    /**
     * Define o valor da propriedade movementSequence.
     * 
     */
    public void setMovementSequence(int value) {
        this.movementSequence = value;
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
     * Obt�m o valor da propriedade transferenceSequence.
     * 
     */
    public int getTransferenceSequence() {
        return transferenceSequence;
    }

    /**
     * Define o valor da propriedade transferenceSequence.
     * 
     */
    public void setTransferenceSequence(int value) {
        this.transferenceSequence = value;
    }

}

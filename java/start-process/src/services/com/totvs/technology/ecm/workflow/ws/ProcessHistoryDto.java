
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
 * <p>Classe Java de processHistoryDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="processHistoryDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="conversionSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="labelActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labelLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="movementHour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movementSequence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="previousMovementSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="processInstanceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stateSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="subProcessId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tasks" type="{http://ws.workflow.ecm.technology.totvs.com/}processTaskDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="threadSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processHistoryDto", propOrder = {
    "active",
    "companyId",
    "conversionSequence",
    "isReturn",
    "labelActivity",
    "labelLink",
    "movementDate",
    "movementHour",
    "movementSequence",
    "previousMovementSequence",
    "processInstanceId",
    "stateSequence",
    "subProcessId",
    "tasks",
    "threadSequence"
})
public class ProcessHistoryDto {

    protected Boolean active;
    protected long companyId;
    protected Integer conversionSequence;
    protected Boolean isReturn;
    protected String labelActivity;
    protected String labelLink;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar movementDate;
    protected String movementHour;
    protected int movementSequence;
    protected Integer previousMovementSequence;
    protected int processInstanceId;
    protected Integer stateSequence;
    protected Integer subProcessId;
    @XmlElement(nillable = true)
    protected List<ProcessTaskDto> tasks;
    protected Integer threadSequence;

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
     * Obt�m o valor da propriedade conversionSequence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConversionSequence() {
        return conversionSequence;
    }

    /**
     * Define o valor da propriedade conversionSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConversionSequence(Integer value) {
        this.conversionSequence = value;
    }

    /**
     * Obt�m o valor da propriedade isReturn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReturn() {
        return isReturn;
    }

    /**
     * Define o valor da propriedade isReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReturn(Boolean value) {
        this.isReturn = value;
    }

    /**
     * Obt�m o valor da propriedade labelActivity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelActivity() {
        return labelActivity;
    }

    /**
     * Define o valor da propriedade labelActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelActivity(String value) {
        this.labelActivity = value;
    }

    /**
     * Obt�m o valor da propriedade labelLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelLink() {
        return labelLink;
    }

    /**
     * Define o valor da propriedade labelLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelLink(String value) {
        this.labelLink = value;
    }

    /**
     * Obt�m o valor da propriedade movementDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMovementDate() {
        return movementDate;
    }

    /**
     * Define o valor da propriedade movementDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMovementDate(XMLGregorianCalendar value) {
        this.movementDate = value;
    }

    /**
     * Obt�m o valor da propriedade movementHour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementHour() {
        return movementHour;
    }

    /**
     * Define o valor da propriedade movementHour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementHour(String value) {
        this.movementHour = value;
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
     * Obt�m o valor da propriedade previousMovementSequence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousMovementSequence() {
        return previousMovementSequence;
    }

    /**
     * Define o valor da propriedade previousMovementSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousMovementSequence(Integer value) {
        this.previousMovementSequence = value;
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
     * Obt�m o valor da propriedade stateSequence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateSequence() {
        return stateSequence;
    }

    /**
     * Define o valor da propriedade stateSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateSequence(Integer value) {
        this.stateSequence = value;
    }

    /**
     * Obt�m o valor da propriedade subProcessId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubProcessId() {
        return subProcessId;
    }

    /**
     * Define o valor da propriedade subProcessId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubProcessId(Integer value) {
        this.subProcessId = value;
    }

    /**
     * Gets the value of the tasks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tasks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTasks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessTaskDto }
     * 
     * 
     */
    public List<ProcessTaskDto> getTasks() {
        if (tasks == null) {
            tasks = new ArrayList<ProcessTaskDto>();
        }
        return this.tasks;
    }

    /**
     * Obt�m o valor da propriedade threadSequence.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreadSequence() {
        return threadSequence;
    }

    /**
     * Define o valor da propriedade threadSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreadSequence(Integer value) {
        this.threadSequence = value;
    }

}

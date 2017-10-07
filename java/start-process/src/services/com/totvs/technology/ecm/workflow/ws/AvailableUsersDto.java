
package services.com.totvs.technology.ecm.workflow.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de availableUsersDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="availableUsersDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isCollectiveTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="users" type="{http://ws.workflow.ecm.technology.totvs.com/}colleagueDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="willShowUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availableUsersDto", propOrder = {
    "isCollectiveTask",
    "users",
    "willShowUsers"
})
public class AvailableUsersDto {

    protected Boolean isCollectiveTask;
    @XmlElement(nillable = true)
    protected List<ColleagueDto> users;
    protected Boolean willShowUsers;

    /**
     * Obt�m o valor da propriedade isCollectiveTask.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCollectiveTask() {
        return isCollectiveTask;
    }

    /**
     * Define o valor da propriedade isCollectiveTask.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCollectiveTask(Boolean value) {
        this.isCollectiveTask = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the users property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColleagueDto }
     * 
     * 
     */
    public List<ColleagueDto> getUsers() {
        if (users == null) {
            users = new ArrayList<ColleagueDto>();
        }
        return this.users;
    }

    /**
     * Obt�m o valor da propriedade willShowUsers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWillShowUsers() {
        return willShowUsers;
    }

    /**
     * Define o valor da propriedade willShowUsers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWillShowUsers(Boolean value) {
        this.willShowUsers = value;
    }

}

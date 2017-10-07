
package services.com.totvs.technology.ecm.workflow.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de generalInfoDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="generalInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versionOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalInfoDto", propOrder = {
    "versionOption"
})
public class GeneralInfoDto {

    protected String versionOption;

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

}

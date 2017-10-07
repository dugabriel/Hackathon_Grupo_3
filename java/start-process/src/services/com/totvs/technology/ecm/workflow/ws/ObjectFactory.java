
package services.com.totvs.technology.ecm.workflow.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.totvs.technology.ecm.workflow.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://ws.workflow.ecm.technology.totvs.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.totvs.technology.ecm.workflow.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GeneralInfoDto }
     * 
     */
    public GeneralInfoDto createGeneralInfoDto() {
        return new GeneralInfoDto();
    }

    /**
     * Create an instance of {@link ProcessDefinitionDtoArray }
     * 
     */
    public ProcessDefinitionDtoArray createProcessDefinitionDtoArray() {
        return new ProcessDefinitionDtoArray();
    }

    /**
     * Create an instance of {@link AttachmentArray }
     * 
     */
    public AttachmentArray createAttachmentArray() {
        return new AttachmentArray();
    }

    /**
     * Create an instance of {@link ProcessDefinitionDto }
     * 
     */
    public ProcessDefinitionDto createProcessDefinitionDto() {
        return new ProcessDefinitionDto();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link KeyValueDto }
     * 
     */
    public KeyValueDto createKeyValueDto() {
        return new KeyValueDto();
    }

    /**
     * Create an instance of {@link ProcessHistoryDtoArray }
     * 
     */
    public ProcessHistoryDtoArray createProcessHistoryDtoArray() {
        return new ProcessHistoryDtoArray();
    }

    /**
     * Create an instance of {@link SociableDocumentDto }
     * 
     */
    public SociableDocumentDto createSociableDocumentDto() {
        return new SociableDocumentDto();
    }

    /**
     * Create an instance of {@link ProcessDefinitionVersionDto }
     * 
     */
    public ProcessDefinitionVersionDto createProcessDefinitionVersionDto() {
        return new ProcessDefinitionVersionDto();
    }

    /**
     * Create an instance of {@link ColleagueDto }
     * 
     */
    public ColleagueDto createColleagueDto() {
        return new ColleagueDto();
    }

    /**
     * Create an instance of {@link ProcessAttachmentDto }
     * 
     */
    public ProcessAttachmentDto createProcessAttachmentDto() {
        return new ProcessAttachmentDto();
    }

    /**
     * Create an instance of {@link ProcessStateDtoArray }
     * 
     */
    public ProcessStateDtoArray createProcessStateDtoArray() {
        return new ProcessStateDtoArray();
    }

    /**
     * Create an instance of {@link ProcessDefinitionVersionDtoArray }
     * 
     */
    public ProcessDefinitionVersionDtoArray createProcessDefinitionVersionDtoArray() {
        return new ProcessDefinitionVersionDtoArray();
    }

    /**
     * Create an instance of {@link ProcessTaskDto }
     * 
     */
    public ProcessTaskDto createProcessTaskDto() {
        return new ProcessTaskDto();
    }

    /**
     * Create an instance of {@link ProcessTaskAppointmentDtoArray }
     * 
     */
    public ProcessTaskAppointmentDtoArray createProcessTaskAppointmentDtoArray() {
        return new ProcessTaskAppointmentDtoArray();
    }

    /**
     * Create an instance of {@link ProcessTaskAppointmentDto }
     * 
     */
    public ProcessTaskAppointmentDto createProcessTaskAppointmentDto() {
        return new ProcessTaskAppointmentDto();
    }

    /**
     * Create an instance of {@link CardEventDtoArray }
     * 
     */
    public CardEventDtoArray createCardEventDtoArray() {
        return new CardEventDtoArray();
    }

    /**
     * Create an instance of {@link ProcessAttachmentDtoArray }
     * 
     */
    public ProcessAttachmentDtoArray createProcessAttachmentDtoArray() {
        return new ProcessAttachmentDtoArray();
    }

    /**
     * Create an instance of {@link CardEventDto }
     * 
     */
    public CardEventDto createCardEventDto() {
        return new CardEventDto();
    }

    /**
     * Create an instance of {@link DeadLineDto }
     * 
     */
    public DeadLineDto createDeadLineDto() {
        return new DeadLineDto();
    }

    /**
     * Create an instance of {@link WebServiceMessage }
     * 
     */
    public WebServiceMessage createWebServiceMessage() {
        return new WebServiceMessage();
    }

    /**
     * Create an instance of {@link DocumentDto }
     * 
     */
    public DocumentDto createDocumentDto() {
        return new DocumentDto();
    }

    /**
     * Create an instance of {@link AvailableUsersDto }
     * 
     */
    public AvailableUsersDto createAvailableUsersDto() {
        return new AvailableUsersDto();
    }

    /**
     * Create an instance of {@link ProcessStateDto }
     * 
     */
    public ProcessStateDto createProcessStateDto() {
        return new ProcessStateDto();
    }

    /**
     * Create an instance of {@link DocumentDtoArray }
     * 
     */
    public DocumentDtoArray createDocumentDtoArray() {
        return new DocumentDtoArray();
    }

    /**
     * Create an instance of {@link ProcessHistoryDto }
     * 
     */
    public ProcessHistoryDto createProcessHistoryDto() {
        return new ProcessHistoryDto();
    }

    /**
     * Create an instance of {@link KeyValueDtoArray }
     * 
     */
    public KeyValueDtoArray createKeyValueDtoArray() {
        return new KeyValueDtoArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.workflow.ecm.technology.totvs.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}

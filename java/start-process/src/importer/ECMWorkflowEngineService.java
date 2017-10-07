package importer;

import javax.xml.ws.BindingProvider;

import services.com.totvs.technology.ecm.workflow.ws.Attachment;
import services.com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceService;
import services.com.totvs.technology.ecm.workflow.ws.ProcessAttachmentDto;
import services.com.totvs.technology.ecm.workflow.ws.ProcessAttachmentDtoArray;
import services.com.totvs.technology.ecm.workflow.ws.WorkflowEngineService;

import services.net.java.dev.jaxb.array.StringArray;
import services.net.java.dev.jaxb.array.StringArrayArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class ECMWorkflowEngineService {
    String fluigURL = "http://hack:8080";
    String userId = "adm";
    String userLogin = "adm";
    String userPassword = "adm";
    String processId = "test";
    String requestComment = "starting with webservice";
    int tenantId = 1;
    int limit = 10;

    WorkflowEngineService workflowEngineService = instanceWorkflowEngineService();

    public static void main(String args[]) {
        System.out.println("\nIniciando ECMWorkflowEngineService");

        ECMWorkflowEngineService ECMWorkflowEngineService = new ECMWorkflowEngineService();

        try {
            ECMWorkflowEngineService.accessConfig();
            ECMWorkflowEngineService.simpleStartProcess();

            System.out.println("\nTerminou ECMWorkflowEngineService");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void simpleStartProcess() throws Exception {
        System.out.println("\nIniciando simpleStartProcess()\n");


        for (int i = 0; i < this.limit; i++) {

            StringArray resultArray = workflowEngineService.simpleStartProcess(this.userLogin, this.userPassword,
                    this.tenantId, this.processId, this.requestComment,
                    this.createProcessAttachment(), this.createFormFieldStringValue());

            for (String result : resultArray.getItem()) {
                System.out.println(result);
            }

            Thread.sleep(500);
        }


        System.out.println("\nTerminou simpleStartProcess()");
    }

    private StringArray createDestinationUser() {
        StringArray stringArray = new StringArray();

        stringArray.getItem().add(this.userId);

        return stringArray;
    }

    private StringArrayArray createFormFieldStringValue() {
        StringArrayArray stringArrayArray = new StringArrayArray();

        StringArray cnpj = new StringArray();
        cnpj.getItem().add("cnpj"); // nome do campo.
        cnpj.getItem().add("32963043000240"); // valor do campo.

        StringArray empresa = new StringArray();
        empresa.getItem().add("empresa"); // nome do campo.
        empresa.getItem().add("AGROPECUARIA ESTEIO INVESTIMENTOS E PARTICIPAÇÕES"); // valor do campo.

        //String produto = this.getRandomProduct();

        StringArray produto = new StringArray();
        empresa.getItem().add("produto"); // nome do campo.
        empresa.getItem().add("AGROPECUARIA ESTEIO INVESTIMENTOS E PARTICIPAÇÕES"); // valor do campo.

        stringArrayArray.getItem().add(cnpj);
        stringArrayArray.getItem().add(empresa);

        return stringArrayArray;
    }

    private String getRandomProduct() throws IOException{

        try {
            List<String> products = Files.readAllLines(Paths.get("database/product2.txt"));

            Random random = new Random();

            return products.get(random.nextInt(products.size()));
        }catch (IOException e) {

        }


    }

    private ProcessAttachmentDtoArray createProcessAttachment() {
        ProcessAttachmentDto processAttachmentDto = new ProcessAttachmentDto();

        Attachment attachment = new Attachment();
        processAttachmentDto.getAttachments().add(attachment);

        ProcessAttachmentDtoArray processAttachmentDtoArray = new ProcessAttachmentDtoArray();

        return processAttachmentDtoArray;
    }

    private void accessConfig() {
        BindingProvider bp = (BindingProvider) this.workflowEngineService;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                            this.fluigURL + "/webdesk/ECMWorkflowEngineService");
    }

    private WorkflowEngineService instanceWorkflowEngineService() {
        return new ECMWorkflowEngineServiceService().getWorkflowEngineServicePort();
    }
}
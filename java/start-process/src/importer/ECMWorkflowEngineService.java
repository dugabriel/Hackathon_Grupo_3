package importer;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.BindingProvider;

import services.com.totvs.technology.ecm.workflow.ws.*;

import services.net.java.dev.jaxb.array.StringArray;
import services.net.java.dev.jaxb.array.StringArrayArray;

import java.io.IOException;
import java.lang.Exception;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class ECMWorkflowEngineService {
    //String fluigURL = "https://hack/";
    String fluigURL = "https://grupo03.fluig.com";
    String userId = "adm2";
    String userLogin = "adm2";
    String userPassword = "adm";
    String processId = "solicitacao-compra";
    String requestComment = "Favor analisar a requisição de compra";
    int tenantId = 2;
    int limit = 20;
    List<String> requesters = Arrays.asList("marcelo.fortunato", "andre.timm", "rafael.vanat");
    List<String> approvers = Arrays.asList("robson","mateus","maria");
    List<String> approve = Arrays.asList("s","n");
    String cnpj = "53113791000122";
    String empresa = "TOTVS S.A.";

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

    private void simpleStartProcess() throws Exception{
        System.out.println("\nIniciando StartProcess()\n");


        for (int i = 0; i < this.limit; i++) {

            /* StringArray resultArray = workflowEngineService.simpleStartProcess(this.userLogin, this.userPassword,
                    this.tenantId, this.processId, this.requestComment,
                    this.createProcessAttachment(), this.createFormFieldStringValue());
            */
            System.out.println("\n########### Solicitação: " + i +"\n\n");

            StringArrayArray resultArray = workflowEngineService.startProcess(this.userLogin,
                    this.userPassword, this.tenantId, this.processId, 5, this.createDestinationUser(),
                    this.requestComment, this.userId, true, this.createProcessAttachment(),
                    this.createFormFieldStringValue(), this.createAppointment(), false);

            for (StringArray result : resultArray.getItem()) {
                System.out.println(result.getItem().get(0) + ": " + result.getItem().get(1));
            }

            Thread.sleep(200);
        }


        System.out.println("\nTerminou simpleStartProcess()");
    }

    private StringArray createDestinationUser() {
        StringArray stringArray = new StringArray();

        stringArray.getItem().add(this.userId);

        return stringArray;
    }

    private ProcessTaskAppointmentDtoArray createAppointment() throws DatatypeConfigurationException {
        ProcessTaskAppointmentDtoArray processTaskAppointmentDtoArray = new ProcessTaskAppointmentDtoArray();
        //ProcessTaskAppointmentDto processTaskAppointmentDto = new ProcessTaskAppointmentDto();

        //processTaskAppointmentDtoArray.getItem().add(processTaskAppointmentDto);
        return processTaskAppointmentDtoArray;
    }

    private StringArrayArray createFormFieldStringValue() {
        StringArrayArray stringArrayArray = new StringArrayArray();
        Random random = new Random();

        /*
            EMPRESA
         */

        StringArray cnpj = new StringArray();
        cnpj.getItem().add("cnpj"); // nome do campo.
        cnpj.getItem().add(this.cnpj); // valor do campo.

        stringArrayArray.getItem().add(cnpj);

        StringArray empresa = new StringArray();
        empresa.getItem().add("empresa"); // nome do campo.
        empresa.getItem().add(this.empresa); // valor do campo.

        stringArrayArray.getItem().add(empresa);

        /*
            PRODUTO RAMDOM
         */
        String[] RandomProduto = this.getRandomProduct();

        System.out.println("Produto: " + RandomProduto[1]);
        StringArray produto = new StringArray();
        produto.getItem().add("produto"); // nome do campo.
        produto.getItem().add(RandomProduto[0]); // valor do campo.

        stringArrayArray.getItem().add(produto);

        StringArray valor = new StringArray();
        valor.getItem().add("valor"); // nome do campo.
        valor.getItem().add(RandomProduto[1]); // valor do campo.

        stringArrayArray.getItem().add(valor);


        /*
         REQUISITANTE
          */
        String requester = requesters.get(random.nextInt(requesters.size()));

        System.out.println("Requisitante: " + requester);
        StringArray requisitante = new StringArray();
        requisitante.getItem().add("requisitante"); // nome do campo.
        requisitante.getItem().add(requester); // valor do campo.

        stringArrayArray.getItem().add(requisitante);

        /*
            APROVADORES
         */
        String approver = approvers.get(random.nextInt(approvers.size()));

        System.out.println("Aprovador: " + approver);
        StringArray aprovador = new StringArray();
        aprovador.getItem().add("aprovador"); // nome do campo.
        aprovador.getItem().add(approver); // valor do campo.

        stringArrayArray.getItem().add(aprovador);

          /*
            APROVA?
         */
        /*  String approveStatus = approve.get(random.nextInt(approve.size()));

        System.out.println("Aprova?: " + approveStatus);
        StringArray aprova = new StringArray();
        aprova.getItem().add("aprova"); // nome do campo.
        aprova.getItem().add(approveStatus); // valor do campo.

        stringArrayArray.getItem().add(aprova);
        */
        /*
            OBS
         */

        StringArray obs = new StringArray();
        obs.getItem().add("obs"); // nome do campo.
        obs.getItem().add("Solicitação de compra"); // valor do campo.

        stringArrayArray.getItem().add(obs);

         /*
            DATA
         */
        StringArray data = new StringArray();
        data.getItem().add("datax"); // nome do campo.
        data.getItem().add(this.getRandomDate()); // valor do campo.

        stringArrayArray.getItem().add(data);

        return stringArrayArray;
    }

    private String[] getRandomProduct(){
        String[] product = null;
        try {
            List<String> products = Files.readAllLines(Paths.get("database/product2.txt"));

            Random random = new Random();

            product =  products.get(random.nextInt(products.size())).split("#");
        }catch (IOException e) {
            System.out.println(e.toString());
        }

        return product;
    }

    private String getRandomDate(){
        Random rnd = new Random();
        Date date = new Date(Math.abs(System.currentTimeMillis() - rnd.nextInt()));
        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");

        return spf.format(date).toString();
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
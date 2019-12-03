package ar.incluit.fintech.anses.servidor.service;

import com.entrevistas.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpUrlConnection;
import org.springframework.xml.transform.StringSource;
import sun.rmi.runtime.Log;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import java.io.IOException;

public class SOAPConector extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(SOAPConector.class);


    @Value("${ws.url}")
    private String WSURL = "http://localhost:9090/ws/entrevistas.wsdl";

    private String namespaceDirectorURL = "xmlns=http://director.anses.gov.ar";


    // ROLES ENDPOINT
    public GetRolesResponse getRoles() {
        GetRolesRequest request = new GetRolesRequest();

        GetRolesResponse response = (GetRolesResponse) getWebServiceTemplate().marshalSendAndReceive(
                "http://localhost:9090/ws/entrevistas.wsdl", request, new WebServiceMessageCallback() {

                    @Override
                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        if (message instanceof SaajSoapMessage) {
                            try {
                                SaajSoapMessage soapMessage = (SaajSoapMessage) message;
                                SoapHeader soapHeader = soapMessage.getSoapHeader();
                                StringSource headerSource = new StringSource("<token></token>\n<sign>test213</sign>");
                                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                                transformer.transform(headerSource, soapHeader.getResult());
                            } catch (TransformerFactoryConfigurationError | TransformerException e) {
                                logger.error(e.getMessage(), e);
                            }
                        }
                        log.info("log", message);
                    }
                });

        return response;
    }

    // SET ENDPOINT
    public AddSetResponse addSet(AddSetRequest addSetRequest) {

        AddSetResponse response = (AddSetResponse) getWebServiceTemplate().marshalSendAndReceive(
                addSetRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public GetAllSetResponse getAllSet() {
        GetAllSetRequest request = new GetAllSetRequest();

        GetAllSetResponse response = (GetAllSetResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback(WSURL));

        return response;
    }

    public DeleteSetResponse deleteSet(DeleteSetRequest deleteSetRequest) {

        DeleteSetResponse response = (DeleteSetResponse) getWebServiceTemplate().marshalSendAndReceive(
                deleteSetRequest, new SoapActionCallback(WSURL));

        return response;
    }

    // QUESTION TYPE ENDPOINT
    public AddQTyResponse addQTy(AddQTyRequest addQTyRequest) {

        AddQTyResponse response = (AddQTyResponse) getWebServiceTemplate().marshalSendAndReceive(
                addQTyRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public GetAllQTyResponse getAllQuestionType() {
        GetAllQTyRequest request = new GetAllQTyRequest();

        GetAllQTyResponse response = (GetAllQTyResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback(WSURL));

        return response;
    }

    //FORM ENDPOINT
    public UpdateFormResponse updateForm(UpdateFormRequest updateFormRequest) {

        UpdateFormResponse response = (UpdateFormResponse) getWebServiceTemplate().marshalSendAndReceive(
                updateFormRequest, new SoapActionCallback(WSURL));
        return response;
    }

    //QUESTION ENDPOINT
    public AddQuestionResponse addQuestion(AddQuestionRequest addQuestionRequest) {

        AddQuestionResponse response = (AddQuestionResponse) getWebServiceTemplate().marshalSendAndReceive(
                addQuestionRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public UpdateQuestionResponse updateQuestion(UpdateQuestionRequest updateQuestionRequest) {

        UpdateQuestionResponse response = (UpdateQuestionResponse) getWebServiceTemplate().marshalSendAndReceive(
                updateQuestionRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public GetAllQuestionResponse getAllQuestion() {
        GetAllQuestionRequest request = new GetAllQuestionRequest();

        GetAllQuestionResponse response = (GetAllQuestionResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback(WSURL));

        return response;
    }

    public GetQuestionResponse getQuestion(GetQuestionRequest getQuestionRequest) {

        GetQuestionResponse response = (GetQuestionResponse) getWebServiceTemplate().marshalSendAndReceive(
                getQuestionRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public GetLastIdResponse getLastId() {
        GetLastIdRequest request = new GetLastIdRequest();

        GetLastIdResponse response = (GetLastIdResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback(WSURL));

        return response;
    }

    public DeleteQuestionResponse deleteQuestion(DeleteQuestionRequest deleteQuestionRequest) {

        DeleteQuestionResponse response = (DeleteQuestionResponse) getWebServiceTemplate().marshalSendAndReceive(
                deleteQuestionRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public ChangeStatusResponse changeStatus(ChangeStatusRequest changeStatusRequest) {

        ChangeStatusResponse response = (ChangeStatusResponse) getWebServiceTemplate().marshalSendAndReceive(
                changeStatusRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public FindQuestionBySetResponse findQuestionBySet(FindQuestionBySetRequest findQuestionBySetRequest) {

        FindQuestionBySetResponse response = (FindQuestionBySetResponse) getWebServiceTemplate().marshalSendAndReceive(
                findQuestionBySetRequest, new SoapActionCallback(WSURL));

        return response;
    }

    //USER ENDPOINT
    public AddUserResponse addUser(AddUserRequest addUserRequest) {

        AddUserResponse response = (AddUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                addUserRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest) {

        UpdateUserResponse response = (UpdateUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                updateUserRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public GetUserResponse getUser(GetUserRequest getUserRequest) {

        GetUserResponse response = (GetUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                getUserRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public GetAllUsersResponse getAllUsers() {
        GetAllUsersRequest request = new GetAllUsersRequest();

        GetAllUsersResponse response = (GetAllUsersResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback(WSURL));

        return response;
    }

    public DisabledUserResponse disabledUser(DisabledUserRequest disabledUserRequest) {

        DisabledUserResponse response = (DisabledUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                disabledUserRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public EnabledUserResponse enabledUser(EnabledUserRequest enabledUserRequest) {

        EnabledUserResponse response = (EnabledUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                enabledUserRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public GetUsersByTypeResponse getUsersByType(GetUsersByTypeRequest getUsersByTypeRequest) {

        GetUsersByTypeResponse response = (GetUsersByTypeResponse) getWebServiceTemplate().marshalSendAndReceive(
                getUsersByTypeRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public GetUserForUsernameResponse getUserForUsername(GetUserForUsernameRequest getUserForUsernameRequest) {

        GetUserForUsernameResponse response = (GetUserForUsernameResponse) getWebServiceTemplate().marshalSendAndReceive(
                getUserForUsernameRequest, new SoapActionCallback(WSURL));

        return response;
    }

    // ACCOUNT ENDPOINT
    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest) {

        AuthenticateResponse response = (AuthenticateResponse) getWebServiceTemplate().marshalSendAndReceive(
                authenticateRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public AuthenticateResponseApp authorizeUserApp(AuthenticateRequestApp authenticateRequestApp) {

        AuthenticateResponseApp response = (AuthenticateResponseApp) getWebServiceTemplate().marshalSendAndReceive(
                authenticateRequestApp, new SoapActionCallback(WSURL));

        return response;
    }

    public UpdateSignatureResponse updateSignature(UpdateSignatureRequest updateSignatureRequest) {

        UpdateSignatureResponse response = (UpdateSignatureResponse) getWebServiceTemplate().marshalSendAndReceive(
                updateSignatureRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public FileImportResponse fileImport(FileImportRequest fileImportRequest) {

        FileImportResponse response = (FileImportResponse) getWebServiceTemplate().marshalSendAndReceive(
                fileImportRequest, new SoapActionCallback(WSURL));

        return response;
    }

    public ExportDataResponse exportData(ExportDataRequest exportDataRequest) {

        ExportDataResponse response = (ExportDataResponse) getWebServiceTemplate().marshalSendAndReceive(
                exportDataRequest, new SoapActionCallback(WSURL));

        return response;
    }


}

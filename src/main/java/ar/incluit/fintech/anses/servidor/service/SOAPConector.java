package ar.incluit.fintech.anses.servidor.service;

import ar.incluit.fintech.anses.servidor.web.soap.Session;
import ar.incluit.fintech.anses.servidor.web.soap.SessionStorage;
import com.entrevistas.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.xml.transform.StringSource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import java.io.IOException;

public class SOAPConector extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(SOAPConector.class);

    private Session session;

    @Value("${ws.url}")
    private String WSURL = "http://localhost:9090/ws/entrevistas.wsdl";

    private String namespaceDirectorURL = "xmlns=\"http://director.anses.gov.ar\"";

    @Autowired
    SessionStorage sessionStorage;

    public SOAPConector(Session session) {
        this.namespaceDirectorURL = namespaceDirectorURL;
        this.session = session;
    }

    public SOAPConector() { }


    // ROLES ENDPOINT
    public GetRolesResponse getRoles() {
        GetRolesRequest request = new GetRolesRequest();

        GetRolesResponse response = (GetRolesResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, request, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    // SET ENDPOINT
    public AddSetResponse addSet(AddSetRequest addSetRequest) {

        AddSetResponse response = (AddSetResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, addSetRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public GetAllSetResponse getAllSet() {
        GetAllSetRequest request = new GetAllSetRequest();

        GetAllSetResponse response = (GetAllSetResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, request, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public DeleteSetResponse deleteSet(DeleteSetRequest deleteSetRequest) {

        DeleteSetResponse response = (DeleteSetResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, deleteSetRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public GetAllSetFilteredResponse getAllSetFiltered(GetAllSetFilteredRequest getAllSetFilteredRequest) {

        GetAllSetFilteredResponse response = (GetAllSetFilteredResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, getAllSetFilteredRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }


    // QUESTION TYPE ENDPOINT
    public AddQTyResponse addQTy(AddQTyRequest addQTyRequest) {

        AddQTyResponse response = (AddQTyResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, addQTyRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public GetAllQTyResponse getAllQuestionType() {
        GetAllQTyRequest request = new GetAllQTyRequest();

        GetAllQTyResponse response = (GetAllQTyResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, request, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    //FORM ENDPOINT
    public UpdateFormResponse updateForm(UpdateFormRequest updateFormRequest) {

        UpdateFormResponse response = (UpdateFormResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, updateFormRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });
        return response;
    }

    //QUESTION ENDPOINT
    public AddQuestionResponse addQuestion(AddQuestionRequest addQuestionRequest) {

        AddQuestionResponse response = (AddQuestionResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, addQuestionRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public UpdateQuestionResponse updateQuestion(UpdateQuestionRequest updateQuestionRequest) {

        UpdateQuestionResponse response = (UpdateQuestionResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, updateQuestionRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public GetAllQuestionResponse getAllQuestion() {
        GetAllQuestionRequest request = new GetAllQuestionRequest();

        GetAllQuestionResponse response = (GetAllQuestionResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, request, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public GetQuestionResponse getQuestion(GetQuestionRequest getQuestionRequest) {

        GetQuestionResponse response = (GetQuestionResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, getQuestionRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public GetLastIdResponse getLastId() {
        GetLastIdRequest request = new GetLastIdRequest();

        GetLastIdResponse response = (GetLastIdResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, request, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public DeleteQuestionResponse deleteQuestion(DeleteQuestionRequest deleteQuestionRequest) {

        DeleteQuestionResponse response = (DeleteQuestionResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, deleteQuestionRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public ChangeStatusResponse changeStatus(ChangeStatusRequest changeStatusRequest) {

        ChangeStatusResponse response = (ChangeStatusResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, changeStatusRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public FindQuestionBySetResponse findQuestionBySet(FindQuestionBySetRequest findQuestionBySetRequest) {

        FindQuestionBySetResponse response = (FindQuestionBySetResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, findQuestionBySetRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });
        return response;
    }

    //USER ENDPOINT
    public AddUserResponse addUser(AddUserRequest addUserRequest) {

        AddUserResponse response = (AddUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, addUserRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest) {

        UpdateUserResponse response = (UpdateUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, updateUserRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public GetUserResponse getUser(GetUserRequest getUserRequest) {

        GetUserResponse response = (GetUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, getUserRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public GetAllUsersResponse getAllUsers() {
        GetAllUsersRequest request = new GetAllUsersRequest();

        GetAllUsersResponse response = (GetAllUsersResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, request, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public DisabledUserResponse disabledUser(DisabledUserRequest disabledUserRequest) {

        DisabledUserResponse response = (DisabledUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, disabledUserRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public EnabledUserResponse enabledUser(EnabledUserRequest enabledUserRequest) {

        EnabledUserResponse response = (EnabledUserResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, enabledUserRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public GetUsersByTypeResponse getUsersByType(GetUsersByTypeRequest getUsersByTypeRequest) {

        GetUsersByTypeResponse response = (GetUsersByTypeResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, getUsersByTypeRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public GetUserForUsernameResponse getUserForUsername(GetUserForUsernameRequest getUserForUsernameRequest) {

        GetUserForUsernameResponse response = (GetUserForUsernameResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, getUserForUsernameRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    // ACCOUNT ENDPOINT
    public AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest) {

        AuthenticateResponse response = (AuthenticateResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, authenticateRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public AuthenticateResponseApp authorizeUserApp(AuthenticateRequestApp authenticateRequestApp) {

        AuthenticateResponseApp response = (AuthenticateResponseApp) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, authenticateRequestApp, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public UpdateSignatureResponse updateSignature(UpdateSignatureRequest updateSignatureRequest) {

        UpdateSignatureResponse response = (UpdateSignatureResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, updateSignatureRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public FileImportResponse fileImport(FileImportRequest fileImportRequest) {

        FileImportResponse response = (FileImportResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, fileImportRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }

    public ExportDataResponse exportData(ExportDataRequest exportDataRequest) {

        ExportDataResponse response = (ExportDataResponse) getWebServiceTemplate().marshalSendAndReceive(
                WSURL, exportDataRequest, new WebServiceMessageCallback() {

                    @Override

                    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
                        processRequest(message);

                    }
                });

        return response;
    }
    void processRequest(WebServiceMessage message){
     if (message instanceof SaajSoapMessage) {
        try {

            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
            session = sessionStorage.getSessions().get(request.getParameter("uuid"));
            SaajSoapMessage soapMessage = (SaajSoapMessage) message;
            SoapHeader soapHeader = soapMessage.getSoapHeader();

            ((SaajSoapMessage) message).getSaajMessage().getMimeHeaders().setHeader("SOAPAction",String.format("entrevistasEndpoint/%s",request.getHeader("SOAPAction")));

            String tks = String.format("<token %s >%s</token>",namespaceDirectorURL,session.getToken());
            String sgn = String.format("<sign %s >%s</sign>",namespaceDirectorURL,session.getSign());

            StringSource tokenSource = new StringSource(tks);
            StringSource signSource = new StringSource(sgn);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(tokenSource, soapHeader.getResult());
            transformer.transform(signSource, soapHeader.getResult());
        } catch (TransformerFactoryConfigurationError | TransformerException e) {
            logger.error(e.getMessage(), e);
        }
    }
    }


}

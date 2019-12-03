package ar.incluit.fintech.anses.servidor.web.soap;

import ar.incluit.fintech.anses.servidor.service.SOAPConector;
import com.entrevistas.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.naming.NamingException;

@Endpoint
public class SoapEndpoint {

    private final static Logger log = LoggerFactory.getLogger(SoapEndpoint.class);

    private static final String NAMESPACE_URI = "entrevistasEndpoint";

    private final SOAPConector soapConector;

    public SoapEndpoint(SOAPConector soapConector) {
        this.soapConector = soapConector;
    }

    // ROLES ENDPOINT
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getRolesRequest")
    @ResponsePayload
    public GetRolesResponse getAllRoles(@RequestPayload GetRolesRequest request) {
        log.debug("Request to get all Roles: {}", request);
        GetRolesResponse response = soapConector.getRoles();
        return response;
    }

    // SET ENDPOINT
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addSetRequest")
    @ResponsePayload
    public AddSetResponse addSet(@RequestPayload AddSetRequest request) {
        log.debug("Request to update export form: {}", request);
        AddSetResponse response = soapConector.addSet(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllSetRequest")
    @ResponsePayload
    public GetAllSetResponse getAllSet(@RequestPayload GetAllSetRequest request) {
        log.debug("Request to update export form: {}", request);
        GetAllSetResponse response = soapConector.getAllSet();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteSetRequest")
    @ResponsePayload
    public DeleteSetResponse deleteSet(@RequestPayload DeleteSetRequest request) {
        log.debug("Request to update export form: {}", request);
        DeleteSetResponse response = soapConector.deleteSet(request);
        return response;
    }

    //QUESTION TYPE
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddQTyRequest")
    @ResponsePayload
    public AddQTyResponse addQuestionType(@RequestPayload AddQTyRequest request) {
        log.debug("Request to update export form: {}", request);
        AddQTyResponse response = soapConector.addQTy(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllQTyRequest")
    @ResponsePayload
    public GetAllQTyResponse getAllQuestionType(@RequestPayload GetAllQTyRequest request) {
        log.debug("Request to update export form: {}", request);
        GetAllQTyResponse response = soapConector.getAllQuestionType();
        return response;
    }

    // FORM ENDPOINT
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateFormRequest")
    @ResponsePayload
    public UpdateFormResponse updateForm(@RequestPayload UpdateFormRequest request) {
        log.debug("Request to update export form: {}", request);
        UpdateFormResponse response = soapConector.updateForm(request);
        return response;
    }

    //QUESTION ENDPOINT
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addQuestionRequest")
    @ResponsePayload
    public AddQuestionResponse addQuestion(@RequestPayload AddQuestionRequest request) {
        AddQuestionResponse response = soapConector.addQuestion(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateQuestionRequest")
    @ResponsePayload
    public UpdateQuestionResponse updateQuestion(@RequestPayload UpdateQuestionRequest request) {
        UpdateQuestionResponse response = soapConector.updateQuestion(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllQuestionRequest")
    @ResponsePayload
    public GetAllQuestionResponse getAllQuestions(GetAllQuestionRequest request) {
        GetAllQuestionResponse response = soapConector.getAllQuestion();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getQuestionRequest")
    @ResponsePayload
    public GetQuestionResponse getQuestion(@RequestPayload GetQuestionRequest request) {
        GetQuestionResponse response = soapConector.getQuestion(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLastIdRequest")
    @ResponsePayload
    public GetLastIdResponse getLastId() {
        GetLastIdResponse response = soapConector.getLastId();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteQuestionRequest")
    @ResponsePayload
    public DeleteQuestionResponse deleteQuestion(@RequestPayload DeleteQuestionRequest request) {
        DeleteQuestionResponse response = soapConector.deleteQuestion(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "changeStatusRequest")
    @ResponsePayload
    public ChangeStatusResponse changeStatusQuestion(@RequestPayload ChangeStatusRequest request) {
        ChangeStatusResponse response = soapConector.changeStatus(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "findQuestionBySetRequest")
    @ResponsePayload
    public FindQuestionBySetResponse findQuestionBySet(@RequestPayload FindQuestionBySetRequest request) {
        FindQuestionBySetResponse response = soapConector.findQuestionBySet(request);
        return response;
    }

    //USER ENDPOINT
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addUserRequest")
    @ResponsePayload
    public AddUserResponse addUser(@RequestPayload AddUserRequest request) {
        AddUserResponse response = soapConector.addUser(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateUserRequest")
    @ResponsePayload
    public UpdateUserResponse updateUser(@RequestPayload UpdateUserRequest request) {
        UpdateUserResponse response = soapConector.updateUser(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllUsersRequest")
    @ResponsePayload
    public GetAllUsersResponse getAllUsers(@RequestPayload GetAllUsersRequest request) {
        GetAllUsersResponse response = soapConector.getAllUsers();
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUser(@RequestPayload GetUserRequest request) {
        GetUserResponse response = soapConector.getUser(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "disabledUserRequest")
    @ResponsePayload
    public DisabledUserResponse disabledUser(@RequestPayload DisabledUserRequest request) {
        DisabledUserResponse response = soapConector.disabledUser(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "enabledUserRequest")
    @ResponsePayload
    public EnabledUserResponse enabledUser(@RequestPayload EnabledUserRequest request) {
        EnabledUserResponse response = soapConector.enabledUser(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUsersByTypeRequest")
    @ResponsePayload
    public GetUsersByTypeResponse getUsersForType(@RequestPayload GetUsersByTypeRequest request) {
        GetUsersByTypeResponse response = soapConector.getUsersByType(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserForUsernameRequest")
    @ResponsePayload
    public GetUserForUsernameResponse getUserForUsername(@RequestPayload GetUserForUsernameRequest request) {
        GetUserForUsernameResponse response = soapConector.getUserForUsername(request);
        return response;
    }

    // ACCOUNT ENDPOINT
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "authenticateRequest")
    @ResponsePayload
    public AuthenticateResponse authorizeUser(@RequestPayload AuthenticateRequest request) {
        log.info(request.getUsername());
        log.info(request.getPassword());
        AuthenticateResponse response = soapConector.authenticate(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "authenticateRequestApp")
    @ResponsePayload
    public AuthenticateResponseApp authorizeUserApp(@RequestPayload AuthenticateRequestApp request) {
        log.info(request.getUsername());
        log.info(request.getPassword());
        AuthenticateResponseApp response = soapConector.authorizeUserApp(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateSignatureRequest")
    @ResponsePayload
    public UpdateSignatureResponse updateSignatureCurrentUser(@RequestPayload UpdateSignatureRequest request) {
        UpdateSignatureResponse response = soapConector.updateSignature(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "fileImportRequest")
    @ResponsePayload
    public FileImportResponse fileImport(@RequestPayload FileImportRequest request) throws NamingException {
        FileImportResponse response = soapConector.fileImport(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "exportDataRequest")
    @ResponsePayload
    public ExportDataResponse exportData(@RequestPayload ExportDataRequest request) throws NamingException {
        ExportDataResponse response = soapConector.exportData(request);
        return response;
    }


}

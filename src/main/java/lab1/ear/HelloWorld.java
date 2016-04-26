package lab1.ear;

import lab1.ejb.Person;
import lab1.ejb.PersonMagazin;
import org.jboss.annotation.security.SecurityDomain;
import org.jboss.ws.api.annotation.AuthMethod;
import org.jboss.ws.api.annotation.TransportGuarantee;
import org.jboss.ws.api.annotation.WebContext;

import javax.annotation.security.DeclareRoles;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.LinkedList;
import java.util.List;
@Stateless
@WebService
@SecurityDomain("other")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
@WebContext(transportGuarantee = TransportGuarantee.NONE, secureWSDLAccess = true, authMethod = AuthMethod.BASIC,realmName =
        "ApplicationRealm")
@DeclareRoles(value = {"developer","me"})
public interface HelloWorld {
    @WebMethod
    @WebResult(name = "rezultat")
    String addPerson(@WebParam(name="name") String name, @WebParam(name="surname") String surname);

    @WebMethod
    @WebResult(name = "List_Persons")
    PersonMagazin allUsers();

}


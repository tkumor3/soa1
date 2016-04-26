package lab1.ear;

import lab1.ejb.Person;
import lab1.ejb.PersonMagazin;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "lab1.ear.HelloWorld",
            targetNamespace = "http://hello.world.ns/",
            name = "HelloWorld",
            serviceName = "ProjectSoaService",
            portName = "ProjectSoaPort")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public class HelloWorldImpl implements HelloWorld {
    @Resource
    WebServiceContext wsctx;



    PersonMagazin personMagazin = new PersonMagazin();

    public String addPerson(@WebParam(name="name") String name, @WebParam(name="surname") String surname){


            personMagazin.addPerson(name, surname);
            return "Add " + name + " " + surname;

    }

    public PersonMagazin allUsers(){
        return personMagazin;
    }


}


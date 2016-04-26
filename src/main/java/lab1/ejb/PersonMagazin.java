package lab1.ejb;

import javax.xml.bind.annotation.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Tomek on 03.04.2016.
 */
@XmlRootElement(name = "Persons")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonMagazin {

    @XmlElement(name = "Person")
    private List<Person> magazin = new LinkedList<Person>();


    public void addPerson(String name, String surname){
        magazin.add(new Person(name,surname));
    }

    public List<Person> takeAllUser(){
        return magazin;
    }



}

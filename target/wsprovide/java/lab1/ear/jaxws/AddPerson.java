
package lab1.ear.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.4
 * Tue Apr 12 09:01:33 CEST 2016
 * Generated source version: 3.1.4
 */

@XmlRootElement(name = "addPerson", namespace = "http://ear.lab1/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPerson", namespace = "http://ear.lab1/", propOrder = {"name", "surname"})

public class AddPerson {

    @XmlElement(name = "name")
    private java.lang.String name;
    @XmlElement(name = "surname")
    private java.lang.String surname;

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String newName)  {
        this.name = newName;
    }

    public java.lang.String getSurname() {
        return this.surname;
    }

    public void setSurname(java.lang.String newSurname)  {
        this.surname = newSurname;
    }

}


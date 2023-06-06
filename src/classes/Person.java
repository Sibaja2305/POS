package classes;

/**
 * This class the important attributes to work with people and users in a
 * restaurant
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class Person {

    private String name;
    private String id;
    private String mail;

    /**
     * empty constructor
     */
    public Person() {
    }

    /**
     * This constructor contains the attributes of a person to be used in the
     * necessary methods of the POS
     *
     * @param name pass the data of the name of the person
     * @param id pass the person's id data
     * @param mail pass the person's email data
     */
    public Person(String name, String id, String mail) {
        this.name = name;
        this.id = id;
        this.mail = mail;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    /**
     * 
     * @return description
     */
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + ", mail=" + mail + '}';
    }

}

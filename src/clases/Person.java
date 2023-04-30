package clases;

public class Person {

    private String name;

    private String id;

    private String mail;

    public Person() {
    }

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

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + ", mail=" + mail + '}';
    }
    
}

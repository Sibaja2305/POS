package classes;

/**
 * This class extends from the Person class, this class contains the attributes
 * necessary to create a new user who can enter the POS
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class User extends Person {

    private String userType;
    private String idUser;
    private String passwordUser;
    private static User instance;

    /**
     * empty constructor
     */
    private User() {
    }

    /**
     * Este metodo returna una unica instancia de la clase User
     *
     * @return
     */
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    /**
     * This constructor is used to create a new user or update a new user
     *
     * @param idUser
     * @param passwordUser
     * @param userType
     */
    public User(String idUser, String passwordUser, String userType) {
        this.userType = userType;
        this.idUser = idUser;
        this.passwordUser = passwordUser;
    }

    /**
     * This constructor contains all user data
     *
     * @param userType
     * @param idUser
     * @param passwordUser
     * @param name
     * @param id
     * @param mail
     */
    public User(String userType, String idUser, String passwordUser, String name, String id, String mail) {
        super(name, id, mail);
        this.userType = userType;
        this.idUser = idUser;
        this.passwordUser = passwordUser;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the idUser
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the passwordUser
     */
    public String getPasswordUser() {
        return passwordUser;
    }

    /**
     * @param passwordUser the passwordUser to set
     */
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Override
    public String toString() {
        return super.toString() + "User{" + "userType=" + userType + ", idUser=" + idUser + ", passwordUser=" + passwordUser + '}';
    }

}

package clases;

public class User extends Person {
    private String userType;
    private String idUser;
    private String passwordUser;
private static User instance;

    private User() {
    }

      public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
      }
    public User(String idUser, String passwordUser, String userType) {
        this.userType = userType;
        this.idUser = idUser;
        this.passwordUser = passwordUser;
    }

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
        return super.toString()+"User{" + "userType=" + userType + ", idUser=" + idUser + ", passwordUser=" + passwordUser + '}';
    }
    
    
}

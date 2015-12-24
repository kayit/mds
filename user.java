/**
 * Sisteme kayıtlı kullanıcılara ait değişkenlerin ve methodların tutulduğu class.
 */
public class user {
    public int userID;

    public int getUserID() {

        return userID;
    }

    public void setUserID(int userID) {

        this.userID = userID;
    }

    public String username;
    public String pass;

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPass() {

        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

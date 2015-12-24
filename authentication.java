/**
 * Sisteme giriş kontrollerinin yapıldığı class.
 */
public class authentication {
    public int userID;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        switch (this.userID = userID) {
            case 1:
                // UserID kayıtlı, sisteme gir.
            case 2:
                // UserID kayıtlı değil, login ekranına geri gönder.
                break;
        }
    }

    public String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String pass;
    // Geçici olarak string olarak tutuluyor.
    // Database bağlantısı yapıldığında SQL tarafında kontrolü yapılacak.


    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

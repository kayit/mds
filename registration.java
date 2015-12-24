/**
 * Sisteme kayıt olurken kullanılan değişkenlerin ve methodların tanımları.
 */
public class registration {
    public int userID;
    public String username;

    public boolean isUsernameExist() {
        return Boolean.parseBoolean(username);
        // Kullanıcı adı daha önce başkası tarafından alınmış mı?
    }

    public String email;

    public boolean isEmailValid() {
        return Boolean.parseBoolean(email);
        // Verilen email geçerli bir mail adresi mi?
    }

    public String pass;

    public String userDetails() {
        return null;
        // Username, email, password burada kayıt edilecek.
    }

    public String addUser() {
        return null;
        // userDetails() methodundan alınan bilgilerle database'e yeni kullanıcı eklenecek.
    }
}

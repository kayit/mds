/**
 * Film oyuncuları hakkındaki değişken ve methodların tutulduğu class.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class cast {
    public int castID;
    public String castName;
    public Date castDayOfBirth = new Date();
    SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy"); // Oyuncunun doğum tarihi, 11.10.1989 formatında.

    public String moviesPlayed;

    public int getCastID() {
        return castID;
    }

    public void setCastID(int castID) {
        this.castID = castID;
    }

    public String getCastName() {
        return castName;
    }

    public void setCastName(String castName) {
        this.castName = castName;
    }

    public Date getCastDayOfBirth() {
        return castDayOfBirth;
    }

    public void setCastDayOfBirth(Date castDayOfBirth) {
        this.castDayOfBirth = castDayOfBirth;
    }

    public String getMoviesPlayed() {
        return moviesPlayed;
    }

    public void setMoviesPlayed(String moviesPlayed) {
        this.moviesPlayed = moviesPlayed;
    }
}

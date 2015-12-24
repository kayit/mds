/**
 * Film yönetmenleri hakkındaki değişken ve methodların tutulduğu class.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class director {
    public int directorID;
    public String directorName;

    public Date directorDateOfbirth = new Date();
    SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy"); // Yönetmenin doğum tarihi, 10.11.1989 formatında.

    public String moviesDirected;

    public int getDirectorID() {
        return directorID;
    }

    public void setDirectorID(int directorID) {
        this.directorID = directorID;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public Date getDirectorDateOfbirth() {
        return directorDateOfbirth;
    }

    public void setDirectorDateOfbirth(Date directorDateOfbirth) {
        this.directorDateOfbirth = directorDateOfbirth;
    }

    public String getMoviesDirected() {
        return moviesDirected;
    }

    public void setMoviesDirected(String moviesDirected) {
        this.moviesDirected = moviesDirected;
    }
}

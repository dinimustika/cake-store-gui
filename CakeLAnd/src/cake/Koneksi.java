package cake;

import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Koneksi {
    java.sql.Connection con;
    Statement stm;
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/cakeland", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
}

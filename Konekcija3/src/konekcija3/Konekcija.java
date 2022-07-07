package konekcija3;

import java.sql.*;

public class Konekcija {
    
    public static Statement poveziSe() {
        Connection con = null;
        Statement st = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/korisnici3", "root", "");
            System.out.println("Konekcija je uspela");
            st = con.createStatement();
        } catch (SQLException ex) {
            System.err.println("SQL exception has occured: " + ex);
        }
        return st;
    }
}

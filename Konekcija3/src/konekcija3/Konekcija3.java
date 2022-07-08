package konekcija3;

import java.sql.*;

public class Konekcija3 {

    public static void main(String[] args) throws SQLException {
        UsluzneMetode m  = new UsluzneMetode();
        // m.ubaciKorisnika("John", "Smith");
        // m.ubaciKorisnika("Robert", "Langdon");
        // m.ubaciKorisnika("Mary", "London");
        
        Korisnik k = new Korisnik("Pera", "Peric");
        m.upisiKorisnika(k);
        
        m.ubaciKorisnike();
        
        m.ispisiTabelu();
        
        System.out.println(m);
    }
    
}

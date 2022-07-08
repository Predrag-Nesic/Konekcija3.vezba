package konekcija3;

import java.sql.*;
import java.util.ArrayList;

public class UsluzneMetode {
    private Statement st;
    private ResultSet rs;
    private ArrayList<Korisnik> korisnici;
    
    public UsluzneMetode() {
        st = Konekcija.poveziSe();
        korisnici = new ArrayList<>();
    }
    
    public int vratiBrRedova() throws SQLException {
        rs = st.executeQuery("select * from korisnici3");
        int brRedova = 0;
        while(rs.next()) {
            brRedova++;
        }
        return brRedova;
    }
    
    public void ubaciKorisnika(String ime, String prezime) throws SQLException {
        st.executeUpdate("insert into korisnici3(korisnik_id, ime, prezime)"
                + " values (null, '" + ime + "', '" + prezime + "')");
    }
    
    public void upisiKorisnika(Korisnik k) throws SQLException {
        st.executeUpdate("insert into korisnici3(korisnik_id, ime, prezime)"
                + " values (null, '" + k.getIme() + "', '" + k.getPrezime() + "')");
    }
    
    public void ubaciKorisnike() throws SQLException {
        rs = st.executeQuery("select * from korisnici3");
        while(rs.next()) {
            korisnici.add(new Korisnik(rs.getInt(1), rs.getString("ime"), rs.getString("prezime")));
        }
    }
    
    public void ispisiTabelu() throws SQLException {
        rs = st.executeQuery("select * from korisnici3");
        while(rs.next()) {
            System.out.println(rs.getInt("korisnik_id") + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Korisnik k : korisnici) {
            sb.append(k  + "\n");
        }
        return sb.toString();
    }
}

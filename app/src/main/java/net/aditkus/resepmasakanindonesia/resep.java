package net.aditkus.resepmasakanindonesia;

/**
 * Created by Aditya on 01-Oct-17.
 */

public class resep {

    private String Judulresep;
    private String deskripsimakanan;
    private int Gambar;
    private String isiResep;
    private String menuBar;


    public resep(String judulresep, String deskripsimakanan, int gambar, String isiResep, String menuBar) {
        this.Judulresep = judulresep;
        this.deskripsimakanan = deskripsimakanan;
        this.Gambar = gambar;
        this.isiResep = isiResep;
        this.menuBar = menuBar;
    }

    public String getJudulresep() {
        return Judulresep;
    }

    public String getDeskripsimakanan() {
        return deskripsimakanan;
    }

    public int getGambar() {return Gambar; }

    public String getIsiResep() {
        return isiResep;
    }

    public String getMenuBar() { return menuBar;}
}

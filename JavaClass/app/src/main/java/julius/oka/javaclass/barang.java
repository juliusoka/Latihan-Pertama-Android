package julius.oka.javaclass;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class barang {
    private String nama;
    private int kategori;
    private int harga;
    public static final int elektronik = 1;
    public static final int non_elektronik = 2;

    public void setNama(String nama){
        this.nama = nama;
    }

    public String toString(){
        return nama+" | "+this.getStringKategori()+" | "+this.harga+"\n";
    }
    public String nama()
    {
        return this.nama;
    }

    public String getNama() {
        return nama;
    }

    public int getKategori() {return kategori;}
    public String getStringKategori(){
        if (kategori==1)
            return "elektronik";
        else
            return "non elektronik";
    }

    public void setKategori(int kategori) {
        if(kategori != 1 && kategori !=2)
            this.kategori=2;
        else
            this.kategori = kategori;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public barang(String nama, int kategori, int harga) {
        this.nama = nama;
        this.setKategori(kategori);
        this.harga = harga;
    }
}

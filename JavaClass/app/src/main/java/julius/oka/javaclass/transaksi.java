package julius.oka.javaclass;

import java.util.ArrayList;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class transaksi {
    private ArrayList<barang> listbarang=new ArrayList<>();

    public void addBarang(barang Barang){
        this.listbarang.add(Barang);
    }
    public int totalTransaksi(){
        int hasil=0;
        for(int i=0; i< listbarang.size();i++)
        {
            hasil+=listbarang.get(i).getHarga();
        }
        return hasil;
    }
    public String printTransaksi(){
        String text="Barang yang di beli \n";
        text +="-------------------------\n";
        for(int i=0;i<listbarang.size();i++){
            text +=listbarang.get(i).toString();
        }
        text +="-------------------\n";
        text +="Total Pembelian : "+totalTransaksi()+"\n";
        text +="-------------------\n";
        text +="Rata Rata Pembelian : "+average()+"\n";
        text +="-------------------\n";
        return text;
    }
    public Double average(){
        double hasil=0;
//        for(int i=0; i< listbarang.size();i++)
//        {
//            hasil+=totalTransaksi()/listbarang.size();  (bisa pake ini atau langsungan)
//        }
        return hasil=totalTransaksi()/listbarang.size();
    }

    public String max()
    {
        barang max;

        max = listbarang.get(0);
        for(int i=0; i<listbarang.size();i++)
        {
            if(listbarang.get(i).getHarga() > max.getHarga())
            {
                max = listbarang.get(i);
            }
        }

        String namaBarang = max.getNama();
        int hargabarang = max.getHarga();
        String text = "Barang Termahal Pada Transaksi di Atas Adalah : "+namaBarang+" Sebesar : "+hargabarang;
        return text;
//        String namaBarang ="";
//        String text = "Barang Termahal Pada Transaksi adalah "+namaBarang;


    }
}

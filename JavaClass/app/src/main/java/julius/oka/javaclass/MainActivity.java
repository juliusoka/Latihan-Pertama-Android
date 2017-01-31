package julius.oka.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String showString;
    public TextView showText;
    public barang [] arrbarang = new barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText=(TextView) findViewById(R.id.show_text);

        showString="Toko Serba Ada";
        addSeparator();

        initBarang();
        showString += arrbarang[3].toString();
        addSeparator();
        showString += arrbarang[3].toString();
        showText.setText(showString);
    }

    private void addSeparator() {
        showString+="\n--------------------------\n";
    }

    public void initBarang(){
        arrbarang [0] = new barang("Laptop",1,7000000);
        arrbarang [1] = new barang("Printer",barang.elektronik,1500000);
        arrbarang [2] = new barang("Keyboard",barang.elektronik,150000);
        arrbarang [3] = new barang("Mouse",barang.elektronik,100000);
        arrbarang [4] = new barang("Jam",barang.elektronik,300000);
        arrbarang [5] = new barang("Sepatu",barang.non_elektronik,400000);
        arrbarang [6] = new barang("HP",barang.elektronik,2000000);
        arrbarang [7] = new barang("Petelot",barang.non_elektronik,3000);
        arrbarang [8] = new barang("Topi",barang.non_elektronik,60000);
        arrbarang [9] = new barang("Baju",barang.non_elektronik,100000);
    }
}

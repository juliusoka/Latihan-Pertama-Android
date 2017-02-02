package julius.oka.geometrycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.geometry);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.geo_operator, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView text1=(TextView) findViewById(R.id.txt1);
        TextView text2=(TextView) findViewById(R.id.txt2);
        EditText input2 = (EditText) findViewById(R.id.input2);

        String operator=parent.getItemAtPosition(position).toString();
        if(operator.equalsIgnoreCase("Lingkaran")){
            text1.setText("jari-jari");

            input2.setEnabled(false);
            text2.setText("");
        } else if(operator.equalsIgnoreCase("Segitiga")){
            text1.setText("Alas");
            text2.setText("Tinggi");
            input2.setEnabled(true);
        } else if(operator.equalsIgnoreCase("Persegi")){
            text1.setText("Panjang");
            text2.setText("Lebar");
            input2.setEnabled(true);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void calculate(View view){
        EditText input1=(EditText) findViewById(R.id.input1);
        EditText input2=(EditText) findViewById(R.id.input2);
        Spinner spinner=(Spinner) findViewById(R.id.geometry);

        String operator=spinner.getSelectedItem().toString();
        String hasil="";
        double inp1=Double.parseDouble(input1.getText().toString());
        double inp2=Double.parseDouble(input1.getText().toString());
        if(operator.equalsIgnoreCase("Persegi")){
            hasil="luas persegi adalah "+(inp1*inp2)+"\n";
            hasil+="keliling persegi adalah "+((2*inp1)+(2*inp2));
        } else if(operator.equalsIgnoreCase("Segitiga")){
            hasil = "luas dari segitiga siku-siku adalah "+(0.5*(inp1*inp2))+"\n";
            double hyp=Math.sqrt((inp1*inp1)+(inp2*inp2));
            hasil += "keliling dari segitiga siku-siku adalah "+(inp1+inp2+hyp);
        } else if (operator.equalsIgnoreCase("Lingkaran")){
            hasil = "luas lingkarang adalah "+(Math.PI*(inp1*inp1))+"\n";
            hasil += "keliling lingkaran adalah "+(Math.PI*(2*inp1));
        }
        TextView result=(TextView)findViewById(R.id.result);
        result.setText(hasil);
    }
}


package julius.oka.multifunction;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentExecutor extends AppCompatActivity {

    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_executor);

        Button btn = (Button) findViewById(R.id.button_execute);
        Intent intent = getIntent();
        operator = intent.getStringExtra(MainActivity.EXTRA);
        if(operator.equals("browser")){
            btn.setText("Buka Browser");
        } else if(operator.equals("phone")){
            btn.setText("Buka No Telepon");
        } else if(operator.equals("map")){
            btn.setText("Aku Peta");
        }

    }

    public void execute(View view){
        Intent exeIntent = null;
        EditText txtExec = (EditText) findViewById(R.id.txt_exec);
        String exec = txtExec.getText().toString();
        if(operator.equals("browser")){
            Uri webpage = Uri.parse("http://"+exec);
            exeIntent = new Intent(Intent.ACTION_VIEW, webpage);
        }else if(operator.equals("phone")){
            Uri number = Uri.parse("tel:"+exec);
            exeIntent = new Intent(Intent.ACTION_DIAL, number);
            txtExec.setEnabled(false);
        }else if(operator.equals("map")){
            Uri gmnIntentUri = Uri.parse("geo:"+exec);
            exeIntent = new Intent(Intent.ACTION_VIEW, gmnIntentUri);
        }
        startActivity(exeIntent);
    }
}

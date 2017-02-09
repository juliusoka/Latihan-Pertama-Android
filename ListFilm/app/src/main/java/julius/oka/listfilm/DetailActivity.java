package julius.oka.listfilm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent=getIntent();
        Movie movie=(Movie) intent.getSerializableExtra("Julius");

        ((TextView)findViewById(R.id.title)).setText(movie.title);
        ((TextView)findViewById(R.id.description)).setText(movie.description);
        ((TextView)findViewById(R.id.year)).setText("tahun : "+movie.year);
        ((TextView)findViewById(R.id.rating)).setText("rating : "+movie.rating);
    }
}

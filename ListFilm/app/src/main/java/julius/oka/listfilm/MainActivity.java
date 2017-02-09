package julius.oka.listfilm;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String [] filmTitles={"The Has Singing","The Flash Slinging","The Slash Singing","The Singing Slash","The Hash Slinging Slasher"};

    private ArrayList<Movie> movies=new ArrayList<>();

    private void initMovies(){
        movies.add(new Movie("The Has Singing","Film tentang Palu yang di bawa orang aneh Untuk perang",7.9,2010));
        movies.add(new Movie("The Flash Slinging","Film tentang seseorang yang pandai sulap",8.0,2011));
        movies.add(new Movie("The Slash Singing","Film tentang Orang yang sedang berjalan",8.1,1999));
        movies.add(new Movie("The Singing Slash","Film tentang burung yang sedang main",8.0,2018));
        movies.add(new Movie("The Hash Slinging Slasher","Film tentang Permainan Sulap oleh robot",7.0,2011));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMovies();
        ArrayAdapter<Movie> adapter = new ArrayAdapter<Movie>(this,android.R.layout.simple_list_item_1, movies);
        ListView listView=(ListView) findViewById(R.id.List_film);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Movie selectedMovie=movies.get(position);
                Intent intent=new Intent(getBaseContext(),DetailActivity.class);
                intent.putExtra("Julius",selectedMovie);
                startActivity(intent);
            }
        });
    }
}

package at.fh.swengb.freeskilist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.freeskilist.model.Freeski;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Freeski> listFreeski;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listFreeski = new ArrayList<>();
        listFreeski.add(new Freeski("Salomon CZAR",190,55,"Black",true,true));
        listFreeski.add(new Freeski("K2 Hellbent",189,22,"Black, Yellow, Blue",true,true));
        listFreeski.add(new Freeski("Atomic Bent Chetler",192,20,"Light Brown",true,true));
        listFreeski.add(new Freeski("Salomon Rocker2",184,26,"Black, White",true,true));
        listFreeski.add(new Freeski("Atomic Automatic",186,19,"Red",true,true));
        listFreeski.add(new Freeski("Salomon BBR",186,14,"Blue",true,true));


        myListView = (ListView) findViewById(R.id.myFreeskiList);

        myAdapter = new CustomAdapter(this,listFreeski);
        // take every user element of this list and create on instance of the row_item_simple layout and put the date into the textviewViewSimpleName
        // This ArrayAdapter can only adapt Strings!

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        Freeski selectedFreeski = listFreeski.get(i);
        Intent intent = new Intent(view.getContext(),ShowFreeskiActivity.class);
        intent.putExtra("freeski",selectedFreeski);
        startActivity(intent);
    }
}

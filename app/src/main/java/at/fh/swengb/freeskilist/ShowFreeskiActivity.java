package at.fh.swengb.freeskilist;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.freeskilist.model.Freeski;

public class ShowFreeskiActivity extends AppCompatActivity {
    private Freeski freeski;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_freeski);

        Intent intent = getIntent();
        freeski = (Freeski) intent.getExtras().get("freeski");

        TextView viewFirstName = (TextView) findViewById(R.id.textViewListBrand);
        TextView viewLastName = (TextView) findViewById(R.id.textViewListLength);
        TextView viewAddress = (TextView) findViewById(R.id.textViewListRadius);
        TextView viewPhone = (TextView) findViewById(R.id.textViewListColor);

        viewFirstName.setText(freeski.getBrand());
        viewLastName.setText(String.valueOf(freeski.getLength()));
        viewAddress.setText(String.valueOf(freeski.getRadius()));
        viewPhone.setText(freeski.getColor());

    }

    public void webSearchBrand(View view) {
        Uri uri = Uri.parse("http://www.google.com/#q="+freeski.getBrand());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void youtubeSearchBrand(View view) {
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query="+freeski.getBrand());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}

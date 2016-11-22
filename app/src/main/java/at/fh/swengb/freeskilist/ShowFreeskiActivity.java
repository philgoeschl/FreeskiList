package at.fh.swengb.freeskilist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.freeskilist.model.Freeski;

/**
 * Created by phgo_000 on 22.11.2016.
 */

public class ShowFreeskiActivity {
    private Freeski freeski;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_freeski);

        Intent intent = getIntent();
        freeski = (Freeski) intent.getExtras().get("freeski");

        TextView viewBrand = (TextView) findViewById(R.id.textViewListBrand);
        TextView viewLength = (TextView) findViewById(R.id.textViewListLength);
        TextView viewRadius = (TextView) findViewById(R.id.textViewListRadius);
        TextView viewColor = (TextView) findViewById(R.id.textViewListColor);


        viewBrand.setText(freeski.getBrand());
        viewLength.setText(freeski.getLength());
        viewRadius.setText(freeski.getRadius());
        viewColor.setText(freeski.getColor());

    }


}

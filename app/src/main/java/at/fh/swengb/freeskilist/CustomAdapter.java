package at.fh.swengb.freeskilist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.freeskilist.model.Freeski;

/**
 * Created by phgo_000 on 16.11.2016.
 */

public class CustomAdapter extends BaseAdapter {
    List<Freeski> listFreeski;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Freeski> listFreeski) {
        this.context = applicationContext;
        this.listFreeski= listFreeski;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listFreeski.size();
    }

    @Override
    public Object getItem(int i) {
        return listFreeski.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewBrand=(TextView)view.findViewById(R.id.textViewListBrand);
        TextView viewLength=(TextView)view.findViewById(R.id.textViewListLength);
        TextView viewRadius=(TextView)view.findViewById(R.id.textViewListRadius);
        TextView viewColor=(TextView)view.findViewById(R.id.textViewListColor);

        Freeski freeski = listFreeski.get(i);
        viewBrand.setText(freeski.getBrand());
        viewLength.setText(String.valueOf(freeski.getLength()));
        viewRadius.setText(String.valueOf(freeski.getRadius()));
        viewColor.setText(freeski.getColor());

        return view;
    }
}

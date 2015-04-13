package org.blashadow.adapterexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by blashadow on 4/12/15.
 */
public class EventoAdapter extends ArrayAdapter<Evento> {

    private Context context;
    private int itemLayout;

    public EventoAdapter(Context context, int resource, Evento[] objects) {
        super(context, resource, objects);

        this.context = context;
        this.itemLayout = resource;
    }

    public EventoAdapter(Context context, int resource) {
        super(context, resource);

        this.context = context;
        this.itemLayout = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rootView = convertView;

        if(rootView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            rootView = inflater.inflate(itemLayout,null);
        }

        Evento item = getItem(position);

        TextView titleView = (TextView)rootView.findViewById(R.id.titulo);
        TextView detallesTxt = (TextView)rootView.findViewById(R.id.titulo);

        titleView.setText(item.getTitulo());
        detallesTxt.setText(item.getDetalles());

        return  rootView;
    }
}

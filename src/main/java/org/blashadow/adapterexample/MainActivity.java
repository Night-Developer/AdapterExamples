package org.blashadow.adapterexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Lista simple
        ListView simple = (ListView)findViewById(R.id.simple_list);

        //creamos nuestro data source
        String[] dias = new String[]{"Lunes","Martes","Miercole","Jueves","Viernes","Sabado"};

        //instanciamos nuestro adaptador
        ListAdapter simpleAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dias);

        simple.setAdapter(simpleAdapter);


        //Lista compleja
        ListView complex = (ListView)findViewById(R.id.complex_list);

        Evento[] data = new Evento[5];

        data[0] = new Evento("titulo","detalle");
        data[1] = new Evento("titulo","detalle");
        data[2] = new Evento("titulo","detalle");
        data[3] = new Evento("titulo","detalle");
        data[4] = new Evento("titulo","detalle");

        ListAdapter compleAdapter = new EventoAdapter(this,R.layout.list_item_evento,data);

        complex.setAdapter(compleAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

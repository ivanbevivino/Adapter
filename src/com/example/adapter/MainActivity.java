package com.example.adapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
 public class MainActivity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Array que asociaremos al adaptador
  		String[] array = new String[] {"Uno","Dos","Tres","Cuatro","Cinco"};
         //Creación del adaptador, vamos a escoger el layout simple_list_item_1, que los mostrara
        ListAdapter adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);
 
        //Asociamos el adaptador a la vista.
        ListView lv = (ListView) findViewById(android.R.id.list);
        lv.setAdapter(adaptador);
     }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
      super.onListItemClick(l, v, position, id);
       Toast.makeText( MainActivity.this,l.getItemAtPosition(position).toString(),Toast.LENGTH_LONG) .show();
       // Muestra un mensaje al presionar sobre un item de la lista
    }
}
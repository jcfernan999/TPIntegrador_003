package com.example.tpintegrador_003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }
    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.c1,"San Luis",40000));
        lista.add(new Inmueble(R.drawable.c2,"Merlo",45000));
        lista.add(new Inmueble(R.drawable.c3,"Junin",20000));
    }

    public void generarListView(){
        ArrayAdapter<Inmueble> adapter = new ListaInmuebleAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv = findViewById(R.id.milista);
        lv.setAdapter(adapter);
    }
}

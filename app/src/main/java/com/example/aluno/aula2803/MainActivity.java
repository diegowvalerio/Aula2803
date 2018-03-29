package com.example.aluno.aula2803;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener{

    private ListView listviewCarro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listviewCarro = (ListView) findViewById(R.id.listacarro);

        String carros[] = {"Carro1","Carro2","Carro3","Carrro4"};

        ArrayAdapter<String> adptercar = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,carros);

        List<Time> ltimes = new ArrayList<>();
        ltimes.add(new Time(1L,"Gremio","Porto",R.drawable.autonomo));
        Adaptertime adapter = new Adaptertime(this, ltimes);

        listviewCarro.setAdapter(adapter);

        //listviewCarro.setAdapter(adptercar);
        listviewCarro.setOnItemClickListener(this);
        listviewCarro.setOnItemLongClickListener(this);
    }



    public  void chamarseundatela(View view){
        Intent intent = new Intent(this, SegundaTela.class);
        intent.putExtra("timeCampeao","Palmeiras");
        intent.putExtra("titulos",10);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("Mainactivity",parent.getItemAtPosition(position).toString());
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("Mainactivity",parent.getItemAtPosition(position).toString());

        return true;
    }
}

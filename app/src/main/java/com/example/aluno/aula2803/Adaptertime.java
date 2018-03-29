package com.example.aluno.aula2803;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aluno on 28/03/18.
 */

public class Adaptertime extends BaseAdapter{

    Context contexto;
    List<Time> times;

    public Adaptertime(Context contexto, List<Time> times) {
        this.contexto = contexto;
        this.times = times;
    }

    @Override
    public int getCount() {
        return times.size();
    }

    @Override
    public Object getItem(int position) {
        return times.get(position);
    }

    @Override
    public long getItemId(int position) {
        return times.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewlinha = LayoutInflater.from(contexto).inflate(R.layout.linha_lista_carros,parent,false);

        ImageView imagem = (ImageView) viewlinha.findViewById(R.id.imagemcarro);
        TextView textnome = (TextView) viewlinha.findViewById(R.id.textViewnome);
        TextView texttitulos = (TextView) viewlinha.findViewById(R.id.texViewTitulo);

        Time time = times.get(position);

        imagem.setImageResource(time.getImagem());
        textnome.setText(time.getNome());
        texttitulos.setText(time.getCidade());

        return null;
    }
}

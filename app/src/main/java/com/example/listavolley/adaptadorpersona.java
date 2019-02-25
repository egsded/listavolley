package com.example.listavolley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class adaptadorpersona extends BaseAdapter {
    List<persona> lp;
    Context c;
    public adaptadorpersona(Context c,List<persona>lp){
        this.lp=lp;
        this.c =c;
    }
    @Override
    public int getCount() {
        return lp.size();
    }

    @Override
    public Object getItem(int position) {
        return lp.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lp.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li = LayoutInflater.from(c);
        convertView = (View) li.inflate(R.layout.itemd,null);
        persona p = (persona) getItem(position);
        TextView txnombre = (TextView) convertView.findViewById(R.id.lnlnombre);
        TextView txapellido = (TextView) convertView.findViewById(R.id.lnlapellido);
        TextView txedad = (TextView) convertView.findViewById(R.id.lnledad);
        txnombre.setText(p.getNombre());
        txapellido.setText(p.getApellido());
        txedad.setText(p.getEdad().toString());
        return convertView;
    }
}

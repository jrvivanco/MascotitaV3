package org.jrvivanco.mascotitav3.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jrvivanco.mascotitav3.R;
import org.jrvivanco.mascotitav3.pojo.Mascota;
import java.util.ArrayList;

/**
 * Created by jrvivanco on 16/12/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<mascotaViewHolder>{

    private ArrayList<Mascota> item;

    public MascotaAdaptador(ArrayList<Mascota> item){
        this.item = item;
    }


    @Override
    public mascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        mascotaViewHolder mascota = new mascotaViewHolder(v);
        return mascota;
    }

    @Override
    public void onBindViewHolder(mascotaViewHolder mascotaHolder, int position) {
        mascotaHolder.nombre.setText(this.item.get(position).getNombre());
        mascotaHolder.foto.setImageResource(this.item.get(position).getFoto());
        mascotaHolder.rating.setText(String.valueOf(this.item.get(position).getRating()));
    }

    @Override
    public int getItemCount() {
        return this.item.size();
    }
}

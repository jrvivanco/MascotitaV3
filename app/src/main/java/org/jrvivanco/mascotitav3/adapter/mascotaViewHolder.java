package org.jrvivanco.mascotitav3.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.jrvivanco.mascotitav3.R;

/**
 * Created by jrvivanco on 16/12/2016.
 */
public class mascotaViewHolder extends RecyclerView.ViewHolder {

    TextView nombre;
    ImageView foto;
    TextView rating;

    public mascotaViewHolder(View itemView) {
        super(itemView);
        nombre = (TextView) itemView.findViewById(R.id.tv_Nombre);
        foto = (ImageView) itemView.findViewById(R.id.iv_Mascota);
        rating = (TextView) itemView.findViewById(R.id.tv_Rating);
    }
}

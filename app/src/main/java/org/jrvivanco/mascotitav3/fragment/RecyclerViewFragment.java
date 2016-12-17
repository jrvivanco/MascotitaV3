package org.jrvivanco.mascotitav3.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.jrvivanco.mascotitav3.R;
import org.jrvivanco.mascotitav3.adapter.MascotaAdaptador;
import org.jrvivanco.mascotitav3.pojo.Mascota;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewFragment extends Fragment {

    private RecyclerView reciclador;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter recyclerAdapter;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        mascotas = new ArrayList<>();

        mascotas.add(new Mascota("Ashera", R.drawable.ashera,  3));
        mascotas.add(new Mascota("Maine Coon", R.drawable.maine_coon,  15));
        mascotas.add(new Mascota("Persa", R.drawable.persa,  7));
        mascotas.add(new Mascota("Ragdoll", R.drawable.ragdoll,  18));
        mascotas.add(new Mascota("Ruso Azul", R.drawable.ruso_azul,  9));
        mascotas.add(new Mascota("Siames", R.drawable.siames,  22));
        mascotas.add(new Mascota("Siberiano", R.drawable.siberiano,  6));

        reciclador = (RecyclerView) v.findViewById(R.id.rv_Reciclador);
        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        reciclador.setLayoutManager(layoutManager);

        recyclerAdapter = new MascotaAdaptador(mascotas);
        reciclador.setAdapter(recyclerAdapter);
        return v;
    }

}

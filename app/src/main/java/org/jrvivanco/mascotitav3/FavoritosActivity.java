package org.jrvivanco.mascotitav3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
//import android.widget.Toast;
import java.util.ArrayList;
import org.jrvivanco.mascotitav3.adapter.MascotaAdaptador;
import org.jrvivanco.mascotitav3.pojo.Mascota;

public class FavoritosActivity extends AppCompatActivity {

    private RecyclerView recicladorFav;
    private RecyclerView.LayoutManager layoutManagerFav;
    private RecyclerView.Adapter recyclerAdapterFav;
    private ArrayList<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSub);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //Toast.makeText(FavoritosActivity.this, "Mensaje de prueba", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Siames", R.drawable.siames,  22));
        mascotas.add(new Mascota("Ragdoll", R.drawable.ragdoll,  18));
        mascotas.add(new Mascota("Maine Coon", R.drawable.maine_coon,  15));
        mascotas.add(new Mascota("Ruso Azul", R.drawable.ruso_azul,  9));
        mascotas.add(new Mascota("Persa", R.drawable.persa,  7));

        recicladorFav = (RecyclerView) findViewById(R.id.rv_ReciclaFav);
        layoutManagerFav = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recicladorFav.setLayoutManager(layoutManagerFav);

        recyclerAdapterFav = new MascotaAdaptador(mascotas);
        recicladorFav.setAdapter(recyclerAdapterFav);

    }
}

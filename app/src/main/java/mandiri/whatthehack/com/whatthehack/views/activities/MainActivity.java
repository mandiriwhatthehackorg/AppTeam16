package mandiri.whatthehack.com.whatthehack.views.activities;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import mandiri.whatthehack.com.whatthehack.R;
import mandiri.whatthehack.com.whatthehack.data.models.Mutasi;
import mandiri.whatthehack.com.whatthehack.data.models.Promo;
import mandiri.whatthehack.com.whatthehack.presenters.adapters.MutasiAdapter;
import mandiri.whatthehack.com.whatthehack.presenters.adapters.PromoAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<Mutasi> mutasiArrayList;
    private ArrayList<Promo> promoArrayList;
    private RecyclerView recyclerView, promoRecyclerView;

    private MutasiAdapter mutasiAdapter;
    private PromoAdapter promoAdapter;

    private CardView investasiButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView = (RecyclerView) findViewById(R.id.rvMutasi);
        promoRecyclerView = (RecyclerView) findViewById(R.id.rvPromo);

        mutasiArrayList = new ArrayList<>();
        provideMutasi();
        mutasiAdapter = new MutasiAdapter(mutasiArrayList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mutasiAdapter);

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        promoArrayList = new ArrayList<>();
        providePromo();
        promoAdapter = new PromoAdapter(promoArrayList);
        promoRecyclerView.setLayoutManager(layoutManager);
        promoRecyclerView.setAdapter(promoAdapter);

        investasiButton = (CardView) findViewById(R.id.investasiButton);
        investasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(), InvestasiActivity.class);
                startActivity(intent);
            }
        });
    }

    private void provideMutasi() {
        Mutasi mutasi1 = new Mutasi("", "Nouri Olshop", "60.000", false);
        Mutasi mutasi2 = new Mutasi("", "Handayani", "400.000", true);
        Mutasi mutasi3 = new Mutasi("", "Budiyanto", "10.000.000", true);

        mutasiArrayList.add(mutasi1);
        mutasiArrayList.add(mutasi2);
        mutasiArrayList.add(mutasi3);

    }

    private void providePromo() {
        Promo promo = new Promo("Buy 1 Get 1", "Beli 1 Gratis 1", "");
        Promo promo2 = new Promo("Buy 2 Get 2", "Beli 2 Gratis 2", "");

        promoArrayList.add(promo);
        promoArrayList.add(promo2);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.investasiButton :
                Intent intent = new Intent(getBaseContext(), InvestasiActivity.class);
                startActivity(intent);
        }
    }
}

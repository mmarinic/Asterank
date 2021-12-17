package com.marinic;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements com.marinic.AdapterListe.ItemClickInterface {

    private com.marinic.AdapterListe adapterListe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterListe = new com.marinic.AdapterListe(this);
        adapterListe.setClickListener(this);
        recyclerView.setAdapter(adapterListe);
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
        ucitaj();
    }


    private void ucitaj() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.asterank.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AsterankSucelje AsterankSucelje = retrofit.create(AsterankSucelje.class);
        Call<List<Asterank>> call = AsterankSucelje.dohvatiAsterank();

        call.enqueue(new Callback<List<Asterank>>() {
            @Override
            public void onResponse(Call<List<Asterank>> call, Response<List<Asterank>> response) {
                if (!response.isSuccessful()) {
                    return;

                }

                Asteranks asteranks = new Asteranks();
                asteranks.setAsterankList(response.body());
                adapterListe.setAsteranks(asteranks.getAsterankList());
                adapterListe.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<List<Asterank>> call, Throwable t) {
                System.out.println(t.toString());
            }

        });

    }

    @Override
    public void onItemClick(View view, int position) {

        Asterank asterank = adapterListe.getAsterank(position);
        Intent intent = new Intent(this, com.marinic.SecondActivity.class);
        intent.putExtra("asterank", asterank);
        startActivity(intent);

    }
}

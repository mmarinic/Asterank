package com.marinic;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AsterankSucelje {

    @GET("mpc?limit=20")
    Call<List<Asterank>>  dohvatiAsterank();
}

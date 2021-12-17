package com.marinic;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);


        TextView asterankTxt = findViewById(R.id.asterank);
        TextView epoch = findViewById(R.id.epoch);
        TextView rms = findViewById(R.id.rms);
        TextView h = findViewById(R.id.h);
        TextView num_obs = findViewById(R.id.num_obs);
        Button back = findViewById(R.id.back);

        Intent intent = getIntent();
        Asterank asterank = (Asterank) intent.getSerializableExtra("asterank");

        if (asterank != null) {
            asterankTxt.setText(asterank.getReadableDes());
            epoch.setText("Epoch: "+asterank.getEpoch());
            rms.setText("Rms: "+asterank.getRms().toString());
            h.setText("H: "+asterank.getH().toString());
            num_obs.setText("Num_obs: "+asterank.getNumObs());

        }

        back.setOnClickListener(v -> finish());

    }
}

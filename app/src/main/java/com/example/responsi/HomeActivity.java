package com.example.responsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.responsi.fragment.HistoryFragment;
import com.example.responsi.fragment.HomeFragment;
import com.example.responsi.fragment.PaymentFragment;
import com.example.responsi.fragment.SettingFragment;

public class HomeActivity extends AppCompatActivity {
    private Button btn_home;
    private Button btn_payment;
    private Button btn_history;
    private Button btn_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_home = (Button) findViewById(R.id.btn_home);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HomeFragment.class);
                HomeActivity.this.startActivity(intent);
                HomeActivity.this.finish();
            }
        });

        btn_payment = (Button) findViewById(R.id.btn_payment);
        btn_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PaymentFragment.class);
                HomeActivity.this.startActivity(intent);
                HomeActivity.this.finish();
            }
        });

        btn_history = (Button) findViewById(R.id.btn_history);
        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HistoryFragment.class);
                HomeActivity.this.startActivity(intent);
                HomeActivity.this.finish();
            }
        });

        btn_setting = (Button) findViewById(R.id.btn_setting);
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, SettingFragment.class);
                HomeActivity.this.startActivity(intent);
                HomeActivity.this.finish();
            }
        });
    }
}
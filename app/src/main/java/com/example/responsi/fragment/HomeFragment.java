package com.example.responsi.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.responsi.HomeActivity;
import com.example.responsi.LoginActivity;
import com.example.responsi.R;
import com.example.responsi.RecoveryActivity;

public class HomeFragment extends AppCompatActivity {
    private Button btn_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        btn_1= (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this, HomeActivity.class);
                HomeFragment.this.startActivity(intent);
                HomeFragment.this.finish();
            }
        });
    }
}
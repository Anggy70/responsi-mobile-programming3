package com.example.responsi.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.responsi.HomeActivity;
import com.example.responsi.R;

public class SettingFragment extends AppCompatActivity {
    private Button btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_setting);

        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingFragment.this, HomeActivity.class);
                SettingFragment.this.startActivity(intent);
                SettingFragment.this.finish();
            }
        });
    }
}
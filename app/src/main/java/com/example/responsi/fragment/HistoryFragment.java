package com.example.responsi.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.responsi.HomeActivity;
import com.example.responsi.R;

public class HistoryFragment extends AppCompatActivity {
    private Button btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_history);

        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryFragment.this, HomeActivity.class);
                HistoryFragment.this.startActivity(intent);
                HistoryFragment.this.finish();
            }
        });
    }
}
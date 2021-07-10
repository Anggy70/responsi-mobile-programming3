package com.example.responsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.responsi.fragment.HomeFragment;

public class RecoveryActivity extends AppCompatActivity {
    private Button btn_recovery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);

        btn_recovery= (Button) findViewById(R.id.btn_Recovery);
        btn_recovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecoveryActivity.this, LoginActivity.class);
                RecoveryActivity.this.startActivity(intent);
                RecoveryActivity.this.finish();
            }
        });
    }
}
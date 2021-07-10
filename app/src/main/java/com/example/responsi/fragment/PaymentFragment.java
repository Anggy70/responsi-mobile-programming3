package com.example.responsi.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.responsi.HomeActivity;
import com.example.responsi.LoginActivity;
import com.example.responsi.PaymentActivity;
import com.example.responsi.R;
import com.example.responsi.RecoveryActivity;

public class PaymentFragment extends AppCompatActivity {
    private Button btn_2;
    private Button code;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_payment);

        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaymentFragment.this, HomeActivity.class);
                PaymentFragment.this.startActivity(intent);
                PaymentFragment.this.finish();
            }
        });

        code = (Button) findViewById(R.id.code);
        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaymentFragment.this, PaymentActivity.class);
                PaymentFragment.this.startActivity(intent);
                PaymentFragment.this.finish();
            }
        });
    }
}
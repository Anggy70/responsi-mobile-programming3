package com.example.responsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.responsi.database.DBHelper;

public class LoginActivity extends AppCompatActivity {
    EditText TxEmail, TxPassword;
    Button BtnLogin;
    DBHelper dbHelpere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TxEmail = (EditText)findViewById(R.id.txEmail);
        TxPassword = (EditText)findViewById(R.id.txPassword);
        BtnLogin = (Button) findViewById(R.id.btnLogin);

        dbHelpere = new DBHelper(this);

        TextView tvCreateAccount = (TextView)findViewById(R.id.tvCreateAccount);
        TextView tvRecoveryAccount = (TextView)findViewById(R.id.tvRecoveryAccount);

        tvRecoveryAccount.setText(fromHtml("Forgot Password?" +
                "</font><font color='#3b5998'>Click Here</font>"));

        tvCreateAccount.setText(fromHtml("Haven't Account? " +
                "</font><font color='#3b5998'>register</font>"));

        tvRecoveryAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RecoveryActivity.class));
            }
        });

        tvCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = TxEmail.getText().toString().trim();
                String password = TxPassword.getText().toString().trim();
                Boolean res = dbHelpere.checkUser(email, password);
                if (res == true){
                    Toast.makeText(LoginActivity.this, "Login Sucessful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                }else {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public static Spanned fromHtml(String html){
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        }else {
            result = Html.fromHtml(html);
        }
        return result;

    }
}
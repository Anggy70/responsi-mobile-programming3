package com.example.responsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
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

public class RegisterActivity extends AppCompatActivity {
    EditText TxEmail, TxPassword, TxConPassword;
    Button BtnRegister;
    DBHelper dbHelpere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        dbHelpere = new DBHelper(this);

        TxEmail = (EditText) findViewById(R.id.txEmailReg);
        TxPassword = (EditText) findViewById(R.id.txPasswordReg);
        TxConPassword = (EditText) findViewById(R.id.txConPassword);
        BtnRegister = (Button) findViewById(R.id.btnRegister);

        TextView tvRegister = (TextView) findViewById(R.id.tvRegister);

        tvRegister.setText(fromHtml("Back to" +
                "</font><font color='#3b5998'>Login</font>"));

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });

        BtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = TxEmail.getText().toString().trim();
                String password = TxPassword.getText().toString().trim();
                String conPassword = TxConPassword.getText().toString().trim();

                ContentValues values = new ContentValues();

                if (!password.equals(conPassword)) {
                    Toast.makeText(RegisterActivity.this, "Password not match", Toast.LENGTH_SHORT).show();
                } else if (password.equals("") || username.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Password or password  cannot be empty", Toast.LENGTH_SHORT).show();
                } else {
                    values.put(DBHelper.row_email, username);
                    values.put(DBHelper.row_password, password);
                    dbHelpere.insertData(values);

                    Toast.makeText(RegisterActivity.this, "Register Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                    finish();
                }
            }
        });
    }

    public static Spanned fromHtml (String html){
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        }else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}

package com.mastercoding.week2discussionrecreate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText line1;

    EditText line2;

    ImageView atSymbol;

    TextView connected;

    TextView createAccount;

    TextView forgotPassword;

    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        line1 = findViewById(R.id.name);
        line2 = findViewById(R.id.password);
        atSymbol = findViewById(R.id.imageView);
        atSymbol.setImageResource(R.drawable.recreate);
        connected = findViewById(R.id.textView);
        Login = findViewById(R.id.login);
        createAccount = findViewById(R.id.createaccount);
        forgotPassword = findViewById(R.id.forgotpassword);

    }
}
package com.smarteez.weatherapp;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    private Button mLogin;
    private Button mSignup;

    private EditText loginText,passwordText;

    private MySqliteDatabase mySqliteOpenHelper;

    private SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        loginText = (EditText) findViewById(R.id.editText);

        passwordText = (EditText) findViewById(R.id.editText5);

        mLogin = (Button) findViewById(R.id.button4);

        mSignup = (Button) findViewById(R.id.button5);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                System.out.println("How");
            }
        });

        // Enables Always-on
        setAmbientEnabled();


    }
}

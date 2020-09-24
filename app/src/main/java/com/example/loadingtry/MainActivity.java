package com.example.loadingtry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      LoadingDialog loadingDialog = new LoadingDialog(MainActivity.this);

        btn_login = findViewById(R.id.btn_login);
        buttonAction(loadingDialog);

    }

    private void buttonAction(final LoadingDialog loadingDialog){

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ProcessAct.class);
                loadingDialog.startLoadingDialog();
                startActivity(i);
            }
        });

    }
}
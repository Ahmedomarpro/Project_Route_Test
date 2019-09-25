package com.test.project_route;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewDetails(View view) {
        int id = view.getId();
        Intent intent = null;

        switch (id) {
            case R.id.btn_android:
                intent = new Intent(this, AndroidActivity.class);
                break;
            case R.id.btn_ios:
                intent = new Intent(this, IosActivity.class);
                break;
            case R.id.btn_fullstack:
                intent = new Intent(this, FullStackActivity.class);
                break;
        }
        startActivity(intent);
    }
}

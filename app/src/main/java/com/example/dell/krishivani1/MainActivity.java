package com.example.dell.krishivani1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void next(View view)
    {
        Intent intent =new Intent(this ,options.class);
        startActivity(intent);
    }
    public void next1(View view)
    {
        Intent intent =new Intent(this ,register.class);
        startActivity(intent);
    }
}

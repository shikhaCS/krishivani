package com.example.dell.krishivani1;
import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void next(View view)
    {
        Intent intent =new Intent(this ,options.class);
        startActivity(intent);
    }

}

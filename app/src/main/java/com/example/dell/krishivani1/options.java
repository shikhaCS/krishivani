package com.example.dell.krishivani1;
import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }
    public void next(View view)
    {
        Intent intent =new Intent(this ,status.class);
        startActivity(intent);
    }
    public void next1(View view)
    {
        Intent intent =new Intent(this ,details.class);
        startActivity(intent);
    }
    public void next2(View view)
    {
        Intent intent =new Intent(this ,details.class);
        startActivity(intent);
    }

}

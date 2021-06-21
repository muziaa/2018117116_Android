package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Hello1 extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Hello1";
    private static int objCount = 0;
    private int mObjCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        objCount++;
        mObjCount = objCount;
        Log.d(TAG, mObjCount + "-onCreate execute");
        setTitle("Hello1");
        setupButtons();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, mObjCount + "-onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, mObjCount + "-onResume");
    }
    
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, mObjCount + "-onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, mObjCount + "-onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, mObjCount + "-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        objCount--;
        Log.d(TAG, mObjCount + "-onDestroy");
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btToHello1) {
            Intent intent;
            intent = new Intent(this, Hello1.class);
            startActivity(intent);
        }

    }

    private void setupButtons() {
        Button b;

        b = (Button) findViewById(R.id.btToHello1);
        b.setOnClickListener(this);


    }
}

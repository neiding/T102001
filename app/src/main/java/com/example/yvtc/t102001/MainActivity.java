package com.example.yvtc.t102001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//送出文字
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void click1(View v1){
        Intent it =new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("text/plain");//設定文字
        it.putExtra(Intent.EXTRA_TEXT,"asdfasdf123123");
        startActivity(it);

    }
}

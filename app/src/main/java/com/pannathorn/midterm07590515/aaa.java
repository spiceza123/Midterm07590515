package com.pannathorn.midterm07590515;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class aaa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaa);

        Intent intent = getIntent();
        String name = intent.getStringExtra("111");

        Toast t = Toast.makeText(this,getString(R.string.welc)+"Pannathorn Porsintuchai",Toast.LENGTH_LONG);
        t.show();
    }
}

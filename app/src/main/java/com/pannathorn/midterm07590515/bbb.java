package com.pannathorn.midterm07590515;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class bbb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbb);

        Toast t = Toast.makeText(this,getString(R.string.welc)+"Promlert Lovichit",Toast.LENGTH_LONG);
        t.show();
    }
}

package com.pannathorn.midterm07590515;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginbutton =findViewById(R.id.login_button);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText usernameEdittext =findViewById(R.id.user_edit_text);
                EditText passwordEdittext = findViewById(R.id.pass_edit_text);

                String inputUsername =usernameEdittext.getText().toString();
                String inputPassword = passwordEdittext.getText().toString();

                if(inputUsername.equals("aaa") && inputPassword.equals("111")){
                    Intent intent = new Intent(MainActivity.this,aaa.class);
                    intent.putExtra("111",inputUsername);
                    startActivity(intent);
                }
                else if(inputUsername.equals("bbb") && inputPassword.equals("222")){
                    Intent intent2 = new Intent(MainActivity.this,bbb.class);
                    startActivity(intent2);
                }
                else{
                    AlertDialog.Builder dialog =new AlertDialog.Builder(MainActivity.this);
                    dialog.setMessage(R.string.almessage);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                }
            }
        });
    }
}

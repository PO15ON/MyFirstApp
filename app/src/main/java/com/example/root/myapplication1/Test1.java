package com.example.root.myapplication1;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.app.ProgressDialog;
public class Test1 extends AppCompatActivity {
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
    }

    public void runSubmit(View view) {
        progressDialog.setMessage("Registering you ...");
        showDialog();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                progressDialog.dismiss();
            }
        }, 2000);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "You have successfully registered in Camp Test1\n Wait for our Call!", Toast.LENGTH_LONG).show();
            }
        }, 2001);
    }
    private void showDialog() {
        if (!progressDialog.isShowing())
            progressDialog.show();
    }

}

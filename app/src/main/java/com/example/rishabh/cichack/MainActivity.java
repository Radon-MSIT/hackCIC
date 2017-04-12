package com.example.rishabh.cichack;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  private WebView myWebView;
  Button farmerbtn, stockbtn;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    farmerbtn= (Button) findViewById(R.id.farmerbtn);
    stockbtn= (Button) findViewById(R.id.stockbtn);


    farmerbtn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {

        Intent intent = new Intent(MainActivity.this, FarmerActivity.class);
        startActivity(intent);
      }
    });

    stockbtn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, WebviewActivity.class);
        startActivity(intent);
      }
    });
  }


}

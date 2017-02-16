package com.tuantrandev.tuantran.webviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUrl;
    Button btnOpen;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Mapping views
        edtUrl = (EditText)findViewById(R.id.edtUrl);
        btnOpen = (Button)findViewById(R.id.btnOpen);
        webView = (WebView)findViewById(R.id.webView);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    webView.setWebViewClient(new MyBrowser());
                    webView.loadUrl(edtUrl.getText().toString());
            }
        });
    }
    private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }

    
}

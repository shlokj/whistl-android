package in.booksyndy.whistl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(getApplicationContext());
        setContentView(myWebView);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("https://booksyndy.in/"); // TODO: change URL
        getSupportActionBar().hide();
    }
}
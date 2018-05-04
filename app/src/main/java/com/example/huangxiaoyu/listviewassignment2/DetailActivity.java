package com.example.huangxiaoyu.listviewassignment2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.util.HashMap;


public class DetailActivity extends AppCompatActivity {
    HashMap<String,String> urlMap = new HashMap<String,String>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_page);


        urlMap.put("Base Jump","https://en.wikipedia.org/wiki/BASE_jumping");
        urlMap.put("Bungee Jumping","https://en.wikipedia.org/wiki/Bungee_jumping");
        urlMap.put("Diving","https://en.wikipedia.org/wiki/Diving");
        urlMap.put("Ski Jumping","https://en.wikipedia.org/wiki/Ski_jumping");
        urlMap.put("Paragliding","https://en.wikipedia.org/wiki/Paragliding");
        urlMap.put("Trampoline","https://en.wikipedia.org/wiki/Trampoline");
        urlMap.put("VolleyBall","https://en.wikipedia.org/wiki/Volleyball");
        urlMap.put("SkyDiving","https://en.wikipedia.org/wiki/Parachuting");
        urlMap.put("Yoga","https://en.wikipedia.org/wiki/Yoga");

        String savedExtra = getIntent().getStringExtra("sports");
        WebView wikiPage = (WebView) findViewById(R.id.webViewWikiID);
        wikiPage.getSettings().setJavaScriptEnabled(true);
        wikiPage.setFocusableInTouchMode(true);

        wikiPage.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wikiPage.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wikiPage.getSettings().setDomStorageEnabled(true);
        wikiPage.getSettings().setDatabaseEnabled(true);
        wikiPage.getSettings().setAppCacheEnabled(true);
        wikiPage.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        //load url
        wikiPage.loadUrl(urlMap.get(savedExtra));
        wikiPage.setWebViewClient(new WebViewClient());

    }
}

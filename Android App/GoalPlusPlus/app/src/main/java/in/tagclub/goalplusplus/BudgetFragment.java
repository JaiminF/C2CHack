package in.tagclub.goalplusplus;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.afollestad.materialdialogs.MaterialDialog;

public class BudgetFragment extends Fragment {

    WebView mWebView;

    public BudgetFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate (R.layout.fragment_budget, container, false);

        mWebView = (WebView) v.findViewById(R.id.budget_webview);
        mWebView.loadUrl("http://tagclub.in/c2c/budget.html");

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

        return v;
    }
}

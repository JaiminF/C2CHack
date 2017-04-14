package in.tagclub.goalplusplus;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Splash extends Activity {

    private static final int STOPSPLASH = 0;
    private static final long SPLASHTIME = 2500;



    private Handler splashHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case STOPSPLASH:
                    //remove SplashScreen from view
                    Intent intent = new Intent(Splash.this, SignInActivity.class);
                    startActivity(intent);
                    break;
            }
            super.handleMessage(msg);
        }
    };

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        Message msg = new Message();
        msg.what = STOPSPLASH;
        splashHandler.sendMessageDelayed(msg, SPLASHTIME);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
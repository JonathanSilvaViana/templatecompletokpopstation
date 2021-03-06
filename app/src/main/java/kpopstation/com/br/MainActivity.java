package kpopstation.com.br;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kpopstation.com.br.kpopstation.R;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent saidasplashscreen = new Intent(MainActivity.this, MenuActivity.class );
                                          startActivity(saidasplashscreen);
                                          finish();
                                      }
                                  },
                SPLASH_TIME_OUT);

    }
}

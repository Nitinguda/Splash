package edu.niu.cs.z1760203.splash;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity {

    // defining the onCreate method
    // Called when the activity is first created.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                // To return from the calling activity
                finish();

                // The startActivity(Intent) method is used to start a new activity,
                // which will be placed at the top of the activity stack.
                // It takes a single argument, an Intent, which describes the activity to be executed.
                startActivity(new Intent(SplashActivity.this, MainActivity.class));

            }
        };//TimerTask ends here

        //Timers schedule one-shot or recurring tasks for execution.
        Timer time = new Timer();
        time.schedule(task, 4000);

    }//onCreate ends here
}//splashActivity ends here

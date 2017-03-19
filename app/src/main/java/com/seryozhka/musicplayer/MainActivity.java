package com.seryozhka.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v) {
        Intent serviz =new Intent(this, MyPlayService.class);
        if (v.getId()==R.id.start) {
            startService(serviz);
        }
        else {
            stopService(serviz);
        }
    }
}

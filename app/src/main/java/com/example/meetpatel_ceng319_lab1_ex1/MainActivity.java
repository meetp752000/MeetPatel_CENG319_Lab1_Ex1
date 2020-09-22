package com.example.meetpatel_ceng319_lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String tag = "Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag, "In the onCreate() event");

        Context context = getApplicationContext();
        String OnStart = getResources().getString(R.string.OnCreate);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, OnStart, duration);
        toast.show();


        TextView display =(TextView)findViewById(R.id.textView);
        display.setText(getText(R.string.OnCreate));

    }

    public void onStart()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");
        Context context = getApplicationContext();
        String OnStart = getResources().getString(R.string.OnStart);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, OnStart, duration);
        toast.show();

        TextView display =(TextView)findViewById(R.id.textView1);
        display.setText(getText(R.string.OnStart));

    }

    public void onRestart()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
        Context context = getApplicationContext();
        String OnStart = getResources().getString(R.string.OnRestart);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, OnStart, duration);
        toast.show();

        TextView display =(TextView)findViewById(R.id.textView2);
        display.setText(R.string.OnRestart);



    }
    public void onResume()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
        Context context = getApplicationContext();
        String OnStart = getResources().getString(R.string.OnResume);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, OnStart, duration);
        toast.show();


        TextView display =(TextView)findViewById(R.id.textView3);
        display.setText(getText(R.string.OnResume));

    }
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");
        Context context = getApplicationContext();
        String OnStart = getResources().getString(R.string.OnPause);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, OnStart, duration);
        toast.show();

        TextView display =(TextView)findViewById(R.id.textView4);
        display.setText(R.string.OnPause);
    }
    //
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");
        Context context = getApplicationContext();
        String OnStart = getResources().getString(R.string.OnStop);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, OnStart, duration);
        toast.show();

        TextView display =(TextView)findViewById(R.id.textView5);
        display.setText(R.string.OnStop);
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
        Context context = getApplicationContext();
        String OnStart = getResources().getString(R.string.OnDestroy);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, OnStart, duration);
        toast.show();

        TextView display =(TextView)findViewById(R.id.textView6);
        display.setText(getText(R.string.OnDestroy));
    }
    }

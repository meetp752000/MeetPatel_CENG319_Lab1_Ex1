package com.example.meetpatel_ceng319_lab1_ex1;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Context;
        import android.os.Bundle;
        import android.util.Log;
        import android.widget.TextView;
        import android.widget.Toast;

public class VRActivity extends AppCompatActivity {

    String tag = "Life Cycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);

        Context context = getApplicationContext();
        String OnStart = getResources().getString(R.string.OnCreate);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, OnStart, duration);
        toast.show();


        TextView display =(TextView)findViewById(R.id.textView16);
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

        TextView display =(TextView)findViewById(R.id.textView17);
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

        TextView display =(TextView)findViewById(R.id.textView18);
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


        TextView display =(TextView)findViewById(R.id.textView19);
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

        TextView display =(TextView)findViewById(R.id.textView20);
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

        TextView display =(TextView)findViewById(R.id.textView21);
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

        TextView display =(TextView)findViewById(R.id.textView22);
        display.setText(getText(R.string.OnDestroy));
    }

}
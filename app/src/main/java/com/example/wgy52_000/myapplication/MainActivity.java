package com.example.wgy52_000.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    private List<String> number = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View v){
        //get the string from the buttons
        Button b = (Button) v;
        String t = b.getText().toString();
        TextView tv = (TextView) findViewById(R.id.textView);
        if(number.size() < 12){
            number.add(t);
            String s = "";
            for(int i = 0; i < number.size(); i++){
                s += number.get(i);
            }
            tv.setText(s);
        }
    }

    public void delete(View v){
        if(number.size() > 0) {
            Button b = (Button) v;
            String t = b.getText().toString();
            TextView tv = (TextView) findViewById(R.id.textView);
            number.remove(number.size() - 1);
            String s = "";
            for(int i = 0; i < number.size(); ++i) {
                s += number.get(i);

            }
            tv.setText(s);
        }
    }

    public void call(View v){
        if(number.size() > 0){
            Button b = (Button) v;
            String t = b.getText().toString();
            TextView tv = (TextView) findViewById(R.id.textView);
            String s = "Calling...";
            tv.setText(s);
        }
    }




    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

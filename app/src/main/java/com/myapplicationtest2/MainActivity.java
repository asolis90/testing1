package com.myapplicationtest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //change feature master
        //asdasdeeeeeeeeee
        //change master
        //change master
        //change master add
        //adding something here master
        //adding something here master
        //adding feature 5
        //adding feature 5
        //adding master change after 5
        //adding master change beofre 6
        //adding master change after 5
        //adding master change beofre 6
        //adding master change beofre 6

    }

    //adding something here master 1
    //change feature master
    //asdiashdoiahsd
    //asdasjdoiajsoidj
    //change something here master 1
    //adding feature 5

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        //changing to feature 5
        //adding feature 5
        return true;
    }

    //assdasdasdasas
    //change feature master
    @Override
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

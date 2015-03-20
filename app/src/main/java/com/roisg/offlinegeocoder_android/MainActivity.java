package com.roisg.offlinegeocoder_android;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.roisg.offlinegeocoder.GeocodeKey;
import com.roisg.offlinegeocoder.ReverseGeocodingCountry;

import org.json.JSONException;


public class MainActivity extends ActionBarActivity {

    AsyncTask task = new AsyncTask() {
        @Override
        protected Object doInBackground(Object[] params) {
            try {
                ReverseGeocodingCountry reverseGeocodingCountry = new ReverseGeocodingCountry(MainActivity.this);
                String country = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 41.573586, -8.328679);
                Log.d("ReverseGeocoding", "Country is: " + country);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        task.execute(new Void[]{});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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

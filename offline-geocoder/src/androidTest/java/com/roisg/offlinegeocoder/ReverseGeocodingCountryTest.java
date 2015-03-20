package com.roisg.offlinegeocoder;

import android.os.AsyncTask;
import android.test.InstrumentationTestCase;
import android.util.Log;

import org.json.JSONException;

/**
 * Created by rsanchez on 18/03/15.
 */
public class ReverseGeocodingCountryTest extends InstrumentationTestCase {

    public void testCountries() throws JSONException {
        ReverseGeocodingCountry reverseGeocodingCountry = new ReverseGeocodingCountry(getInstrumentation().getContext());

        String countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 39.474213, -6.329470);
        assertTrue(countryCode.equals("ES"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);

        countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 41.573586, -8.328679);
        assertTrue(countryCode.equals("PT"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);

        countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 41.0987947, -86.9682634);
        assertTrue(countryCode.equals("US"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);

        countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 64.7857152, -42.3667156);
        assertTrue(countryCode.equals("GL"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);

        countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 3.133413, 101.666799);
        assertTrue(countryCode.equals("MY"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);

        countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 5.403367, 100.314773);
        assertTrue(countryCode.equals("MY"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);

        countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 19.449599, 109.829062);
        assertTrue(countryCode.equals("CN"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);

        countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 13.738664, 100.692508);
        assertTrue(countryCode.equals("TH"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);

        countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 13.118771, 109.283179);
        assertTrue(countryCode.equals("VN"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);

        countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 14.880764, 120.838632);
        assertTrue(countryCode.equals("PH"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);

        countryCode = reverseGeocodingCountry.getCountry(GeocodeKey.KEY_ISOA2, 1.324332, 103.676293);
        assertTrue(countryCode.equals("SG"));
        Log.d("ReverseGeocoding", "Country code is: " + countryCode);
    }
}

package company.com.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateCountries();
    }

    public void populateCountries() {

        List<Country> countries = new ArrayList();
        countries.add(new Country("AF", "Afghanistan"));
        countries.add(new Country("AL", "Albania"));
        countries.add(new Country("DZ", "Algeria"));
        countries.add(new Country("AS", "American Samoa"));
        countries.add(new Country("AD", "Andorra"));

        CountryArrayAdapter arrayAdapter = new  CountryArrayAdapter( this, countries);
        Spinner countrySpinner = (Spinner)findViewById(R.id.countrySpinner);
        countrySpinner.setAdapter(arrayAdapter);
    }
}

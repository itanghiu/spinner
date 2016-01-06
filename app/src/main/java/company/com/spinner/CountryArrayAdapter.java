package company.com.spinner;

/**
 * Created by I-Tang HIU (FORYOUSOFT) on 06/01/2016.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;


/**
 * Created by ihiu on 06/01/2016.
 */
public class CountryArrayAdapter extends ArrayAdapter<Country> {

    public CountryArrayAdapter(Context context, List< Country > countries) {
        super(context, 0, countries);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        Country country = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_country, parent, false);
        ((TextView)convertView).setText(country.getName());
        return convertView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Country country = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_country, parent, false);
        ((TextView)convertView).setText(country.getCode());
        return convertView;
    }
}


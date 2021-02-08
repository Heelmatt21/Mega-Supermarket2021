package sr.unasat.smrfoodordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class FoodmenuActivity extends AppCompatActivity {
    int currentItem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodmenu);

        Spinner friesSpinner = (Spinner) findViewById(R.id.fries_spinner);
        String[] itemsfries = new String[] {"FRIES", "REGULAR FRIES", "CAJUN FRIES", "CASSAVA FRIES", "BANANA FRIES"};

        ArrayAdapter<String> Adapter= new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, itemsfries);
        friesSpinner.setAdapter(Adapter);
        friesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(parent.getItemAtPosition(position).equals("FRIES")){

                }else{
                    String fries = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(), "Selected" + fries, Toast.LENGTH_SHORT).show();
                    if (parent.getItemAtPosition(position).equals("REGULAR FRIES"))
                    {
                        Intent regularfriesintent = new Intent(FoodmenuActivity.this, Regularfries.class);
                        startActivity(regularfriesintent);
                    }
                    if (parent.getItemAtPosition(position).equals("CAJUN FRIES"))
                    {
                        Intent cajunfriesintent = new Intent(FoodmenuActivity.this, Cajunfries.class);
                        startActivity(cajunfriesintent);
                    }
                    if (parent.getItemAtPosition(position).equals("CASSAVA FRIES"))
                    {
                        Intent cassavafriesintent = new Intent(FoodmenuActivity.this, Cassavafries.class);
                        startActivity(cassavafriesintent);
                    }
                    if (parent.getItemAtPosition(position).equals("BANANA FRIES"))
                    {
                        Intent bananafriesintent = new Intent(FoodmenuActivity.this, Bananafries.class);
                        startActivity(bananafriesintent);

                    }

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





        Spinner burgerSpinner = (Spinner) findViewById(R.id.burger_spinner);
        String[] itemsburger = new String[] {"BURGERS", "HAMBURGER", "CHICKEN BURGER", "FISH BURGER", "BEEF BURGER"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, itemsburger);

        burgerSpinner.setAdapter(adapter);
        burgerSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}
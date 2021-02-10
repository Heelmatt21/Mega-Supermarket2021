package sr.unasat.megasupermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import sr.unasat.megasupermarket.dashboard.BeveragesActivity;
import sr.unasat.megasupermarket.dashboard.CartActivity;
import sr.unasat.megasupermarket.dashboard.GroceriesActivity;
import sr.unasat.megasupermarket.menu.ContactActivity;
import sr.unasat.megasupermarket.menu.ProfileActivity;

public class MainActivity extends AppCompatActivity {
private ImageButton Cart;
private ImageButton Groceries;
private ImageButton Beverages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cart = (ImageButton)findViewById(R.id.cart_button);
        Groceries = (ImageButton)findViewById(R.id.groceries_button);
        Beverages = (ImageButton)findViewById(R.id.beverage_button);
//Cart Button
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent3);
            }
        });
//Groceries Button
        Groceries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, GroceriesActivity.class);
                startActivity(intent4);
            }
        });
//Beverages Button
        Beverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainActivity.this, BeveragesActivity.class);
                startActivity(intent5);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

//Log out, profile, contact code
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logout) {
            logout();
            Toast.makeText(this,"You're logged out", Toast.LENGTH_LONG).show();
            return true;
        }
        int id1 = item.getItemId();
        if (id1 == R.id.profile) {
            profile();
        }
        int id2 = item.getItemId();
        if (id2 == R.id.contact) {
            contact();
        }

        return super.onOptionsItemSelected(item);
    }

    private void logout() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
    private void profile() {
        Intent intent1 = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent1);
    }
    private void contact() {
        Intent intent2 = new Intent(MainActivity.this, ContactActivity.class);
        startActivity(intent2);
    }






}
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
private ImageButton cartBtn;
private ImageButton groceriesBtn;
private ImageButton beveragesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartBtn = (ImageButton)findViewById(R.id.myCartBtn);
        groceriesBtn = (ImageButton)findViewById(R.id.groceriesBtn);
        beveragesBtn = (ImageButton)findViewById(R.id.beveragesBtn);

    //Cart Button
        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent3);
            }
        });
    //Groceries Button
        groceriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, GroceriesActivity.class);
                startActivity(intent4);
            }
        });
    //Beverages Button
        beveragesBtn.setOnClickListener(new View.OnClickListener() {
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
        switch (item.getItemId()) {
            case R.id.logoutBtn:
                onLogout();
                break;
            case R.id.profileBtn:
                onProfile();
                break;
            case R.id.contactBtn:
                onContact();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void onLogout() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        Toast.makeText(this,"You're logged out", Toast.LENGTH_LONG).show();
        finish();
    }
    private void onProfile() {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
    private void onContact() {
        Intent intent = new Intent(MainActivity.this, ContactActivity.class);
        startActivity(intent);
    }






}
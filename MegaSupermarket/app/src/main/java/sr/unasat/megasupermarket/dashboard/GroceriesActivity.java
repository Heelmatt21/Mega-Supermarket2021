package sr.unasat.megasupermarket.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import sr.unasat.megasupermarket.LoginActivity;
import sr.unasat.megasupermarket.R;
import sr.unasat.megasupermarket.menu.ContactActivity;
import sr.unasat.megasupermarket.menu.ProfileActivity;

public class GroceriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries);
    }
    //Options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logout) {
            logout();

            Toast.makeText(this, "You're logged out", Toast.LENGTH_LONG).show();
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
        Intent intent = new Intent(GroceriesActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();

    }

    private void profile() {
        Intent intent1 = new Intent(GroceriesActivity.this, ProfileActivity.class);
        startActivity(intent1);
    }

    private void contact() {
        Intent intent2 = new Intent(GroceriesActivity.this, ContactActivity.class);
        startActivity(intent2);
    }
}
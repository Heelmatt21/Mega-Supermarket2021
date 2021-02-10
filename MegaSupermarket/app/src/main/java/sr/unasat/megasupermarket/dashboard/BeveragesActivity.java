package sr.unasat.megasupermarket.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import sr.unasat.megasupermarket.LoginActivity;
import sr.unasat.megasupermarket.MainActivity;
import sr.unasat.megasupermarket.R;
import sr.unasat.megasupermarket.menu.ContactActivity;
import sr.unasat.megasupermarket.menu.ProfileActivity;

public class BeveragesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
    }
    //Options menu
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
            case R.id.homeBtn:
                onHome();
                break;
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

    private void onHome() {
        Intent intent = new Intent(BeveragesActivity.this, MainActivity.class);
        startActivity(intent);
    }
    private void onLogout() {
        Intent intent = new Intent(BeveragesActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        Toast.makeText(this,"You're logged out", Toast.LENGTH_LONG).show();
        finish();
    }
    private void onProfile() {
        Intent intent = new Intent(BeveragesActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
    private void onContact() {
        Intent intent = new Intent(BeveragesActivity.this, ContactActivity.class);
        startActivity(intent);
    }

}
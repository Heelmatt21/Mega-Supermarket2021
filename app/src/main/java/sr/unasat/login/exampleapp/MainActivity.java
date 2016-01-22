package sr.unasat.login.exampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void loginUser(View view) {
        EditText username = (EditText) findViewById(R.id.username);
        String usernameValue = String.valueOf(username.getText());

        EditText password = (EditText) findViewById(R.id.password);
        String passwordValue = String.valueOf(password.getText());

        String notification = "";

        if (usernameValue.isEmpty() || passwordValue.isEmpty()) {
            notification = "Het inloggen is mislukt. Vul a.u.b. eerst een gebruikersnaam en wachtwoord in.";
        } else if (usernameValue.equals("admin") && passwordValue.equals("admin")) {
            loadDetailsActivity(usernameValue);
        } else {
            notification = "Het inloggen is mislukt. Vul a.u.b. eerst een gebruikersnaam en wachtwoord in.";
        }
        Toast.makeText(this, notification, Toast.LENGTH_SHORT).show();
    }

    public void loadDetailsActivity(String username) {
        Intent intent = new Intent(this, DetailsActivity.class);
        String welcomeMessage = "Welcome " + username;
        intent.putExtra("message", welcomeMessage);
        startActivity(intent);
    }
}

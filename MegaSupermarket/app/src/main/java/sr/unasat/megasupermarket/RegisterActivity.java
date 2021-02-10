package sr.unasat.megasupermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.ValidationStyle;

public class RegisterActivity extends AppCompatActivity {
    private EditText lastnameTxt;
    private EditText firstnameTxt;
    private EditText passwordTxt;
    private EditText confirmPasswTxt;
    private EditText usernameTxt;
    private EditText emailTxt;
    private EditText addressTxt;
    private EditText districtTxt;
    private EditText phoneNumberTxt;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        lastnameTxt = findViewById(R.id.lastnameTxt);
        firstnameTxt = findViewById(R.id.firstnameTxt);
        passwordTxt = findViewById(R.id.passwordTxt);
        confirmPasswTxt = findViewById(R.id.confirmPasswTxt);
        usernameTxt = findViewById(R.id.usernameTxt);
        emailTxt = findViewById(R.id.emailTxt);
        addressTxt = findViewById(R.id.addressTxt);
        districtTxt = findViewById(R.id.districtTxt);
        phoneNumberTxt = findViewById(R.id.phoneNumberTxt);
        registerBtn = findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (validateForm()) {
                    Toast.makeText(getApplicationContext(), "Successfully registered", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateForm() {
        if (lastnameTxt.length() == 0) {
            lastnameTxt.setError("This field is required");
            return false;
        }
        if (firstnameTxt.length() == 0) {
            firstnameTxt.setError("This field is required");
            return false;
        }
        if (phoneNumberTxt.length() == 0) {
            phoneNumberTxt.setError("This field is required");
            return false;
        }
        if (emailTxt.length() == 0) {
            emailTxt.setError("This field is required");
            return false;
        }
        if (addressTxt.length() == 0) {
            addressTxt.setError("This field is required");
            return false;
        }
        if (districtTxt.length() == 0) {
            districtTxt.setError("This field is required");
            return false;
        }
        if (usernameTxt.length() == 0) {
            usernameTxt.setError("This field is required");
            return false;
        }
        if (passwordTxt.length() == 0) {
            passwordTxt.setError("This field is required");
            return false;
        }
        if (confirmPasswTxt.length() == 0) {
            confirmPasswTxt.setError("This field is required");
            return false;
        }
        return true;
    }
}
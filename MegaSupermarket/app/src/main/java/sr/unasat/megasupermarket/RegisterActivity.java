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
    private EditText Lastname;
    private EditText Firstname;
    private EditText Password1;
    private EditText Confirm_password;
    private EditText Username1;
    private EditText Email;
    private EditText Address;
    private EditText District;
    private EditText Phone_number;
    private Button Register1;

    boolean isAllFieldsChecked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Lastname = findViewById(R.id.Lastname_text);
        Firstname = findViewById(R.id.firstname_text);
        Password1 = findViewById(R.id.password_text2);
        Confirm_password = findViewById(R.id.confirmpassword_text);
        Username1 = findViewById(R.id.username_text2);
        Email = findViewById(R.id.Email_text);
        Address = findViewById(R.id.Address_text);
        District = findViewById(R.id.district_text);
        Phone_number = findViewById(R.id.phone_number);
        Register1 = findViewById(R.id.register_button2);

        Register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isAllFieldsChecked = CheckAllFields();

                if (isAllFieldsChecked) {
                    Toast.makeText(getApplicationContext(), "Successfully registered", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean CheckAllFields() {
        if (Lastname.length() == 0) {
            Lastname.setError("This field is required");
            return false;
        }
        if (Firstname.length() == 0) {
            Firstname.setError("This field is required");
            return false;
        }
        if (Password1.length() == 0) {
            Password1.setError("This field is required");
            return false;
        }
        if (Confirm_password.length() == 0) {
            Confirm_password.setError("This field is required");
            return false;
        }
        if (Username1.length() == 0) {
            Username1.setError("This field is required");
            return false;
        }
        if (Email.length() == 0) {
            Email.setError("This field is required");
            return false;
        }
        if (Address.length() == 0) {
            Address.setError("This field is required");
            return false;
        }
        if (District.length() == 0) {
            District.setError("This field is required");
            return false;
        }
        if (Phone_number.length() == 0) {
            Phone_number.setError("This field is required");
            return false;
        }
        




        return true;
    }
}
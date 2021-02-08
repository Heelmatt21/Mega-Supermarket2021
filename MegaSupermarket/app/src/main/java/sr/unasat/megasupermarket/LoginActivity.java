package sr.unasat.megasupermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
private EditText Username;
private EditText Password;
private Button Login;
private Button Register;
private TextView Info;
private CheckBox Showpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText)findViewById(R.id.username_text);
        Password = (EditText)findViewById(R.id.password_text);
        Login = (Button)findViewById(R.id.login_button);
        Register = (Button)findViewById(R.id.register_button);
        Showpassword = (CheckBox)findViewById(R.id.password_checkbox);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Username.getText().toString(), Password.getText().toString());
            }
        });

        Showpassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked){
                    Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }else {
                    Password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentregister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intentregister);
            }
        });

    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("Admin")) && (userPassword.equals("123456"))) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
        Login.setEnabled(true);
    }
}
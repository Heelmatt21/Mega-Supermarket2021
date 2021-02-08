package sr.unasat.megasupermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText Lastname;
    private EditText Firstname;
    private EditText Password1;
    private EditText Username1;
    private EditText Email;
    private EditText Address;
    private EditText District;
    private Number Phone_number;
    private Button Register1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



    }

}
package sr.unasat.smrfoodordering;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class SecondActivity extends AppCompatActivity {
   ImageButton food_button;
   ImageButton image_button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        food_button = (ImageButton) findViewById(R.id.foodbutton);

        food_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(SecondActivity.this, FoodmenuActivity.class);
                startActivity(intentLoadNewActivity);

            }
        });
        image_button2 = (ImageButton) findViewById(R.id.imageButton2);

        image_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadProfileActivity = new Intent(SecondActivity.this, ProfileActivity.class);
                startActivity(intentLoadProfileActivity);
            }
        });



    }


}

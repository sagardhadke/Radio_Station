package net.uniquecomputer.radiostation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView14);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        //Perform ItemSelectedLister
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {


                    case R.id.radio_station:
                         startActivity(new Intent(getApplicationContext(),RadioStations.class));
                         overridePendingTransition(0,0);
                    return true;

                    case R.id.podcast:
                        startActivity(new Intent(getApplicationContext(),login.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.event:
                        startActivity(new Intent(getApplicationContext(),ForgetPassword.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.home:
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),Profile.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });

        //  testing the logcat only
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num;
                num = -555;
                int num2 = 105;
                int sum = num + num2;
                System.out.println("The sum is:" + sum);

            }
        });



    }
}
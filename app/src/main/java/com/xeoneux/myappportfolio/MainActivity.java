package com.xeoneux.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createButtons();
    }

    public void createButtons() {

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear_layout);

        List<String> applications = new ArrayList<>();
        applications.add("Popular Movies");
        applications.add("Stock Hawk");
        applications.add("Build It Bigger");
        applications.add("Make Your App Material");
        applications.add("Go Ubiquitous");
        applications.add("Capstone");

        for (final String application : applications) {
            Button button = new Button(this);
            button.setText(application);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), application, Toast.LENGTH_SHORT).show();
                }
            });

            linearLayout.addView(button);
        }
    }
}

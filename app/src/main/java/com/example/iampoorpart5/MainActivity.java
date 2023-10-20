package com.example.iampoorpart5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    TextView label;
    Button rich;
    Button poor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label = findViewById(R.id.label);
        rich = findViewById(R.id.rich);
        poor = findViewById(R.id.poor);

        rich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifyRichness(rich);
            }

        });

        poor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifyRichness(poor);
            }

        });
    }

    public void verifyRichness(Button button){
        if(button.getText().toString().equals("I AM RICH")){
            label.setText(rich.getText().toString());
        }
        else if(button.getText().toString().equals("I AM POOR")){
            label.setText(poor.getText().toString());
        }
    }
}

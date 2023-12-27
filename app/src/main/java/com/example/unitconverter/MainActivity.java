package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputtext = editText.getText().toString();
                double kilos = Double.parseDouble(inputtext);
                double pounds = makeConversion(kilos);

                // Desplaing the conversion result
               textView.setText("" +pounds);
            }
        });
    }

    public double makeConversion(double kilos) {
        // 1 Kg = 2.20462 pounds
        return kilos * 2.20462;

    }
}
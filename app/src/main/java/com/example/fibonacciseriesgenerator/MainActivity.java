package com.example.fibonacciseriesgenerator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etvStart, etvEnding, etvSeparator;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etvStart = findViewById(R.id.etvStart);
        etvEnding = findViewById(R.id.etvEnding);
        etvSeparator = findViewById(R.id.etvSeparator);
        txtResult = findViewById(R.id.txtResult);

        Button btnGenerate = findViewById(R.id.btnGenerate);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateFibonacciSeries();
            }
        });
    }

    private void generateFibonacciSeries() {

        int start = Integer.parseInt(etvStart.getText().toString());
        int end = Integer.parseInt(etvEnding.getText().toString());
        String separator = etvSeparator.getText().toString();

        StringBuilder series = new StringBuilder();
        int a = 0, b = 1, c = 0;

        while (c <= end) {
            if (c >= start) {
                if (series.length() > 0) {
                    series.append(separator);
                }
                series.append(c);
            }
            a = b;
            b = c;
            c = a + b;
        }
        txtResult.setText(series.toString());
    }
}
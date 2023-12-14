package com.example.fibonacciseriesgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorting extends AppCompatActivity {

    EditText editTextNumbers;
    TextView textViewSortedNumbers;
    Button buttonSort;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_sorting);


        editTextNumbers = findViewById(R.id.editTextNumbers);
        textViewSortedNumbers = findViewById(R.id.textViewSortedNumbers);
        buttonSort = findViewById(R.id.buttonSort);
    }

    public void sortNumbers(View view) {
        String input = editTextNumbers.getText().toString();
        String[] numbersArray = input.split(",");
        List<Integer> numbersList = new ArrayList<>();

        for (String number : numbersArray) {
            numbersList.add(Integer.parseInt(number.trim()));
        }

        Collections.sort(numbersList);

        StringBuilder sortedNumbersText = new StringBuilder("Sorted Numbers: ");
        for (Integer number : numbersList) {
            sortedNumbersText.append(number).append(", ");
        }

        textViewSortedNumbers.setText(sortedNumbersText.toString());
    }
}

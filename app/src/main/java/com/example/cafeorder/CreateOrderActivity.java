package com.example.cafeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class CreateOrderActivity extends AppCompatActivity {
    private TextView textViewHello;
    private TextView textViewAdditions;
    private CheckBox checkBoxMilk;
    private CheckBox checkBoxLemon;
    private CheckBox checkBoxSugar;
    private Spinner spinnerTea;
    private Spinner spinnerCoffe;

    private String password;
    private String name;
    private String drink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_order);
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        name = intent.getStringExtra("password");

        String hello = String.format("Привет, %s! что выберешь?"name);
        textViewHello.setText(hello);

        drink = "Чай";
        textViewHello = findViewById(R.id.textViewHello);
        textViewAdditions = findViewById(R.id.textViewAdditions);
        String additions = String.format("Что добавит в ваш %s", drink);
        textViewAdditions.setText(additions);

        checkBoxMilk = findViewById(R.id.checkBoxMilk);
        checkBoxSugar = findViewById(R.id.checkBoxMilk);
        checkBoxLemon = findViewById(R.id.checkBoxMilk);
        spinnerTea = findViewById(R.id.spinnerTea);
        spinnerCoffe = findViewById(R.id.spinnerCoffe);
    }

    public void onClickChangeDrink(View view) {
        RadioButton button = (RadioButton) view;
        int id = button.getId();
        if(id == R.id.radioButtonTea) {
            drink = "Чай";
            spinnerTea.setVisibility(View.VISIBLE);
            spinnerCoffe.setVisibility(View.INVISIBLE);
        } else if (id == R.id.radioButtonCoffe) {
            drink = "Кофе";
            spinnerTea.setVisibility(View.INVISIBLE);
            spinnerCoffe.setVisibility(View.VISIBLE);
            checkBoxLemon.setVisibility(View.INVISIBLE);
        }

    }

    public void onClickSendOrder(View view) {
    }
}
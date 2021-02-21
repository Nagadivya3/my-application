package com.example.bankingsystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class transfer extends AppCompatActivity {
    ImageView imageView;
    TextView textView3,textView4,textView5,textView6;
    Spinner spinner;
    EditText editText1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        imageView=findViewById(R.id.imageView);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        spinner=findViewById(R.id.spinner);
        editText1=findViewById(R.id.editText1);
        button1=findViewById(R.id.buton1);

        final ArrayList<String> persons=new ArrayList<>();

        persons.add("Mahesh");
        persons.add("Kiran");
        persons.add("Jyothi");
        persons.add("Swapna");
        persons.add("Suresh");
        persons.add("Yamuna");
        persons.add("Swathi");
        persons.add("Ram");
        persons.add("Naveen");
        persons.add("Vasavi");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,persons);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amount;
                amount=Integer.valueOf(editText1.getText().toString());
                if (amount == 70000){
                    alert("Sufficient Balance");
                }
                else
                if (amount <= 70000){
                    alert("Sufficient Balance");
                }
                else
                if (amount >= 70000){
                    alert("Insufficient Balance");
                }
            }
        });

    }
    private void alert(String message){
        AlertDialog dlt=new AlertDialog.Builder(transfer.this)
                .setTitle("Message")
                .setMessage(message)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        dlt.show();
    }
}
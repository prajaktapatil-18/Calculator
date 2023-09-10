package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    EditText editText1, editText2;
    TextView textView;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.pluse);
        buttonSub = findViewById(R.id.minus);
        buttonMul = findViewById(R.id.mul);
        buttonDiv = findViewById(R.id.div);

        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);

    }


    public int getIntFromEdittext(EditText editText) {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;

        }else
       return Integer.parseInt(editText1.getText().toString());

    }


    @Override
    public void onClick(View view) {
        num1=getIntFromEdittext(editText1);
        num2= getIntFromEdittext(editText2);
                 switch(view.getId()){
                     case R.id.pluse:
                         textView.setText("Answers = "+(num1+num2));
                         break;
                     case R.id.minus:
                         textView.setText("Answer = "+ (num1-num2));
                         break;
                     case R.id.mul:
                         textView.setText("Answer = "+ (num1*num2));
                         break;
                     case R.id.div:
                         textView.setText("Answer = " + ((float)num1 / (float) num2));

                 }

    }
}
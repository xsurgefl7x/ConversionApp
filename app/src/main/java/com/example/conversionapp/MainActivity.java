package com.example.conversionapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double total = 0.0;
    double inch = 0.0 ,foot = 0.0,yard = 0.0,mile = 0.0,centimeter = 0.0, meter = 0.0,kilometer = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_Conversion);
        TextView Converted = findViewById(R.id.Converted);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Val = String.valueOf(total);
                Converted.setText(Val);

            }
        });


    }
    public void onRadioButtonClicked(View view) {


        boolean checked = ((RadioButton) view).isChecked();

        EditText numInput = findViewById(R.id.editText);

        double Input = Integer.parseInt(numInput.getText().toString());
        numInput.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ((RadioGroup) MainActivity.this.findViewById(R.id.radioGroup1)).clearCheck();
                ((RadioGroup) MainActivity.this.findViewById(R.id.radioGroup2)).clearCheck();
            }

            public void afterTextChanged(Editable s) {
            }
        });

        switch (view.getId()) {
            case R.id.radio1:
                if (checked){
                    foot = 0.0;
                    yard = 0.0;
                    mile = 0.0;
                    centimeter = 0.0;
                    meter = 0.0;
                    kilometer = 0.0;

                    inch = Input;
                }
                break;
            case R.id.radio2:
                if (checked){
                    inch = 0.0 ;
                    yard = 0.0;
                    mile = 0.0;
                    centimeter = 0.0;
                    meter = 0.0;
                    kilometer = 0.0;

                    foot = Input;}
                break;
            case R.id.radio3:
                if (checked) {
                    inch = 0.0 ;
                    foot = 0.0;
                    mile = 0.0;
                    centimeter = 0.0;
                    meter = 0.0;
                    kilometer = 0.0;

                    yard = Input;
                }
                break;
            case R.id.radio4:
                if (checked) {
                    inch = 0.0 ;
                    foot = 0.0;
                    yard = 0.0;
                    centimeter = 0.0;
                    meter = 0.0;
                    kilometer = 0.0;

                    mile = Input;
                }
                break;
            case R.id.radio5:
                if (checked) {
                    inch = 0.0 ;
                    foot = 0.0;
                    yard = 0.0;
                    mile = 0.0;
                    meter = 0.0;
                    kilometer = 0.0;

                    centimeter = Input;
                }
                break;
            case R.id.radio6:
                if (checked) {
                    inch = 0.0 ;
                    foot = 0.0;
                    yard = 0.0;
                    mile = 0.0;
                    centimeter = 0.0;
                    kilometer = 0.0;

                    meter = Input;
                }
                break;
            case R.id.radio7:
                if (checked) {
                    inch = 0.0 ;
                    foot = 0.0;
                    yard = 0.0;
                    mile = 0.0;
                    centimeter = 0.0;
                    meter = 0.0;

                    kilometer = Input;
                }
                break;

        }

        switch (view.getId()) {
            case R.id.radio8:
                if (checked) {
                            if(inch > 0){
                                total = inch;
                            }
                            else if(foot > 0){
                                total = foot*12;
                            }
                            else if(yard > 0){
                                total = yard*36;
                            }
                            else if(mile > 0){
                                total = mile*63360;
                            }
                            else if(centimeter > 0){
                                total = centimeter/2.54;
                            }
                            else if(meter > 0){
                                    total = meter*39.37;
                            }
                            else if(kilometer > 0){
                                    total = kilometer*39370;
                            }
                        }
                break;
            case R.id.radio9:
                if (checked){
                            if(inch > 0){
                                total = inch/12;
                            }
                            else if(foot > 0){
                                total = foot;
                            }
                            else if(yard > 0){
                                total = yard*3;
                            }
                            else if(mile > 0){
                                total = mile*5280;
                            }
                            else if(centimeter > 0){
                                total =centimeter/30.48;
                            }
                            else if(meter > 0){
                                total = meter*3.281;
                            }
                            else if(kilometer > 0){
                                total = kilometer*3281;
                            }
                        }


                break;
            case R.id.radio10:
                if (checked){

                            if(inch > 0){
                                total = inch/36;
                            }
                            else if(foot > 0){
                                total =foot/3;
                            }
                            else if(yard > 0){
                                total =yard;
                            }
                            else if(mile > 0){
                                total = mile*1760;
                            }
                            else if(centimeter > 0){
                                total = centimeter/91.44;
                            }
                            else if(meter > 0){
                                total = meter*1.094;
                            }
                            else if(kilometer > 0){
                                total = kilometer*1094;
                            }
                        }
                   break;



            case R.id.radio11:
                if (checked){

                            if(inch > 0){
                                total = inch/63360;
                            }
                            else if(foot > 0){
                                total = foot/5280;
                            }
                            else if(yard > 0){
                                total = yard/1760;
                            }
                            else if(mile > 0){
                                total = mile;
                            }
                            else if(centimeter > 0){
                                total = centimeter/160934;
                            }
                            else if(meter > 0){
                                total = meter/1609;
                            }
                            else if(kilometer > 0){
                                total = kilometer/1.609;
                            }
                        }



                break;
            case R.id.radio12:
                if (checked) {
                            if(inch > 0){
                                total = inch*2.54;
                            }
                            else if(foot > 0){
                                total = foot*30.48;
                            }
                            else if(yard > 0){
                                total = yard*91.44;
                            }
                            else if(mile > 0){
                                total = mile*160934;
                            }
                            else if(centimeter > 0){
                                total = centimeter;
                            }
                            else if(meter > 0){
                                total = meter*100;
                            }
                            else if(kilometer > 0){
                                total = kilometer*100000;
                            }
                        }


                break;
            case R.id.radio13:
                if (checked){

                            if(inch > 0){
                                total = inch/39.37;
                            }
                            else if(foot > 0){
                                total = foot/3.281;
                            }
                            else if(yard > 0){
                                total = yard/1.094;
                            }
                            else if(mile > 0){
                                total = mile*1609;
                            }
                            else if(centimeter > 0){
                                total = centimeter/100;
                            }
                            else if(meter > 0){
                                total = meter;
                            }
                            else if(kilometer > 0){
                                total = kilometer*1000;
                            }
                        }

                break;
            case R.id.radio14:
                if (checked){
                            if(inch > 0){
                                total = inch/39370;
                            }
                            else if(foot > 0){
                                total = foot/3281;
                            }
                            else if(yard > 0){
                                total = yard/1094;
                            }
                            else if(mile > 0){
                                total = mile*1.609;
                            }
                            else if(centimeter > 0){
                                total = centimeter/100000;
                            }
                            else if(meter > 0){
                                total = meter/1000;
                            }
                            else if(kilometer > 0){
                                total = kilometer;
                            }
                        }
                break;

        }

    }


}


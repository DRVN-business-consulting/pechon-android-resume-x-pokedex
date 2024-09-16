package com.example.pechonjavtraining;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg1, rg2, rg3, rg4;
    RadioButton selections;
    TextView vocLabel, vocCourse, bachLabel, bachCourse, rdWork1, txtWorkLabel1, txtWorkYear1, rdWork2, txtWorkLabel2, txtWorkYear2, txtProject2_1, txtProject2_2, txtProject2_3, rgLabel;
    Button nextBtn;

    CheckBox chkEduc, chkWork, chkSkill, chkRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nextBtn = findViewById(R.id.nextMod);

        chkEduc = findViewById(R.id.chkEduc);
        chkWork = findViewById(R.id.chkWork);
        chkSkill = findViewById(R.id.chkSkill);
        chkRef = findViewById(R.id.chkRef);

        vocLabel = findViewById(R.id.vocLabel);
        vocCourse = findViewById(R.id.vocCourse);
        bachLabel = findViewById(R.id.bachLabel);
        bachCourse = findViewById(R.id.bachCourse);

        rdWork1 = findViewById(R.id.rdWork1);
        txtWorkLabel1 = findViewById(R.id.txtWorkLabel1);
        txtWorkYear1 = findViewById(R.id.txtYear1);

        rdWork2 = findViewById(R.id.rdWork2);
        txtWorkLabel2 = findViewById(R.id.txtWorkLabel2);
        txtWorkYear2 = findViewById(R.id.txtYear2);
        txtProject2_1 = findViewById(R.id.txtProject2_1);
        txtProject2_2 = findViewById(R.id.txtProject2_2);
        txtProject2_3 = findViewById(R.id.txtProject2_3);

        rgLabel = findViewById(R.id.rngLabel);
        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
        rg4 = findViewById(R.id.rg4);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rv = new Intent(getApplicationContext(), PokedexLogin.class);
                startActivity(rv);
            }
        });

        chkEduc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkEduc.isChecked() == false){
                    vocLabel.setVisibility(View.GONE);
                    vocCourse.setVisibility(View.GONE);
                    bachLabel.setVisibility(View.GONE);
                    bachCourse.setVisibility(View.GONE);
                }else{
                    vocLabel.setVisibility(View.VISIBLE);
                    vocCourse.setVisibility(View.VISIBLE);
                    bachLabel.setVisibility(View.VISIBLE);
                    bachCourse.setVisibility(View.VISIBLE);
                }
            }
        });

        chkSkill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkWork.isChecked() == false){
                    rgLabel.setVisibility(View.GONE);
                    rg1.setVisibility(View.GONE);
                    rg2.setVisibility(View.GONE);
                    rg3.setVisibility(View.GONE);
                    rg4.setVisibility(View.GONE);
                }else{
                    rgLabel.setVisibility(View.VISIBLE);
                    rg1.setVisibility(View.VISIBLE);
                    rg2.setVisibility(View.VISIBLE);
                    rg3.setVisibility(View.VISIBLE);
                    rg4.setVisibility(View.VISIBLE);
                }
            }
        });

        chkWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkWork.isChecked() == false){
                    rdWork1.setVisibility(View.GONE);
                    txtWorkLabel1.setVisibility(View.GONE);
                    txtWorkYear1.setVisibility(View.GONE);
                    rdWork2.setVisibility(View.GONE);
                    txtWorkLabel2.setVisibility(View.GONE);
                    txtWorkYear2.setVisibility(View.GONE);
                    txtProject2_1.setVisibility(View.GONE);
                    txtProject2_2.setVisibility(View.GONE);
                    txtProject2_3.setVisibility(View.GONE);
                }else{
                    rdWork1.setVisibility(View.VISIBLE);
                    txtWorkLabel1.setVisibility(View.VISIBLE);
                    txtWorkYear1.setVisibility(View.VISIBLE);
                    rdWork2.setVisibility(View.VISIBLE);
                    txtWorkLabel2.setVisibility(View.VISIBLE);
                    txtWorkYear2.setVisibility(View.VISIBLE);
                    txtProject2_1.setVisibility(View.VISIBLE);
                    txtProject2_2.setVisibility(View.VISIBLE);
                    txtProject2_3.setVisibility(View.VISIBLE);
                }
            }
        });


    }



}
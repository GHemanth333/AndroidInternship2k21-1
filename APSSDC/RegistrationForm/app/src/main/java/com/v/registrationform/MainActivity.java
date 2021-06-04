package com.v.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.app.DatePickerDialog;
import android.widget.EditText;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    //Declare all thr views here
    EditText name1, name2, email, num, pass1, pass2, post ;
    Spinner title;
    RadioGroup rg;
    RadioButton rb, male, female, others;
    TextView tv, tvc , dob;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize all views here
        title = findViewById(R.id.title);
        name1 = findViewById(R.id.name1);
        name2 = findViewById(R.id.name2);
        email = findViewById(R.id.email);
        num = findViewById(R.id.num);
        pass1 = findViewById(R.id.pass1);
        pass2 = findViewById(R.id.pass2);
        post = findViewById(R.id.post);
        rg = findViewById(R.id.rg);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        others = findViewById(R.id.others);
        tv = findViewById(R.id.tv);
        tvc = findViewById(R.id.tvc);
        dob = findViewById(R.id.dob);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        submit = findViewById(R.id.submit);
    }

    public void save(View view) {
        String n1 = name1.getText().toString();
        String n2 = name2.getText().toString();
        String e = email.getText().toString().trim();
        String mnum = num.getText().toString();
        String t = title.getSelectedItem().toString();
        int i = rg.getCheckedRadioButtonId();
        rb = findViewById(i);
        StringBuilder sb = new StringBuilder();
        if (cb1.isChecked()){
            sb.append("English"+"\n");
        }
        if (cb2.isChecked()){
            sb.append("Hindi"+"\n");
        }
        if (cb3.isChecked()){
            sb.append("Telugu" + "\n");
        }
        if (cb4.isChecked()){
            sb.append("Tamil"+"\n");
        }
        if (cb5.isChecked()){
            sb.append("Malyalam");
        }
        Log.i("APSSDC",t+"\n"+n1+"\n"+n2+"\n"+e+"\n"+mnum+"\n"+rb.getText()
                +"\n"+sb.toString()+"\n"+dob.getText().toString());
    }

    public void dob(View view) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int mnth = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dpd = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        dob.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,mnth,day);
        dpd.show();
    }
}

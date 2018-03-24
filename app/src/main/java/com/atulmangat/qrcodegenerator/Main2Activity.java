package com.atulmangat.qrcodegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    public String UserID="";
    public int age=0;
    public int gender=0;
    public int a,b,c,d,p,q,r,s,v,w,x,y,z;
    public int nameValue;
    public boolean agecheck=false;
    public boolean gendercheck=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }


    public void GenerateQR(View view) {
        EditText simpleEditText = (EditText) findViewById(R.id.Edittxt);
        String editTextValue = simpleEditText.getText().toString();
        nameValue=generate_name_hash(editTextValue);
           UserID+= nameValue;
           UserID+= " A:"+a+" B:"+b+" C:"+c+" D:"+d+" P:"+p+" Q:"+q+" R:"+r+" S:"+s;
           UserID+= " V:"+v+" W:"+w+" X:"+x+" Y:"+y+" Z:"+z;
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("textQR", UserID);
        startActivity(i);

    }
     public int generate_name_hash(String name)
     {    int temp=0;
         for(int i=0;i<name.length();i++)
             temp= ( temp*197+ (int)name.charAt(i))%10000000;
         return temp;
     }

    public void Age(View view) {
          agecheck=true;
        int id = view.getId();
        if(id == R.id.zero)
            age=0;
        else
        if(id == R.id.ten)
            age=10;
        else
        if(id == R.id.sixteen)
            age=16;
        else
        if(id == R.id.fourty)
            age=41;
    }

    public void Gender(View view) {
        gendercheck=true;
        int id =view.getId();
        if(id == R.id.male)
            gender=0;
        else
            gender=1;
    }

    public void Traning(View view) {

           if(!agecheck || !gendercheck)
           {  Toast.makeText(this, "Please Fill in Order !", Toast.LENGTH_LONG).show();
               Intent i = new Intent(this, Main2Activity.class);
               startActivity(i);  }

            a=0;b=0;c=0;d=0;
        int id = view.getId();
                if (id == R.id.A)
                   if(gender==1 || age <16)
                       a=1;
                    else
                        a=2;
                else
                if(id == R.id.B)
                    if(gender==1 || age <16)
                        b=1;
                    else
                        b=2;
                else
                if(id == R.id.C)
                    if(gender==1 || age <16)
                        c=1;
                    else
                        c=2;
                else
                if(id == R.id.D)
                    if(gender==1 || age <16)
                        d=1;
                    else
                        d=2;
        }

    public void Exercise(View view) {
        p=0;q=0;r=0;s=0;
        int id = view.getId();
        if (id == R.id.P)
            p=1;
        else
        if(id == R.id.Q)
            q=1;
        else
        if(id == R.id.rr)
            r=1;
        else
        if(id == R.id.S)
            s=1;
    }

    public void checkboxV(View view) {
        if (((CheckBox) view).isChecked())
              v=1;
        else
            v=0;
    }

    public void checkboxW(View view) {
        if (((CheckBox) view).isChecked())
            w=1;
        else
            w=0;
    }

    public void checkboxY(View view) {
        if (((CheckBox) view).isChecked())
            y=1;
        else
            y=0;
    }

    public void checkboxZ(View view) {
        if (((CheckBox) view).isChecked())
            z=1;
        else
            z=0;
    }

    public void checkboxX(View view) {
        if (((CheckBox) view).isChecked())
            x=1;
        else
            x=0;
    }

 }




package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
EditText edt_n1 , edt_n2;
TextView txt_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_n1=(EditText)findViewById(R.id.edt_firstNumber);
        edt_n2=(EditText)findViewById(R.id.edt_seconNumber);
        txt_result=(TextView)findViewById(R.id.txt_result);

    }

    @Override
    public void onClick(View v) {
        int n1 = Integer.parseInt(edt_n1.getText().toString());
        int n2 = Integer.parseInt(edt_n1.getText().toString());
        int res = 0;

        switch (v.getId()) {
            case R.id.btn_power:
                break;

            case R.id.btn_divide:
                res=n1/n2;
                break;

            case R.id.btn_mutiply:
                res=n1*n2;
                break;

            case R.id.btn_plus:
                res=n1+n2;
                break;

            case R.id.btn_subtract:
                res=n1-n2;
                break;
        }
        printResult(res);
        clearBox();

    }

    private void clearBox() {
        edt_n1.setText(0);
        edt_n2.setText(0);
        txt_result.setText(00);
    }

    private void printResult(int res) {
        //e probado pasandole un string pero tampoco
        txt_result.setText(Integer.toString(res));
    }


}

package com.example.user.ganiefes;

import android.bluetooth.BluetoothSocket;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    public Switch sw;
    public ToggleButton tgb;
    public Button btn1;
    public LinearLayout ganiefes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw=findViewById(R.id.sw);
        tgb=findViewById(R.id.tgb);
        btn1=findViewById(R.id.btn1);
        ganiefes=findViewById(R.id.ganiefes);

    }

    public void ido(View view) {
        if(sw.isChecked()&&tgb.isChecked())
        ganiefes.setBackgroundColor(Color.RED);
        else {
            if (!sw.isChecked() && tgb.isChecked())
                ganiefes.setBackgroundColor(Color.BLUE);

        else {
            if (!sw.isChecked() && !tgb.isChecked())
                ganiefes.setBackgroundColor(Color.BLACK);
            else{
                if(sw.isChecked()&& !tgb.isChecked())
                    ganiefes.setBackgroundColor(Color.GREEN);
            }
        }
        }
        }
    }


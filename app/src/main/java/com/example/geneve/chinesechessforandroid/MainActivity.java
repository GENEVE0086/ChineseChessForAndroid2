package com.example.geneve.chinesechessforandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Switch switcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switcher = (Switch) findViewById(R.id.switch_ai);

        switcher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    Toast.makeText(MainActivity.this,"checked", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"unchecked", Toast.LENGTH_LONG).show();
            }
        });
    }
}

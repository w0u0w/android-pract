package ru.mirea.velikanov.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mytextView = (TextView)findViewById(R.id.textView3);
        mytextView.setText("PRESS BUTTON !!!");
        Button myBtn = (Button)findViewById(R.id.btnforpress);
        myBtn.setText("YES!!");
        CheckBox myChBtn = (CheckBox)findViewById(R.id.checkBox);
        myChBtn.setChecked(true);
    }
}
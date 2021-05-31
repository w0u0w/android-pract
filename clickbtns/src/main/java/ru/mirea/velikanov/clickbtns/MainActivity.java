package ru.mirea.velikanov.clickbtns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnOk;
    private Button btnCncl;
    private TextView tvOut;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView)findViewById(R.id.tvOut);
        btnOk = (Button)findViewById(R.id.btnOk);
        btnCncl = (Button)findViewById(R.id.btnCncl);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Pressed OK");
            }
        };
        btnOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Pressed Cancel");
            }
        };
        btnCncl.setOnClickListener(oclBtnCancel);
    }
}
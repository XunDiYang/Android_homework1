package com.yangxundi.hellword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        final TextView tv1 = findViewById(R.id.tv1);
        final EditText mtv1 = findViewById(R.id.mtv1);
        final ProgressBar pgb1 = findViewById(R.id.pgb1);
        final ImageView img1 = findViewById(R.id.img1);

        pgb1.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tv1.setText("The first words!");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pgb1.setVisibility(View.VISIBLE);
                tv1.setText("THANK YOU!");
            }
        });
    }
}

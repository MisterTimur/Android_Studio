package com.example.dynamic_component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText  txt1;
    Button btn1;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        ViewGroup.LayoutParams paramsLayout = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT
        );
        linearLayout.setLayoutParams(paramsLayout);
        ViewGroup.LayoutParams paramsButton = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        txt1 = new EditText(this);
        txt1.setHeight(300);
        txt1.setText("Текст 1");
        txt1.setWidth(300);
        linearLayout.addView(txt1, paramsButton);

        btn1 = new Button(this);
        btn1.setText("Кнопка 1");
        btn1.setWidth(300);
        linearLayout.addView(btn1, paramsButton);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(Integer.toString(txt1.getSelectionStart()));
            }
        });


        setContentView(linearLayout);


    }
}

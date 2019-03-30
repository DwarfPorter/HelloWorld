package ru.geekbrains.helloworld6;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView hello = findViewById(R.id.hello);
        Date currentTime = Calendar.getInstance().getTime();

        if (currentTime.getHours() <= 11) {
            hello.setText("Доброе утро!!");
        }
        if (currentTime.getHours() >= 12 && currentTime.getHours() <= 18) {
            hello.setText("Добрый день!!");
        }
        if (currentTime.getHours() > 18 && currentTime.getHours() <= 20){
            hello.setText("Добрый вечер!!");
        }
        else
        {
            hello.setText("Привет!!");
        }
        hello.setTextSize(42);

        final EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hello.setText(editText.getText());
            }
        });

    }
}

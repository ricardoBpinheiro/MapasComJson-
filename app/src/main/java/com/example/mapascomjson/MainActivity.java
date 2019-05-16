package com.example.mapascomjson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LISTACONTATO = "http://www.mocky.io/v2/5cdb4544300000640068cc7b";
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);
        Button b = findViewById(R.id.button);



        View.OnClickListener trocaTela = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(it);

            }
        };
        b.setOnClickListener(trocaTela);
    }
}

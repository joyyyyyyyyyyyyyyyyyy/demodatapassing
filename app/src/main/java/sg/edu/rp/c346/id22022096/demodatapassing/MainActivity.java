package sg.edu.rp.c346.id22022096.demodatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //event handling step1
    Button btnPassInteger;
    Button btnPassChar;
    TextView PassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //event handling step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);

        //event handling step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secondactivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });

        //event handling step 4
        btnPassChar = findViewById(R.id.buttonPassChar);

        //event handling step 5
        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, thirdactivity.class);
                intent.putExtra("char", 'a');
                startActivity(intent);
            }
        });

        //event handling step 6
        PassDouble = findViewById(R.id.PassDouble);

        //event handling step 7
        PassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fourthactivity.class);
                intent.putExtra("double", 99.9);
                startActivity(intent);
            }
        });

    }
}
package android.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class shopping extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "key";
    private  Button but1,but2,but3,but4,but5,but6,but7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        but1= findViewById(R.id.button1);
        but2= findViewById(R.id.button2);
        but3= findViewById(R.id.button3);
        but4= findViewById(R.id.button4);
        but5= findViewById(R.id.button5);
        but6= findViewById(R.id.button6);
        but7= findViewById(R.id.button7);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(shopping.this,MainActivity.class);
                intent.putExtra(EXTRA_MESSAGE,but1.getText().toString());
                startActivity(intent);
            }
        });
        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(shopping.this,MainActivity.class);
                intent.putExtra(EXTRA_MESSAGE,but2.getText().toString());
                startActivity(intent);
            }
        });
        but3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(shopping.this,MainActivity.class);
                intent.putExtra(EXTRA_MESSAGE,but3.getText().toString());
                startActivity(intent);
            }
        });
        but4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(shopping.this,MainActivity.class);
                intent.putExtra(EXTRA_MESSAGE,but4.getText().toString());
                startActivity(intent);
            }
        });
        but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(shopping.this,MainActivity.class);
                intent.putExtra(EXTRA_MESSAGE,but5.getText().toString());
                startActivity(intent);
            }
        });
        but6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(shopping.this,MainActivity.class);
                intent.putExtra(EXTRA_MESSAGE,but6.getText().toString());
                startActivity(intent);
            }
        });
        but7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(shopping.this,MainActivity.class);
                intent.putExtra(EXTRA_MESSAGE,but7.getText().toString());
                startActivity(intent);
            }
        });

    }
}

package android.example.troisboutonsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secondactivit extends AppCompatActivity {
private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivit);
        text = findViewById(R.id.textView);
        Intent intent=getIntent();
        String message = intent.getStringExtra(MainActivity.LOG_TAG).toString();
        text.setText(message);

    }
}
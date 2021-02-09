package android.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public  ListView listView;
    public static final int TEXT_REQUEST = 1;
    public String message1;
    public static int i=0;
    public ArrayList<String> listview = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Restore the state

        Intent intent1 = getIntent();
         message1 = "YOU SHOP: " + intent1.getStringExtra(shopping.EXTRA_MESSAGE);
        listView = (ListView) findViewById(R.id.listview);

        listview.add(message1);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listview);
        listView.setAdapter(arrayAdapter);
    }
    public void lunchshoppingactivity(View view) {

        Intent intent = new Intent(MainActivity.this, shopping.class);
        startActivity(intent);
        startActivityForResult(intent, TEXT_REQUEST);
    }
}
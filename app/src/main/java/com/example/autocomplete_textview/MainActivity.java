package com.example.autocomplete_textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autocom1;
    EditText editText;
    String[] productName = {   "Apple", "Banana", "Cat", "Dog", "Elephant",
            "Fox", "Giraffe", "Horse", "Ice Cream", "Jungle",
            "Kangaroo", "Lion", "Monkey", "Nest", "Ostrich",
            "Penguin", "Queen", "Rainbow", "Sunflower", "Tree",
            "Umbrella", "Volcano", "Waterfall", "Xylophone", "Yoga",
            "Zebra", "Beach", "Dragon", "Frog", "Grass",
            "House", "Igloo", "Jackal", "Kite", "Lighthouse",
            "Mango", "Noodle", "Octopus", "Piano", "Quilt",
            "Raccoon", "Sailboat", "Tiger", "Umbrella", "Violin",
            "Waffle", "X-ray", "Yogurt", "Zigzag",

            "Nazma", "Humayra", "Smartphone", "Science",
            "Smoke", "Water Bottle", "Headphones", "Planner",
            "Fitness Tracker", "Nadia", "Nafisa", "Naina", "Nabila"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autocom1 = findViewById(R.id.autocom1);
        editText = findViewById(R.id.editText); // Initialize editText

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, productName);
        autocom1.setAdapter(adapter1);

        autocom1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedText = parent.getItemAtPosition(position).toString();
                editText.setText(selectedText);
                Toast.makeText(MainActivity.this, getString(R.string.selecteditem) + " " + selectedText, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

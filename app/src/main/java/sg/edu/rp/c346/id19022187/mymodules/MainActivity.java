package sg.edu.rp.c346.id19022187.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346, tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate called.");

        tvC346 = findViewById(R.id.textViewC346);
        tvC349 = findViewById(R.id.textViewC349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("code", "C346");
                i.putExtra("name", "Android Programming");
                i.putExtra("year", 2020);
                i.putExtra("sem", 1);
                i.putExtra("modCre", 4);
                i.putExtra("venue", "W67G");
                startActivity(i);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("code", "C349");
                i.putExtra("name", "Ipad Programming");
                i.putExtra("year", 2021);
                i.putExtra("sem", 1);
                i.putExtra("modCre", 4);
                i.putExtra("venue", "W67J");
                startActivity(i);
            }
        });
    }
}

package sg.edu.rp.c346.id19022187.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode, tvName, tvYear, tvSem, tvCredit, tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewModCode);
        tvName = findViewById(R.id.textViewModName);
        tvYear = findViewById(R.id.textViewAY);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewModCre);
        tvVenue = findViewById(R.id.textViewVenue);

        btnBack = findViewById(R.id.button);

        Intent intentReceived = getIntent();

        String modCode = intentReceived.getStringExtra("code");
        String modName = intentReceived.getStringExtra("name");
        int acYear = intentReceived.getIntExtra("year", 0);
        int semester = intentReceived.getIntExtra("sem", 0);
        int modCredit = intentReceived.getIntExtra("modCre", 0);
        String venue = intentReceived.getStringExtra("venue");

        tvCode.setText("Module Code: " + modCode);
        tvName.setText("Module Name: " + modName);
        tvYear.setText("Academic Year: " + acYear);
        tvSem.setText("Semester: " + semester);
        tvCredit.setText("Module Credit: " + modCredit);
        tvVenue.setText("Venue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

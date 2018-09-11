package android.example.com.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radio1, radio2, radio3, radio4;
    Button submitButton;

    private static final String TAG  = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.RadioGroup1);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        radio4 = findViewById(R.id.radio4);

        submitButton = findViewById(R.id.submitButton);

        radio1.setOnCheckedChangeListener(onCheckedChangeListener);
        radio2.setOnCheckedChangeListener(onCheckedChangeListener);
        radio3.setOnCheckedChangeListener(onCheckedChangeListener);
        radio4.setOnCheckedChangeListener(onCheckedChangeListener);

        submitButton.setOnClickListener(onClickListener);

    }

    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
            if(compoundButton.isChecked()){
                Log.d(TAG, "onCheckedChanged: ");
                Toast.makeText(getBaseContext(), compoundButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        }
    };

    private Button.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(), "Submit Button is pressed", Toast.LENGTH_SHORT).show();
        }
    };
}

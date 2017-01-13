package app.linh.com.helloworldapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PopupActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String name = getIntent().getStringExtra(EXTRA_NAME);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        TextView txt = (TextView) findViewById(R.id.text);
        txt.setText("Hi " + name);
    }
}


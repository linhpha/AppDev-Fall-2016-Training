package app.linh.com.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PopupActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
    }
}

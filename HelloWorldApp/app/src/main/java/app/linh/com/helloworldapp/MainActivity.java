package app.linh.com.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
     TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //textView = (TextView) findViewById(R.id.hello_text_view);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Hello!", Toast.LENGTH_LONG).show();
                //String message = "HELLO WORLD!!!";
                //textView.setText(message);
                final Intent popupIntent = new Intent(getApplicationContext(), PopupActivity.class);
                String name = getIntent().getStringExtra(EXTRA_NAME);
               // TextView txt = (TextView) findViewById(R.id.text);
               // txt.setText("Hi " + name);
                popupIntent.putExtra(PopupActivity.EXTRA_NAME, "Linh");
                startActivity(popupIntent);

            }
        });
    }

}

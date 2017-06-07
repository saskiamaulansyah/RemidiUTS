package xir4n30.remidiuts.telkomschid.remidiuts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnswipe, btntab, btnspinner, btndrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnswipe = (Button) findViewById(R.id.swipe);
        btntab = (Button) findViewById(R.id.tab);
        btnspinner = (Button) findViewById(R.id.spinner);
        btndrawer = (Button) findViewById(R.id.drawer);

        btnswipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SwipeActivity.class));
            }
        });
        btntab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TabActivity.class));
            }
        });
        btnspinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
            }
        });
        btndrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DrawerActivity.class));
            }
        });
    }
}

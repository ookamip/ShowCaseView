package ir.smartdevelop.eram.showcaseview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.txt);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Clicked!",Toast.LENGTH_LONG).show();
            }
        });

        final GuideView guideView = new GuideView(this, view);
        guideView.setTitle("Guide Title Text");
        guideView.setContentText("Guide Description Text .....");
        guideView.show();
    }
}

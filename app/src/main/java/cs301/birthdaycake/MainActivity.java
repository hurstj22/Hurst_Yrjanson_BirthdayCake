package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //retrieve reference from gui of CakeView object
        CakeView cake = findViewById(R.id.cakeview);
        CakeController cakeC = new CakeController(cake);

        //button functionality
        Button blowOutButton = (Button) findViewById(R.id.blowOutButton);
        blowOutButton.setOnClickListener((View.OnClickListener) cakeC);
    }

    public void goodbye(View button){
        System.out.println("Goodbye");
        finishAffinity();
    }

}

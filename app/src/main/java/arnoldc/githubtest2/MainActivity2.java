package arnoldc.githubtest2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main2);
        final Button finishSecondActivity = (Button) super.findViewById(R.id.back_button);
        finishSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent();
                i1.setClass(MainActivity2.this,MainActivity.class);
                startActivity(i1);
            }
        });
    }
}

package arnoldc.githubtest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main2,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem action_next) {
        int id= action_next.getItemId();
        if (id == R.id.action_next){
            Intent i1 = new Intent();
            i1.setClass(MainActivity2.this,MainActivity.class);
            startActivity(i1);
        }
        return  super.onOptionsItemSelected(action_next);
    }
}

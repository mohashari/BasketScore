package sinau.com.basketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a=0;
    int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pointA1(View v){
        a=a+1;
        scoreA(a);
    }
    public void pointA3(View v){
        a=a+3;
        scoreA(a);
    }
    public void resertA(View v){
        a=0;
        scoreA(a);
    }
    public void scoreA(int a){
        TextView txtScoreA =(TextView) findViewById(R.id.scoreA);
        txtScoreA.setText(String.valueOf(a));
    }

}

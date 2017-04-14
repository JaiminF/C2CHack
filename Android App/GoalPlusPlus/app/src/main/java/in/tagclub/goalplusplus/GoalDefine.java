package in.tagclub.goalplusplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class GoalDefine extends AppCompatActivity {

    ImageButton mLearn,mBudget,mGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.activity_goal_define);

        mLearn = (ImageButton)findViewById(R.id.imageButtonLearn);
        mBudget = (ImageButton)findViewById(R.id.imageButtonBudget);
        mGoal = (ImageButton)findViewById(R.id.imageButtonGoal);

        mLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGoal = new Intent(GoalDefine.this, BottomNavHome.class);
                startActivity(toGoal);
            }
        });

        mBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGoal = new Intent(GoalDefine.this, BottomNavHome.class);
                startActivity(toGoal);
            }
        });

        mGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGoal = new Intent(GoalDefine.this, BottomNavHome.class);
                startActivity(toGoal);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

package in.tagclub.goalplusplus;

import android.content.Intent;
import android.support.transition.Fade;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    EditText username,password;
    Button mLogin;
    String mUser,mPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        setContentView(R.layout.activity_sign_in);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        mLogin = (Button)findViewById(R.id.login);


        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUser = username.getText().toString();
                mPass = password.getText().toString();
                if (mUser.compareToIgnoreCase("user")==0 && mPass.compareTo("pass")==0){
                    Intent toGoal = new Intent(SignInActivity.this, GoalDefine.class);
                    startActivity(toGoal);
                }
                else{
                    Toast.makeText(SignInActivity.this, "Invalid credentials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

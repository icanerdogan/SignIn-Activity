package com.icanerdogan.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // DEFINITION COMPONENT
    EditText txtUsername, txtPassword;
    Button btnSignIn, btnSignInToSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // HIDE TITLE BAR
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        // INITIALIZE COMPONENT
        txtUsername = findViewById(R.id.txtSignInUsername);
        txtPassword = findViewById(R.id.txtSignInPassword);

        // BUTTON
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignInToSignUp = findViewById(R.id.btnSignInSignUp);

        btnSignIn.setOnClickListener(this);
        btnSignInToSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSignIn:
                SignIn();
                break;
            case R.id.btnSignInSignUp:
                SignInToSignUp();
                break;
        }
    }

    private void SignInToSignUp() {
        // INTENT TO SIGNUP
    }

    private void SignIn() {
        // INTENT TO APP
    }
}
package com.example.login;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Locale;

public class LoginPage extends AppCompatActivity {
    Button login;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        login = findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String User_Name = username.getText().toString();
                String Pass_word = password.getText().toString();
                if (User_Name.equals(""))
                    Toast.makeText(LoginPage.this, "Please enter Email", Toast.LENGTH_SHORT).show();
                else if (Pass_word.equals(""))
                    Toast.makeText(LoginPage.this, "Please enter password", Toast.LENGTH_SHORT).show();
                else if(User_Name.equals("Nishu") || Pass_word.equals("0722")){
                    Intent intent = new Intent(LoginPage.this,Nisha.class);
                    startActivity(intent);
                }
            }
        });
    }
}

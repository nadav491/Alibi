package com.example.alibi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    private TextView firstName, lastName, email;
    private Button submit,clean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        this.firstName = findViewById(R.id.editText_register_firstName);
        this.lastName = findViewById(R.id.editText_register_lastName);
        this.email = findViewById(R.id.editText_register_email);
        this.clean = findViewById(R.id.button_register_clean);
        this.clean.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                clean();
            }
        });
        this.submit = findViewById(R.id.button_register_submit);
        this.submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                checkInput();
            }
        });
    }

    private void clean()
    {
        this.firstName.setText("");
        this.lastName.setText("");
        this.email.setText("");
    }

    private boolean checkInput()
    {
        String email = this.email.getText().toString();
        if(!email.contains("@"))
        {
            clean();
            this.firstName.setText("Error");
            this.lastName.setText("idiot");
            return false;
        }
        return true;
    }
}

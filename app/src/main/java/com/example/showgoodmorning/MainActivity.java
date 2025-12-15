package com.example.showgoodmorning;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView result1, result2;
    EditText n1, n2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        Toast.makeText(this, "Welcome to Good Morning!!", Toast.LENGTH_SHORT).show();

        result1 = findViewById(R.id.result1);
        result2 = findViewById(R.id.result2);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                int multiplication = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
                result1.setText("The Sum is: " + sum);
                result2.setText("The Multiplication is: " + multiplication);
            }
        });

    }
}
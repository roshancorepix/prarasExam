package com.example.parasexternal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddEmployeeActivity extends AppCompatActivity {

    private EditText et_name,et_salary;
    private Button btnAdd;
    private String name,salary;
    private DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        et_name = findViewById(R.id.et_name);
        et_salary = findViewById(R.id.et_salary);
        btnAdd = findViewById(R.id.btn_add);

        name = et_name.getText().toString();
        salary = et_salary.getText().toString();

        dbHelper = new DBHelper(this);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addEmployee(name,salary);
            }
        });

    }

    private void addEmployee(String name, String salary) {
        if (name != ""){
            dbHelper.insertContact(name, salary);
            Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "All Fields are required", Toast.LENGTH_SHORT).show();
        }
    }
}
package com.example.parasexternal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DeleteEmployeeActivity extends AppCompatActivity {

    EditText et_delete;
    Button btn_delete;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_employee);

        et_delete = findViewById(R.id.et_delete);
        btn_delete = findViewById(R.id.btn_delete);

        dbHelper = new DBHelper(this);

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbHelper.deleteContact(Integer.parseInt(et_delete.getText().toString()));
            }
        });
    }
}
package com.example.parasexternal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateEmployee extends AppCompatActivity {

    private EditText et_id,et_name;
    private Button btn_update;
    private DBHelper dbHelper;
    String name;
    int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_employee);

        et_name = findViewById(R.id.et_name);
        et_id = findViewById(R.id.et_id);
        btn_update=findViewById(R.id.btn_update);
        dbHelper = new DBHelper(this);
        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               name = et_name.getText().toString();
               id = Integer.parseInt(et_id.getText().toString());

               dbHelper.updateContact(id,name);

                Toast.makeText(UpdateEmployee.this, "updated", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
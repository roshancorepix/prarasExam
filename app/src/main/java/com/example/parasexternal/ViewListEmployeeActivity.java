package com.example.parasexternal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ViewListEmployeeActivity extends AppCompatActivity {

    private RecyclerView rv;
    private EmployeeAdapter adapter;
    private DBHelper dbHelper;
    private ArrayList<Employee> list= new ArrayList<>();
    private List<Employee> empList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list_employee);

        rv = findViewById(R.id.rv);

        dbHelper = new DBHelper(this);
        list = dbHelper.getAllCotacts();
        Log.e("GG","Name: "+list.get(0).getEmpName());


        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new EmployeeAdapter(list,this);
        rv.setAdapter(adapter);
    }

}
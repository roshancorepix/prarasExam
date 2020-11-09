package com.example.parasexternal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);

        switch(item.getItemId()) {
            case R.id.add:
                startActivity(new Intent(MainActivity.this, AddEmployeeActivity.class));
                break;

            case R.id.update:
                startActivity(new Intent(MainActivity.this,UpdateEmployee.class));
                break;

            case R.id.delete:
                startActivity(new Intent(MainActivity.this,DeleteEmployeeActivity.class));
                break;

            case R.id.view:
                startActivity(new Intent(MainActivity.this,ViewListEmployeeActivity.class));
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
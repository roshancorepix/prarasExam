package com.example.parasexternal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    private List<Employee> employeeList;
    private Context context;

    public EmployeeAdapter(List<Employee> employeeList, Context context) {
        this.employeeList = employeeList;
        this.context = context;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item,parent,false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        holder.empId.setText(employeeList.get(position).getId());
        holder.empName.setText(employeeList.get(position).getEmpName());
        holder.empSalary.setText(employeeList.get(position).getSalary());

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public class EmployeeViewHolder extends RecyclerView.ViewHolder{
        TextView empId,empName,empSalary;
        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            empId=itemView.findViewById(R.id.emp_id);
            empName=itemView.findViewById(R.id.emp_name);
            empSalary=itemView.findViewById(R.id.emp_salary);
        }
    }
}

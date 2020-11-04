package com.example.reclyclerv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Element_list e;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Element_list> element_items=new ArrayList<>();
        element_items.add(new Element_list(R.drawable.ic_android1,"Java","Ratings:****"));
        element_items.add(new Element_list(R.drawable.ic_android2,"Android","Ratings:*****"));
        element_items.add(new Element_list(R.drawable.ic_android3,"C++","Ratings:***"));
        element_items.add(new Element_list(R.drawable.ic_android4,"Python","Ratings:****"));
        element_items.add(new Element_list(R.drawable.ic_android5,"C","Ratings:**"));

        recyclerView=findViewById(R.id.ReclycerVieww);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       Adapter1 adapter1=new Adapter1(element_items);
        recyclerView.setAdapter(adapter1);

    }
}

package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Items> CardList;

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardList = new ArrayList<>();

        CardList.add(
                new Items(
                    "Shubham raj",
                    "07/21",
                        "5670 6700 1234"
                )
        );
        CardList.add(
                new Items(
                        "Shivam Raj",
                        "07/21",
                        "5670 6700 1234"
                )
        );
        CardList.add(
                new Items(
                        "Manish Kumar",
                        "07/21",
                        "5670 6700 1234"
                )
        );
        CardList.add(
                new Items(
                        "Anand Reddy",
                        "07/21",
                        "5670 6700 1234"
                )
        );
        CardList.add(
                new Items(
                        "Dhanu Pandey",
                        "07/21",
                        "5670 6700 1234"
                )
        );
        CardList.add(
                new Items(
                        "Ravish Kumar",
                        "07/21",
                        "5670 6700 1234"
                )
        );
        CardList.add(
                new Items(
                        "Shubham raj",
                        "07/21",
                        "5670 6700 1234"
                )
        );
        CardList.add(
                new Items(
                        "Mnish Kumar",
                        "02/23",
                        "4670 4353 5678"
                )
        );
        ItemsAdapter adapter = new ItemsAdapter(CardList,this);
        recyclerView.setAdapter(adapter);








    }
}

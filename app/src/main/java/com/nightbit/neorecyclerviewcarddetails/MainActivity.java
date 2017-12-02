package com.nightbit.neorecyclerviewcarddetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<People> mArrayList;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrayList =  new ArrayList<People>();
        mArrayList.add(new People("Joe", "Bob","Subject 1", "This is my Story"));
        mArrayList.add(new People("Riddle", "Cage","Subject 2", "I am for you Alone"));
        mArrayList.add(new People("Yard", "Junk","Subject 3", "Go where you want to go pleae"));
        mArrayList.add(new People("Grid", "Labe;","Subject 4", "Just Sleep at your own time"));
        mArrayList.add(new People("Crap", "Cannon","Subject 5", "We are where we are because you are not good"));
        mArrayList.add(new People("Foam", "Grean","Subject 6", "Leave them where they are for now"));
        mArrayList.add(new People("Jade", "Day","Subject 7", "Today is another day, Just Enjoy"));
        mArrayList.add(new People("Bow", "Angle","Subject 8", "Leave your life the way you want it"));
        mArrayList.add(new People("Gray", "Stone","Subject 9", "You are the Son of your father"));
        mArrayList.add(new People("Brown", "Gold","Subject 10", "Guess who you are> Goat"));
        mArrayList.add(new People("Mark", "David","Subject 11", "Keep Junping am with you guys"));

        mRecyclerView = findViewById(R.id.recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new PeopleAdapter(mArrayList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}

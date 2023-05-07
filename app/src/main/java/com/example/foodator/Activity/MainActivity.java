package com.example.foodator.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodator.Activity.Adapter.CategoryAdapter;
import com.example.foodator.Activity.Adapter.PopularAdapter;
import com.example.foodator.Activity.Domain.CategoryDomain;
import com.example.foodator.Activity.Domain.FoodDomain;
import com.example.foodator.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter,adapter2;
private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewCategory();
        recyclerViewPopular();

    }

    private void recyclerViewCategory() {
        LinearLayoutManager LinearLayoutManager=new LinearLayoutManager(this, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(LinearLayoutManager);
        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain("Pizza","cat1"));
        category.add(new CategoryDomain("Burger","cat2"));
        category.add(new CategoryDomain("HotDog","cat3"));
        category.add(new CategoryDomain("Drink","cat4"));
        category.add(new CategoryDomain("Donut","cat5"));

        adapter=new CategoryAdapter(category);
        recyclerViewCategoryList.setAdapter(adapter);

    }
    private void recyclerViewPopular(){
        LinearLayoutManager LinearLayoutManager=new LinearLayoutManager(this, androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList=findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(LinearLayoutManager);
        ArrayList<FoodDomain> foodList=new ArrayList<>();
        foodList.add(new FoodDomain("Pepporoni pizza","pop_1","xyz",10));
        foodList.add(new FoodDomain("Cheese burger","pop_2","xyz",8.47));
        foodList.add(new FoodDomain("Vegetable pizza","pop_3","xyz",9.47));

        adapter2=new PopularAdapter(foodList);
        recyclerViewPopularList.setAdapter(adapter2);




    }

}
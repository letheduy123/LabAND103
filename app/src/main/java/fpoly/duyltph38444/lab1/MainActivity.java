package fpoly.duyltph38444.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import fpoly.duyltph38444.lab1.adapter.FoodAdapter;
import fpoly.duyltph38444.lab1.model.Food;

public class MainActivity extends AppCompatActivity {
ListView lv;
ArrayList<Food>list;
FoodAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        list=new ArrayList<>();
        adapter=new FoodAdapter(list,MainActivity.this);
        Food food=new Food("Pho bo",300,"thanh hoa",R.drawable.ic_launcher_background);
        list.add(food);
        Food food1=new Food("Pho ngan",400,"thanh lien",R.drawable.ic_launcher_background);
        list.add(food1);
        Food food2=new Food("Pho tai",500,"thanh duc",R.drawable.ic_launcher_background);
        list.add(food2);
        lv.setAdapter(adapter);



    }

}
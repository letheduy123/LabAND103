package fpoly.duyltph38444.lab1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import fpoly.duyltph38444.lab1.R;
import fpoly.duyltph38444.lab1.model.Food;


public class FoodAdapter extends BaseAdapter {
    ArrayList<Food>list;
    Context context;

    public FoodAdapter(ArrayList<Food> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        if (list !=null)

        return list.size();
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
//        LayoutInflater.from(context).inflate(R.layout.item,null);
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.item,parent,false);
        Food food =list.get(position);
        ImageView img =view.findViewById(R.id.img);
        TextView tvName =view.findViewById(R.id.tvName);
        TextView tvPrice =view.findViewById(R.id.tvPrice);
        TextView tvAddress =view.findViewById(R.id.tvAddress);

        img.setImageResource(food.getImg());
        tvName.setText(food.getName());
        tvPrice.setText(String.valueOf(food.getPrice()));
        tvAddress.setText(food.getAddress());

        return view ;
    }



}


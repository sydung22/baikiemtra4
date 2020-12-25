package com.example.layouttuchon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    ListView listView;
    ArrayList<item> list;
    itemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        list = new ArrayList<>();
        list.add(new item("Yêu Em Rất Nhiều","Ca sĩ: Hoàng Tôn","Năm phát hành: 2020",R.drawable.bonghoa));
        list.add(new item("Cô Gái Vàng","Ca sĩ: Lê Hoàng","Năm phát hành: 2020",R.drawable.cogaivang));
        list.add(new item("Đen Đá Không Đường","Ca sĩ: Amee","Năm phát hành: 2020",R.drawable.denda));
        list.add(new item("Em Bé","Ca sĩ: Amee","Năm phát hành: 2020",R.drawable.embe));
        list.add(new item("Yeu Em Rat Nhieu","Ca si: Hoang Ton","Nam phat hanh: 2020",R.drawable.emdabiet));
        list.add(new item("Yeu Em Rat Nhieu","Ca si: Hoang Ton","Nam phat hanh: 2020",R.drawable.lena));
        list.add(new item("Yeu Em Rat Nhieu","Ca si: Hoang Ton","Nam phat hanh: 2020",R.drawable.saochuave));
        list.add(new item("Yeu Em Rat Nhieu","Ca si: Hoang Ton","Nam phat hanh: 2020",R.drawable.simplelove));
        list.add(new item("Yeu Em Rat Nhieu","Ca si: Hoang Ton","Nam phat hanh: 2020",R.drawable.yeuem));
        itemAdapter = new itemAdapter(R.layout.item_list,this,list);
        listView.setAdapter(itemAdapter);
        viewFlipper = findViewById(R.id.viewFlipper);
        int Image[]={R.drawable.bonghoa,R.drawable.cogaivang,R.drawable.denda,R.drawable.emdabiet};
        for (int i=0;i<Image.length;i++){
            Flipperimage(Image[i]);
        }

    }
    public void Flipperimage(int img){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
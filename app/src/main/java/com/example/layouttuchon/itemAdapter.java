package com.example.layouttuchon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class itemAdapter extends BaseAdapter {
    int layout;
    Context context;
    List<item> itemList;

    public itemAdapter(int layout, Context context, List<item> itemList) {
        this.layout = layout;
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public class ViewHolder{
        TextView title,text1,text2;
        ImageView image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(layout,null);
            viewHolder = new ViewHolder();
            viewHolder.image=convertView.findViewById(R.id.image);
            viewHolder.title=convertView.findViewById(R.id.title);
            viewHolder.text1=convertView.findViewById(R.id.name);
            viewHolder.text2=convertView.findViewById(R.id.year);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder=(ViewHolder)convertView.getTag();
        }
        viewHolder.image.setImageResource(itemList.get(position).getImage());
        viewHolder.text1.setText(itemList.get(position).getText1());
        viewHolder.text2.setText(itemList.get(position).getText2());
        viewHolder.title.setText(itemList.get(position).getTitle());
        return convertView;
    }
}

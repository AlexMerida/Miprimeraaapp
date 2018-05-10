package com.teaching.android.miprimeraapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    String[] talesName = {"Symphonia", "Vesperia", "Abbys", "Graces F", "Xillia"};
    int[] talesImage = {R.drawable.tales_of_symphonia, R.drawable.tales_of_vesperia, R.drawable.tales_of_abbys, R.drawable.tales_of_grace, R.drawable.tale_of_xillia};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(new MyAdapter());

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListActivity.this, "Posición seleccionada "+ position, Toast.LENGTH_LONG).show();
            }
        });
    }
    private class MyAdapter extends BaseAdapter{
        @Override
        public int getCount(){
            return talesName.length;
        }
        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position){
            return 10;
        }
        @Override
        public View getView (int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View RowView = inflater.inflate(R.layout.datos, parent, false);

            ImageView Icon = RowView.findViewById(R.id.talesImage);
            Icon.setImageResource(talesImage[position]);

            TextView textView = RowView.findViewById(R.id.talesName);
            textView.setText(talesName[position]);

            return RowView;
        }
    }

}

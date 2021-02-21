package com.example.bankingsystem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class customerdetails3 extends AppCompatActivity {
    ListView list;
    String mTitle[]={"Mahesh","Kiran","Jyothi","Swapna","Suresh","Yamuna","Swathi","Ram","Naveen","Vasavi"};
    String mSubtitle[]={"Balance:70000","Balance:85000","Balance:100000","Balance:50000","Balance:75000","Balance:80000","Balance:55000","Balance:65000","Balance:45000","Balance:60000"};
    int Images[]={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerdetails3);

        list = findViewById(R.id.list);

        MyAdapter adapter = new MyAdapter(this, mTitle, mSubtitle, Images);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(getApplicationContext(), person.class);
                    startActivity(i);
                    Toast.makeText(customerdetails3.this, "Mahesh", Toast.LENGTH_SHORT);
                }
                if (position == 1) {
                    Intent i = new Intent(getApplicationContext(), person1.class);
                    startActivity(i);
                    Toast.makeText(customerdetails3.this, "Kiran", Toast.LENGTH_SHORT);
                }
                if (position == 2) {
                    Intent i = new Intent(getApplicationContext(), person2.class);
                    startActivity(i);
                    Toast.makeText(customerdetails3.this, "Jyothi", Toast.LENGTH_SHORT);
                }
                if (position == 3) {
                    Intent i = new Intent(getApplicationContext(), person3.class);
                    startActivity(i);
                    Toast.makeText(customerdetails3.this, "Swapna", Toast.LENGTH_SHORT);
                }
                if (position == 4) {
                    Intent i = new Intent(getApplicationContext(), person4.class);
                    startActivity(i);
                    Toast.makeText(customerdetails3.this, "Suresh", Toast.LENGTH_SHORT);
                }
                if (position == 5) {
                    Intent i = new Intent(getApplicationContext(), person5.class);
                    startActivity(i);
                    Toast.makeText(customerdetails3.this, "Yamuna", Toast.LENGTH_SHORT);
                }
                if (position == 6) {
                    Intent i = new Intent(getApplicationContext(), person6.class);
                    startActivity(i);
                    Toast.makeText(customerdetails3.this, "Yamuna", Toast.LENGTH_SHORT);
                }
                if (position == 7) {
                    Intent i = new Intent(getApplicationContext(), person7.class);
                    startActivity(i);
                }

                if (position == 8) {
                    Intent i = new Intent(getApplicationContext(), person8.class);
                    startActivity(i);

                }
                if (position == 9) {
                    Intent i = new Intent(getApplicationContext(), person9.class);
                    startActivity(i);

                }

            }
        });

    }


    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rSubtitle[];
        int rImgs[];

        MyAdapter(Context c,String title[],String subtitle[],int imgs[]) {
            super(c,R.layout.row,R.id.textView1,title);
            this.context=c;
            this.rTitle=title;
            this.rSubtitle=subtitle;
            this.rImgs=imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images=row.findViewById(R.id.image);
            TextView MyTitle=row.findViewById(R.id.textView1);
            TextView MySubtitle=row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            MyTitle.setText(rTitle[position]);
            MySubtitle.setText(rSubtitle[position]);

            return row;


        }
    }
    }


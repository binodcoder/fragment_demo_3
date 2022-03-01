package com.binodcoder.fragmentdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.binodcoder.fragmentdemo2.Fragments.FragmentFirst;
import com.binodcoder.fragmentdemo2.Fragments.FragmentSecond;

public class MainActivity extends AppCompatActivity {
    Button first, second;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(Button)findViewById(R.id.btn_first);
        second=(Button)findViewById(R.id.btn_second);
        container=(LinearLayout)findViewById(R.id.fragment_container);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentFirst fragmentFirst=new FragmentFirst();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragmentFirst);
                fragmentTransaction.commit();

            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentSecond fragmentSecond=new FragmentSecond();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragmentSecond);
                fragmentTransaction.commit();

            }
        });

    }
}
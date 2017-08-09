package com.wzq.chinamap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                list = new ArrayList<>();
//                for(int i = 0; i < 10000000L;i ++){
//                    list.add(i + "");
//                }
//            }
//        }).start();

    }
}

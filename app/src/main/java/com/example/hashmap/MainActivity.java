package com.example.hashmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("India", "Delhi");//adding keys and values
        hashMap.put("Japan", "Tokyo");
        hashMap.put("USA", "washington");
        hashMap.put("England", "London");
        System.out.println("out is=" + hashMap);

        hashMap.get("USA");//accessing element using key means getting value using key value only
        System.out.println("out is=" + hashMap.get("USA"));

        hashMap.remove("Japan");//removing element using remove();
        System.out.println("out is=" + hashMap);

        hashMap.size();//checking HashMap size using size();
        System.out.println("out is=" + hashMap.size());

        for (String s1 : hashMap.keySet()) {// printing key only
            System.out.println("out is=" + s1);
        }
        for (String s2 : hashMap.values()) {
            System.out.println("out is=" + s2);// printing values only.
        }
        for (String s1 : hashMap.keySet()) {//printing both key and values together
            System.out.println("key:" + s1 + "value:" + hashMap.get(s1));
        }
        hashMap.clear();// clearing all elements
        System.out.println(hashMap);
    }
}

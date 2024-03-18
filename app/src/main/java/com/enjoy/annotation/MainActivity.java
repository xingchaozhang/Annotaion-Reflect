package com.enjoy.annotation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.enjoy.annotation.inject.InjectUtils;
import com.enjoy.annotation.inject.InjectView;

import java.util.ArrayList;

@Lance(value = 1, id = "2")
public class MainActivity extends AppCompatActivity {
    int i;


    int j;


    @InjectView(R.id.tv)
    private TextView tv;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectUtils.injectView(this);

        tv.setText("lance真tm帅！！！");


        ArrayList<UserParcelable> userParcelableList = new ArrayList<>();

        userParcelableList.add(new UserParcelable("Jett"));
        Intent intent = new Intent(this, SecondActivity.class)
                .putExtra("name", "Lance")
                .putExtra("attr","帅")
                .putExtra("array", new int[]{1, 2, 3, 4, 5, 6})
                .putExtra("userParcelable", new UserParcelable("Lance"))
                .putExtra("userParcelables", new UserParcelable[]{new UserParcelable("Alvin")})
                .putExtra("users",new UserSerializable[]{new UserSerializable("Jett")})
                .putExtra("strs",new String[]{"1","2"})
                .putParcelableArrayListExtra("userParcelableList", userParcelableList);
        startActivity(intent);
    }


}

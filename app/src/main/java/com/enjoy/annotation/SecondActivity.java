package com.enjoy.annotation;

import android.os.Bundle;
import android.os.Parcelable;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.enjoy.annotation.inject.Autowired;
import com.enjoy.annotation.inject.InjectUtils;

import java.util.Arrays;
import java.util.List;

@com.enjoy.ann.Lance
public class SecondActivity extends AppCompatActivity {

    int i,j;
    String k;

    @Autowired
    String name;

    @Autowired("attr")
    String attr;

    @Autowired
    int[] array;

    @Autowired
    UserParcelable userParcelable;

    @Autowired
    UserParcelable[] userParcelables;

    @Autowired
    List<UserParcelable> userParcelableList;

    @Autowired("users")
    UserSerializable[] userSerializables;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectUtils.injectAutowired(this);
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SecondActivity{" +
                "name='" + name + '\'' +
                ", attr='" + attr + '\'' +
                ", array=" + Arrays.toString(array) +
                ", userParcelable=" + userParcelable +
                ", userParcelables=" + Arrays.toString(userParcelables) +
                ", userParcelableList=" + userParcelableList +
                ", userSerializables=" + Arrays.toString(userSerializables) +
                '}';
    }
}

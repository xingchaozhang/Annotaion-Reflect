package com.enjoy.annotation.intdef;

import androidx.annotation.DrawableRes;
import androidx.annotation.IntDef;

import com.enjoy.annotation.R;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test {

    private static WeekDay mCurrentDay;
    @WekDay
    private static int mCurrentIntDay;

    //每一个成员就是一个Wek对象
    enum WeekDay {
        SUNDAY, MONDAY
    }

    private static final int SUNDAY = 0;
    private static final int MONDAY = 1;


    @IntDef({SUNDAY, MONDAY})
    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @interface WekDay {  //注解

    }


    public static void setCurrentDay(WeekDay currentDay) {
        mCurrentDay = currentDay;
    }



    public static void setCurrentDay(@WekDay int currentDay) {
        mCurrentIntDay = currentDay;
    }

    public static void setDrawable(@DrawableRes int id) {

    }

    public static void main(String... args) {
        setDrawable(R.drawable.ic_launcher_background);

        setCurrentDay(WeekDay.SUNDAY);

        setCurrentDay(SUNDAY);
    }

}

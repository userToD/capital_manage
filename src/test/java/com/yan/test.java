package com.yan;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class test {
    public static void main(String[] args) {
        java.util.Date d = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateNowStr = sdf.format(d);
        System.out.println("格式化后的日期：" + dateNowStr);

        String str = "2012-1-13";	//要跟上面sdf定义的格式一样
        java.sql.Date today = null;
        try {
            today = (java.sql.Date) sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(today);
    }
}

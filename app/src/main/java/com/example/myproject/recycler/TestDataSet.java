package com.example.myproject.recycler;

import com.example.myproject.R;

import java.util.ArrayList;
import java.util.List;

public class TestDataSet {

    public static List<TestData> getData() {
        List<TestData> result = new ArrayList();
        result.add(new TestData("yty","早起先笑一笑","1:05", R.drawable.touxiang0));
        result.add(new TestData("虎哥","等等他们吧","14:10", R.drawable.touxiang5));
        result.add(new TestData("zpxgdx","太惨了","16:44", R.drawable.touxiang6));
        result.add(new TestData("小憨包","找到了","2:10", R.drawable.touxiang1));
        result.add(new TestData("jiaoji","太强了","4:50", R.drawable.touxiang2));
        result.add(new TestData("青空","麻烦了","12:30", R.drawable.touxiang3));
        result.add(new TestData("zqy","ylrc","13:55", R.drawable.touxiang4));
        result.add(new TestData("彩色砖头","我是按钮","17:05", R.drawable.touxiang7));
        result.add(new TestData("普通砖头","我是图片","18:45", R.drawable.touxiang8));
        result.add(new TestData("金色砖头","我也是图片","20:05", R.drawable.touxiang9));
        return result;
    }

}

package com.example.simeunbo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView stdView;
    private ArrayList<Student> stdList;
    private StudentAdapter stdAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stdView = (ListView) findViewById(R.id.mainList);

        stdList = new ArrayList<>();

        stdList.add(new Student("이승엽", "36번"));
        stdList.add(new Student("심창민", "18번"));
        stdList.add(new Student("권오준", "45번"));
        stdList.add(new Student("조동찬", "5번"));
        stdList.add(new Student("김상수", "7번"));
        stdList.add(new Student("백상원", "52번"));
        stdList.add(new Student("러프", "50번"));
        stdList.add(new Student("구자욱", "65번"));
        stdList.add(new Student("배영섭", "25번"));
        stdList.add(new Student("김헌곤", "34번"));
        stdList.add(new Student("박한이", "33번"));
        stdList.add(new Student("박해민", "58번"));
        stdList.add(new Student("이지영", "56번"));
        stdList.add(new Student("최경철", "53번"));

        stdAdapter = new StudentAdapter(stdList, MainActivity.this);

        stdView.setAdapter(stdAdapter);

    }
}
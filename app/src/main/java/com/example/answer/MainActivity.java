package com.example.answer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private boolean question1(ArrayList<String> array1, ArrayList<String> array2){
        for(int i=0;i<array1.size();i++){
            if(!array1.get(i).matches("[A-Z]")){
                return false;
            }
        }
        for(int j=0;j<array2.size();j++){
            if(!array2.get(j).matches("[A-Z]")){
                return false;
            }
        }
        if(array1.contains(array2)){
            return true;
        }else{
            return false;
        }
    }

    private void question2(){
        //I think the complexity of the first question is general.I need to consider the array for char or String I also need to think about whether the array contains others.
    }

    private ArrayList<Integer> question3(ArrayList<Integer> list){
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            //定义num1、num2、num3三个变量，代表数列中连续的三个数
            int num1= 1;
            int num2 =1;
            int num3;
            int j=3;
            //输出数列的第三个数到第十个数
            while(true){
                num3 = num1 + num2; //求出第i个数
                if(list.get(i)<num3){
                    list1.add(num3);
                    break;
                }
                num1=num2;
                num2=num3;
                j++;
            }
        }
        return list1;
    }
}

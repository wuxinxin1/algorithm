package com.algorithms.wuxinxin;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 主题：给定一个整数，删除 1-（n-1）个数，得到最大值
 * 例如：
 * 23954：
 * 删除1个数字：删除2,得到3954
 * 删除2个数字：删除2，3,得到954
 * 838291：
 * 删除1个数字：删除3,得到88291
 * 删除2个数字：删除3,8,得到8291
 * Created by Administrator on 2018/12/16/016.
 */
public class Topic011 {

    private static  int hasRemoveNum = 0;

    public static void main(String[] args) {
        int[] numer = {8,3,8,2,9,1};

        removeMin(numer,5);
        result(numer);
    }


    public static void removeMin(int[] array,int n){

        if(n<1 || n>=array.length || array.length==0){
            return;
        }

        while (hasRemoveNum<n){
            int len=array.length-1-hasRemoveNum;
            for(int i=0;i<len;i++){
                if(array[i]<array[i+1]){
                    hasRemoveNum++;
                    for(int j=i;j<len;j++){
                        array[j]=array[j+1];
                    }
                    break;
                }
            }
        }
    }

    public static List<Integer> result(int[] array){
        List<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<array.length;i++){
            if(array[i]!=-1){
                System.out.println(array[i]);
                list.add(array[i]);
            }
        }
        return list;
    }
}

package com.algorithms.wuxinxin;

/**
 * 主题：给定一个整数，删除 1-（n-1）个数，得到最大值
 * 例如：
 *  23954：
 *     删除1个数字：删除2,得到3954
 *     删除2个数字：删除2，3,得到954
 *  838291：
 *     删除1个数字：删除3,得到88291
 *     删除2个数字：删除3,8,得到8291
 * Created by Administrator on 2018/12/16/016.
 */
public class Topic01 {

    public static void main(String[] args) {
        int[]  numer={2,3,9,5,4};

        System.out.println(getMaxValueIndex(numer,0,4));
    }

    public  static void   binarySearch(int[]array,int start,int end,int n){
       // if(start==end)
    }

    //获取最大值
    public static int getMaxValueIndex(int[]array,int start,int end){
        int index=0;
        int max=0;

        for(int i=start;i<=end;i++){
            if(array[i]>max){
                max=array[i];
                index=i;
            }

            if(max==9){
                return index;
            }
        }

        return index;
    }
}

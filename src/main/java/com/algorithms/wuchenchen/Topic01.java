package com.algorithms.wuchenchen;

import java.util.Scanner;

/**
 * 给一个正整数，要求删掉其中的n个数字，要求得到一个最大值
 */
/*
测试数据
7
1 1 1 2 1 1 1
6
*/
public class Topic01 {
    /**
     * 删除第index位置的元素
     *
     * @param a 原数组
     * @param index 要删除的位置
     * @param end 结尾的位置
     */
    private static void deleteItem(int[] a, int index, int end){
        int temp = a[index], i;
        for(i = index; i < end-1; i++){
            a[i] = a[i+1];
        }
        a[i] = temp;
    }

    /**
     * 打印被删除后的结果
     *
     * @param a 原数组
     * @param n 要打印的元素个数
     */
    private static void printArr(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //正整数
        int n = in.nextInt();
        int[] a = new int[n];
        int q = n;
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        //删除的个数
        int m = in.nextInt();
        if (n == m){//当正整数的位数等于要删除的个数时，输出0
            System.out.println(0);
            return;
        }
        //记录已删除的个数
        System.out.print("原数组：");
        printArr(a, q);
        int count = 1;
        while(count <= m){
            System.out.printf("删除%d个数的结果：", count);
            int i;
            for(i = 0; i < q; i++){
                if(i==q-1 || a[i] < a[i+1]){
                    //假如前面的元素小于后面的，删除前面的元素
                    //或没有出现后面的元素大于前面的元素（说明该元素为最小值），就删除最后一个
                    deleteItem(a, i, q);
                    q--;
                    count++;
                    printArr(a, q);
                    break;
                }
            }
        }
    }

}

package com.algorithms.wuchenchen;

import java.util.Scanner;

/**
 * 给一个正整数，要求删掉其中的n个数字，要求得到一个最大值
 */
/*
测试数据
6
8 3 8 2 9 1
5
*/
public class Topic01 {
    /**
     * 删除第index元素
     * @param a
     * @param index
     * @param end
     */
    public static void deleteItem(int[] a, int index, int end){
        int temp = a[index], i;
        for(i = index; i < end-1; i++){
            a[i] = a[i+1];
        }
        a[i] = temp;
    }

    /**
     * 打印被删除后的结果
     * @param a
     * @param n
     */
    public static void printArr(int[] a, int n){
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
        }
        //记录已删除的个数
        System.out.print("原数组：");
        printArr(a, q);
        int count = 1;
        while(count <= m){
            System.out.printf("删除%d个数的结果：", count);
            for(int i = 0; i < n; i++){
                if(a[i] < a[i+1]){//假如前面的元素小于后面的，删除前面的元素
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

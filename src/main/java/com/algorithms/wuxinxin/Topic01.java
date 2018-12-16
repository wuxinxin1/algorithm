package com.algorithms.wuxinxin;

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
public class Topic01 {

    private static final int number = 2;

    public static void main(String[] args) {
        int[] numer = {8,3,8,2,9,1};

        binarySearch(numer, 0, numer.length - 1);

        System.out.println(numer);
    }

    public static void binarySearch(int[] array, int start, int end) {

        //分组剩下两个，直接删除
        if (end - start == 1) {
            //先删除小的，再删除大的
            removeMinValue(array, start, end);
            removeMaxValue(array, start, end);
            return;
        }

        //分组剩下一个，直接删除
        if (start == end) {
            //直接删除
            removeMinValue(array, start, start);
            return;
        }

        int maxValueIndex = getMaxValueIndex(array, start, end);

        if (maxValueIndex != start) {
            binarySearch(array, start, maxValueIndex - 1);
        }

        if (maxValueIndex != end) {
            binarySearch(array, maxValueIndex + 1, end);
        }

        removeMinValue(array, maxValueIndex, maxValueIndex);
    }

    public static void removeMinValue(int[] array, int index1, int index2) {
        if (index1 == index2) {
            System.out.println("删除:"+array[index1]);
            array[index1] = -1;
            return;
        }

        if (array[index1] > array[index2]) {
            System.out.println("删除:"+array[index2]);
            array[index2] = -1;
        } else {
            System.out.println("删除:"+array[index1]);
            array[index1] = -1;
        }
    }

    public static void removeMaxValue(int[] array, int index1, int index2) {
        if (index1 == index2) {
            System.out.println("删除:"+array[index1]);
            array[index1] = -1;
            return;
        }

        if (array[index1] > array[index2]) {
            System.out.println("删除:"+array[index1]);
            array[index1] = -1;
        } else {
            System.out.println("删除:"+array[index2]);
            array[index2] = -1;
        }
    }

    //获取最大值
    public static int getMaxValueIndex(int[] array, int start, int end) {
        int index = 0;
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
            if (max == 9) {
                return index;
            }
        }
        return index;
    }
}

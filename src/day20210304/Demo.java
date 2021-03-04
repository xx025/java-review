package day20210304;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        /*
         * 数组的定义
         *数组一旦创建完成,那么数组长度不可变
         * */
        int[] a1 = new int[10];
        int[] a2 = new int[]{1, 2, 3};
        int[] a3 = {1, 2, 3};
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }

        for (int k : a3
        ) {
            System.out.println(k);
        }

       /* 数组的默认值
        int 数组0
        boolean数组false
        浮点类型0.0
        char是空
        引用数组null*/
        char[] a4 = new char[10];
        System.out.println("===" + a4[0] + "============");
        /*数组取值:
         *   数组引用[下标]
         *   下标从0开始
         *
         *   异常:数组下标越界(java.lang.ArrayIndexOutOfBoundsException)
         * */
        int[] a5 = {1, 2};
//        System.out.println(a5[2]);
        /*
         * 数组的属性:a5.length
         * */
        /*
         * 数组的遍历
         * */
        for (int i = 0; i < a5.length; i++) {
            System.out.println(a5[i]);
        }
        /*
         * 数组的扩容(复制)
         * */
        int[] a6 = {1, 2, 3};
        int[] a7 = new int[a6.length * 2];
        for (int i = 0; i < a6.length; i++) {
            a7[i] = a6[i];
        }
        /*
         * 数组的最大值
         * */
        int[] i8 = {3, 5, 9};
        int max = i8[0];
        for (int k : i8
        ) {
            if (max < k) {
                max = k;
            }
        }
        System.out.println(max);
        /*
        冒泡排序
        * */
        int[] i9 = {1, 9, 6, 5};
        for (int i = 0; i < i9.length; i++) {
            for (int j = 0; j < i9.length - 1; j++) {
                if (i9[i] > i9[i + 1]) {
//                    int temp = i
                }
            }
        }
//        数组的复制
//        Arrays.copyOf(原数组,新数组的长度)
//        排序
//        Arrays.sort(数组)
//        数组转字符串
//        Arrays.toString()
    }
}

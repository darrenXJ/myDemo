package org.darren.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Darren
 * @create: 2019-10-24 10:20
 **/
public class MyDemo {

    class Generic1<E> {
        private E key;

        public Generic1(E key) {
            this.key = key;
        }

        public E getKey() {
            return this.key;
        }
    }

    class Generic2<T extends Number> {
        private T value;

        public Generic2(T val) {
            this.value = val;
        }

        public T getValue() {
            return this.value;
        }
    }

    static void showValue(){

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        for (String str : list) {
            if ("2".equals(str)) {
                list.remove(str);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(str-> System.out.println(str));
        list.forEach(s -> {
            System.out.println(s);
        });








//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(-1);
//        arrayList.add(3);
//        arrayList.add(3);
//        arrayList.add(-5);
//        arrayList.add(7);
//        arrayList.add(4);
//        arrayList.add(-9);
//        arrayList.add(-7);
//        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
//        arrayList2.add(-3);
//        arrayList2.add(-5);
//        arrayList2.add(7);
//        System.out.println("原始数组:");
//        System.out.println(arrayList);
//        // void reverse(List list)：反转
//        Collections.reverse(arrayList);
//        System.out.println("Collections.reverse(arrayList):");
//        System.out.println(arrayList);
//
//
//        Collections.rotate(arrayList, 4);
//        System.out.println("Collections.rotate(arrayList, 4):");
//        System.out.println(arrayList);
//
//        // void sort(List list),按自然排序的升序排序
//        Collections.sort(arrayList);
//        System.out.println("Collections.sort(arrayList):");
//        System.out.println(arrayList);
//
//        // void shuffle(List list),随机排序
//        Collections.shuffle(arrayList);
//        System.out.println("Collections.shuffle(arrayList):");
//        System.out.println(arrayList);
//
//        // void swap(List list, int i , int j),交换两个索引位置的元素
//        Collections.swap(arrayList, 2, 5);
//        System.out.println("Collections.swap(arrayList, 2, 5):");
//        System.out.println(arrayList);
//
//        // 定制排序的用法
//        Collections.sort(arrayList, new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println("定制排序后：");
//        System.out.println(arrayList);
//
//
//        System.out.println("Collections.max(arrayList):");
//        System.out.println(Collections.max(arrayList));
//
//        System.out.println("Collections.min(arrayList):");
//        System.out.println(Collections.min(arrayList));
//
//        System.out.println("Collections.replaceAll(arrayList, 3, -3):");
//        Collections.replaceAll(arrayList, 3, -3);
//        System.out.println(arrayList);
//
//        System.out.println("Collections.frequency(arrayList, -3):");
//        System.out.println(Collections.frequency(arrayList, -3));
//
//        System.out.println("Collections.indexOfSubList(arrayList, arrayList2):");
//        System.out.println(Collections.indexOfSubList(arrayList, arrayList2));
//
//        System.out.println("Collections.binarySearch(arrayList, 7):");
//        // 对List进行二分查找，返回索引，List必须是有序的
//        Collections.sort(arrayList);
//        System.out.println(Collections.binarySearch(arrayList, 7));

    }

}

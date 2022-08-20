package com.heima.base.DateBase;

public class MyArray {
    private int element;//表示有效数据的长度
    private long[] arr;

    public MyArray(){
        arr = new long[50];
    }
    public MyArray(int maxsize){
        arr = new long[maxsize];
    }

    //插入数据
    public void insert(long value){
        arr[element] = value;
        element++;
    }
    /*
    显示数据
     */
    public void display() {
        System.out.print("[");
        for (int i = 0; i < element; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }

    /*
    查找数据
     */
    public int search(long value){
        int i;
        for (i = 0; i < element; i++) {
            if(value == arr[i]){
                break;
            }
        }
        if( i == element){
            return -1;
        }else {
            return i;
        }
    }
    /*
    删除数据
     */
    public void delete(int index){
        if(index >= element || index <0){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            for (int i = index; i < element; i++) {
                arr[index] = arr[index+1];
            }
            element--;
        }
    }
}

package Lab_sheet_3;

//a.  a method to add item into array at last
//b.	a method to add item into array at position specified by user
//c.	a method to remove an item from last of array
//d.	a method to remove an item for the position specified by user
//e.	a method to remove an item specified by user, return false if the item is not found.
//f.	a method to return the size of an array.
//g.	a method to display all the items in array.
//h.	a method to return the item from index specified by user.
//i.	a method to return the index of item specified by user, return -1 if the item is not found.
//j.	a method to check if array is empty.
//k.	a method to check if array is full.
//l.	a method to replace occurrence of old item by new item, both specified by user.

import java.util.Arrays;

public class Q21_arrayFunctions {
  static void push (String[] arr,String item ){
    arr[arr.length-1]=item;
    System.out.println("\nArray.push:");
    for (String i: arr) {
      System.out.print(i+" ");
    }
  }
  static void pushAt (String[] arr, int index,String item ){
    arr[index]=item;
    System.out.println("\nArray.pushAt:");
    for (String i: arr) {
      System.out.print(i+" ");
    }
  }
  static void pop(String[] arr){
    arr[arr.length-1]="";
    System.out.println("\nArray.pop:\n");
    for (String i: arr) {
      System.out.print(i+" ");
    }
  }
  static void popAt(String[] arr,int index){
    arr[index]="";
    System.out.println("\nArray.popAt:\n");
    for (String i: arr) {
      System.out.print(i+" ");
    }
  }
  static boolean popItem(String[] arr,String item){
    boolean hasItem=false;
    for (int i = 0 ; i < arr.length; i++){
      if (arr[i].equalsIgnoreCase(item)){
        hasItem=true;
        arr[i]="";
      }
    }
    System.out.println("\nArray.popItem:");
    for (String i: arr) {
      System.out.print(i+" ");
    }
    return hasItem;
  }
  static int getSize(String[] arr){
    return arr.length;
  }
  static void printArray(String[] arr){
    System.out.println("The array is ");
    for (String i : arr) {
      System.out.print(i +" ");
    }
  }
  static String getItem(String[] arr, int index){
    return arr[index];
  }
  static int getIndex(String[] arr, String item){
    for (int i =0; i <arr.length;i++){
      if (arr[i].equalsIgnoreCase(item)) return i;
      }
    return -1;
  }
  static boolean isEmpty(String[] arr){
    return !isFull(arr);
  }
  static boolean isFull(String[] arr){
    for (String i :arr) {
      if (i.equals("")) return false;
    }
    return true;
  }
  static void replace(String[] arr,String oldItem,String newItem){
    System.out.println("\nreplace");
    for(int i =0; i< arr.length;i++ ){
      if (arr[i].equalsIgnoreCase(oldItem)){
        arr[i]=newItem;
      }
    }
  }

  public static void main(String[] args) {
    String [] arr = {"One","Two","Three","Four","Five"};
    pop(arr);
    popAt(arr,0);
    popItem(arr,"Two");
    pushAt(arr,0,"First");
    push(arr,"Last");
    System.out.println("\nSize of array - "+getSize(arr));
    System.out.println("Item at 2 index is "+ getItem(arr,2));
    System.out.println("The index of \"Three\" is "+ getIndex(arr,"Three"));
    System.out.println("\nIs empty? "+ isEmpty(arr));
    System.out.println("Is full? "+ isFull(arr));
    replace(arr,"Last","End");
    printArray(arr);
  }
}

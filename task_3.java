import java.util.Scanner;

public class task_3 {
   /**
    *  Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо написать программу, которая выведет в
    *  консоль все чётные числа.
    */

   public static String printArr(int[] arr) {
       StringBuilder result = new StringBuilder("[");
       for (int i = 0; i < arr.length; i++) {
            result.append(arr[i] + ", ");
       }
       if (result.length() > 1)
           return result.replace(result.length() - 2, result.length(), "]").toString();
       return "[]";
   }
   public static String printOdd(int[] arr) {
       StringBuilder result = new StringBuilder();
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] % 2 == 0) {
               result.append(arr[i] + ", ");
           }
       }
       if (result.length() > 0)
           return result.substring(0, result.length() - 2).toString();
       return "нет";
   }

    public static void main(String[] args){
       int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       System.out.println("В массиве " + printArr(a) + " четные числа: " + printOdd(a));
       }
}
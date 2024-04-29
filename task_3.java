import java.util.Scanner;

public class task_3 {
   /**
    *  ����� ������ ����� �����: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. ���������� �������� ���������, ������� ������� �
    *  ������� ��� ������ �����.
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
       return "���";
   }

    public static void main(String[] args){
       int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       System.out.println("� ������� " + printArr(a) + " ������ �����: " + printOdd(a));
       }
}
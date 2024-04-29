import java.util.Scanner;

public class task_1 {
   /**
    *  �������� ���������, ������� ��������� �� ���� ��� ����� ����� (a � b) � ��������� � ���� ��������� ��������:
    *  - ���������� ��� ��� ����� � ���������� ��������� ��������� ����� ������ � ������� ������ �� ���������: "a > b", "a < b" ��� "a = b";
    *  - ��������� � ����� ������� �������� ��������, ���������, ������� � ��������� � ��������� ������� � �������.
    *  ������ ����� ����������� ��� ������������ � ������� ������ � ������ ����� ������ ������ �������������� �����
    *  �������. ����������� ������������� �������������� ���������, �� ���������� ������ �������.
    */
    public static int getInt(String explainStr) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(explainStr);
            String str = scanner.nextLine();
            try {
                return Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("������� �� ����� �����. ���������� �����.");
            }
        }
    }

    public static String printCompare (int a, int b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        }
        return "a = b";
    }

    public static String printDivResult (int a, int b) {
        if (a % b == 0) {
            return Integer.toString(a / b);
        }
        return Float.toString((float) a / b);
    }

    public static void main(String[] args) {
        int a = getInt("������� ����� ����� a: ");
        int b = getInt("������� ����� ����� b: ");
        System.out.println("��������� ���������: " + printCompare(a, b));
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " / " + b + " = " + printDivResult(a, b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }
}
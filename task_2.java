import java.util.Scanner;

public class task_2 {
   /**
    *  �������� ���������, ������� ��������� �� ���� ��� ������ (a � b) � ���������� ��. � ���������� ��������� �
    *  ������� ������ ���� �������� ���� �� ���������: "������ �����������" ��� "������ ���������"
    *  ������ ����� ����������� ��� ������������ � ������� ������ � ������ ����� ������ ������ �������������� �����
    *  �������. ����������� ������������� �������������� ���������, �� ���������� ������ �������.
    */
    public static String getStr(String explainStr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(explainStr);
        String str = scanner.nextLine();
        return str;
    }

    public static void main(String[] args) {
        String a = getStr("������� ������ a: ");
        String b = getStr("������� ������ b: ");
        if (a.equals(b)) {
            System.out.println("������ ���������");
        } else {
            System.out.println("������ �����������");
        }
    }
}
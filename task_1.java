import java.util.Scanner;

/**
 *  Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
 *  - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
 *  - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
 *  Плюсом будет возможность для пользователя в решении первой и второй задач ввести данные самостоятельно через
 *  консоль. Допускается использование информационных сообщений, не искажающих смысла задания.
 */
public class task_1 {

    /**
     * Запрашивает целое число, выводя пригласительный текст
     * @param explainStr пригласительный текст в формате строки
     * @return целое число
     */
    public static int getInt(String explainStr) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(explainStr);
            String str = scanner.nextLine();
            try {
                return Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println("Введено не целое число. Попробуйте снова.");
            }
        }
    }

    /**
     * Выводит сравнение двух чисел в формате строки
     * @param a целое число 1
     * @param b целое число 2
     * @return результат сравнения в формате строки
     */
    public static String printCompare (int a, int b) {
        if (a > b) {
            return "a > b";
        } else if (a < b) {
            return "a < b";
        }
        return "a = b";
    }

    /**
     * Выводит результат деления двух числел в формате строки
     * @param a целое число 1
     * @param b целое число 2
     * @return результат деления в формате строки
     */
    public static String printDivResult (int a, int b) {
        if (b == 0) { return "Деление на 0 не возможно"; }
        if (a % b == 0) { return Integer.toString(a / b); }
        return Float.toString((float) a / b);
    }

    public static void main(String[] args) {
        int a = getInt("Введите целое число a: ");
        int b = getInt("Введите целое число b: ");
        System.out.println("Результат сравнения: " + printCompare(a, b));
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " / " + b + " = " + printDivResult(a, b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }
}
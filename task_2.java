import java.util.Scanner;

/**
 *  Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в
 *  консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
 *  Плюсом будет возможность для пользователя в решении первой и второй задач ввести данные самостоятельно через
 *  консоль. Допускается использование информационных сообщений, не искажающих смысла задания.
 */
public class task_2 {

    /**
     * Запрашивает строку выводя пригласительный текст
     * @param explainStr пригласительный текст в формате строки
     * @return вводимая строка
     */
    public static String getStr(String explainStr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(explainStr);
        String str = scanner.nextLine();
        return str;
    }

    public static void main(String[] args) {
        String a = getStr("Введите строку a: ");
        String b = getStr("Введите строку b: ");
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
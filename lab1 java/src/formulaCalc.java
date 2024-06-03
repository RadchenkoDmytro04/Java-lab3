import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class formulaCalc {

    double x = -1.25;
    double a = 0.5;
    double b = -0.3;

    static double function1(double a, double b, double x) { //
        //return Math.sqrt(Math.abs(0.5 * (1/ Math.tan(-1.25))+ (-0.3) * Math.tan(-1.25))) + Math.pow(-1.25 + 0.5, 2);
        return Math.sqrt(Math.abs(a * 1/Math.tan(x) + b * Math.tan(x))) + Math.pow(x + a, 2);
    }

    static double function2(double a, double b, double x) {
        //return 0.5 * Math.pow(Math.log(Math.abs(0.5 * Math.sin(-1.25) + (-0.3) * Math.cos(-1.25))),2);
        return a * Math.pow(Math.log(Math.abs(a * Math.sin(x) + b * Math.cos(x))), 2);
    }

    void enterData() { //вводимо значення для a, b, x
        System.out.println("enter data");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a: ");
        a = scanner.nextDouble();
        System.out.println("enter b: ");
        b = scanner.nextDouble();
        System.out.println("enter x: ");
        x = scanner.nextDouble();
    }

    void printData() { // втводимо задані значення a, b, x
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);

    }

    void printRes() { // виводимо результати функцій
        System.out.println("f1 = " + function1(a, b, x));
        System.out.println("f2 = " + function2(a, b, x));

    }

    void controlMenu() { // обирємо пункт меню
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            System.out.println("Оберіть пункт меню: ");
            int k = scanner.nextInt();
            switch (k) {
                case 1:
                    enterData();
                    break;
                case 2:
                    printData();
                    break;
                case 3:
                    printRes();
                    break;
                case 4:
                    printDate();
                    break; //to do
                case 5:
                    return;

            }
        }
    }

    void Menu() { // виводимо пункти меню
        System.out.println("1.Введення значень вхідних даних");
        System.out.println("2.Вивід значення вхідних даних");
        System.out.println("3.Виведення значень обчислених функцій");
        System.out.println("4.Вивід дати і часу");
        System.out.println("5.Вихід");
    }

    void printDate() { //виводимо дату у форматі дд-мм-рр
        String pattern = "dd-MM-yy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }


}

package edu.qa.automation;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num = scanner.nextInt();

        System.out.print("Введите 2 число: ");
        int num2 = scanner.nextInt();

        int temp;

        System.out.print("Используйсте один из методов: Прибавить(+),Отнять(-);Умножить(*);Делить(/): ");
        String count = scanner.nextLine();
        count = scanner.nextLine();

        switch (count) {
            case "+":
                temp = num + num2;
                System.out.println("Результат: " + temp);
                break;
            case "-":
                temp = num - num2;
                System.out.println("Результат: " + temp);
                break;
            case "*":
                temp = num * num2;
                System.out.println("Результат: " + temp);
                break;
            case "/":
                if(num2 == 0){
                    System.out.println("Вы что не учились в школе? Нельзя делить на ноль! ");
                } else {
                    temp = num / num2;
                    System.out.println("Результат: " + temp);
                }
                break;
            default:
                System.out.println("Неккоректный ввод данных, попробуйте еще раз.. ");

        }



    }

}

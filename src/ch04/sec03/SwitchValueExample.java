package ch04.sec03;

import java.util.Scanner;
public class SwitchValueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade;
        int result;
        grade = sc.nextLine();

        int score2 = switch(grade) {
            case "A" -> 100;
            case "BC" -> {
                result = 10;
                yield result;
            }
            default -> 60;
        };
        System.out.println(score2);
    }
}

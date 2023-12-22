package challenges.loopsandflowcontrol;

import java.util.Scanner;

public class SwitchStatementDayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week: ");
        String day = scanner.next().toLowerCase();

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day.substring(0, 1).toUpperCase() + day.substring(1) + ", it is weekday.");
                break;
            case "saturday":
            case "sunday":
                System.out.println(day.substring(0,1).toUpperCase() + day.substring(1) +  ", it is weekend day.");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid day of the week.");
        }

        scanner.close();
    }
}
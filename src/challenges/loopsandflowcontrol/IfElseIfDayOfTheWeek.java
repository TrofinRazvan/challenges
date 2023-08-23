package challenges.loopsandflowcontrol;

import java.util.Scanner;

public class IfElseIfDayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week: ");
        String day = scanner.nextLine().toLowerCase();

        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            System.out.println(day.substring(0,1).toUpperCase() + day.substring(1) + ", it is weekday.");
        } else if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println(day.substring(0,1).toUpperCase() + day.substring(1) + ", it is a weekend day.");
        } else {
            System.out.println("Invalid input. Please enter a valid day of the week.");
        }

        scanner.close();
    }
}
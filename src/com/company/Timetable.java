package com.company;

import java.util.Scanner;

public class Timetable {

    public static int getDayNumber(String day) {

        int dayNumber = 0;

        if (day == null) {
            return dayNumber;
        }
        switch (day.toLowerCase()) {
            case "monday":
                dayNumber = 1;
            { System.out.println ("That's:"+day);}
            break;
            case "tuesday":
                dayNumber = 2;
                break;
            case "wednesday":
                dayNumber = 3;
                break;
            case "thursday":
                dayNumber = 4;
                break;
            case "friday":
                dayNumber = 5;
                break;
            case "Saturday":
                dayNumber = 6;
                break;
            case "Sunday":
                dayNumber = 7;
                break;
            default:
                dayNumber = 0;
                break;
        }
        return dayNumber;

    }

    public static void main(String[] args) {
        System.out.println("Choose the day:");
        int dayNumber = new Scanner(System.in).nextInt();
        switch (dayNumber) {
            case 1:
            {
                System.out.println("Working on project" );
                break;
            }
            case 2:
            {
                System.out.println("Meeting");
                break;
            }
            case 3: {
                System.out.println("Presentation");
                break;
            }
            case 4: {
                System.out.println("Training");
                break;
            }
            case 5: {
                System.out.println("Briefing");
                break;}
            case 6: {
                System.out.println("It's day off, dude");
                break;}
            case 7: {
                System.out.println("Get ready for the new week");
                break;}
            default: {
                System.out.println ("Wrong value");
                break;
            }
        }
    }
}
package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;



public class Main {

    private static double pi = 3.14159;

    public static void main(String[] args) {
	// write your code here

        double result = 0;
        boolean validRequest = true;
        DecimalFormat formatNum = new DecimalFormat("#.##");

        Scanner in = new Scanner(System.in);

        System.out.println("Please input a unit and conversion types:");

        String input = in.next();

        double value = Double.parseDouble(input.substring(0, input.length() - 2));
        String conversionType = input.substring(input.length() -2, input.length());

        switch(conversionType) {

            case "dr":
                result = value * (pi / 180);
                break;

            case "rd":
                result = value * (180/pi);
                break;

            case "cf":
                result = value * 9/5 + 32;
                break;

            case "fc":
                result = (value - 32) * 5/9;
                break;

            case "ck":
                result = value + 273.15;
                break;

            case "fk":
                result = (value + 459.67) * 5/9;
                break;

            case "kc":
                result = value - 273.15;
                break;

            case "kf":
                result = value * 9/5 - 459.67;
                break;

            default:
                System.out.println("No candidate for conversion.");
                validRequest = false;
                break;
        }
        if(validRequest) {
            System.out.println(formatNum.format(result) + input.substring(input.length() - 1));
        }
    }
}

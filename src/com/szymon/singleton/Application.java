package com.szymon.singleton;

import java.util.Scanner;

/**
 * Created by RENT on 2017-06-02.
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String value = scanner.nextLine();
            if(value.equals("")) {
                Consumer.processValue();
            } else {
                Producer.addValue(value);
            }
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;
        String output;
        Map game = new Map();

        game.intro();
        do {
            System.out.println("> ");
            input = s.next();
            output = game.RunCommand(input);
            System.out.println(output);
        } while(!"exit".equalsIgnoreCase(input));

    }
}

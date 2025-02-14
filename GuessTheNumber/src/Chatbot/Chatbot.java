package Chatbot;

import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a message");
        String message=sc.nextLine();
        switch (message){
            case "Hi";
            System.out.println("Hello Sir.How are you?");
            break;

        }
    }
}

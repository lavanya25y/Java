package Runner;

import account.InstagramAccount;

public class InstaAccountRunner {
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println("example for the compile time polymorphism");
        InstagramAccount instagramAccount = new InstagramAccount();
        instagramAccount.login("lavannya08","2266");
        instagramAccount.login(998928271,"account@");
    }
}

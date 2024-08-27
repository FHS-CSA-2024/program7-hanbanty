//import stuff here

//Your code here
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Make you own test code here
        double myTestVal;
        Main tester = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert Schrute-Bucks:");
        int schruteBucks = scanner.nextInt();
        System.out.println("Insert Klevins:");
        int klevins = scanner.nextInt();
        System.out.println("Insert Stanley-Nickels:");
        int stanleyNickels = scanner.nextInt();

        myTestVal = tester.convertMoney(schruteBucks,stanleyNickels,klevins);

        System.out.println("Decimal schrute-bucks: $"+myTestVal);
    }



    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        double total = schruteBucks + (double) klevins /20 + (double) stanleyNickels /240;
        total = (double) Math.round(total * 100) /100;

        return total;
    }
}
//Paste console output below:
/*
Insert Schrute-Bucks:
7
Insert Klevins:
17
Insert Stanley-Nickels:
9
Decimal schrute-bucks: $7.89

*/

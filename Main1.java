package Eceptions_Sem2_Hometasks;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(getFloat());
    }
    public static float getFloat (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        while (!scanner.hasNextFloat()){
            System.out.println("Wrong format entry. Enter a float number: ");
            Object num = scanner.next();
        }
        return Float.valueOf(scanner.next());
    }

}

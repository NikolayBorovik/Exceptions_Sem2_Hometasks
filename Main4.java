package Eceptions_Sem2_Hometasks;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println(getString());
    }

    public static String getString (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String result = scanner.nextLine();
        if (result == ""){
            throw new RuntimeException("Entry may not be empty.");
        }
        return result;
    }
}

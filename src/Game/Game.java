package Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        System.out.println("Money = " + inventory.money);

        Scanner input = new Scanner(System.in);
        System.out.println("How many fields do you want to buy?");
        String userInput = input.nextLine();

        //for()
        //TODO: Ask gamer - how many fields do you want to buy?
        //TODO: use Scanner

        //TODO: buy fields in 'for' loop

        inventory.buySimpleField();
        System.out.println("Field bought!");
        inventory.buySimpleField();
        inventory.buySimpleField();
        inventory.buyStrawberryField();

        System.out.println("Money = " + inventory.money);

        inventory.nextTurn();
        System.out.println("Money = " + inventory.money);
        //TODO 7: Loop the entire reading user input until player gets to 10,000 money
    }

}


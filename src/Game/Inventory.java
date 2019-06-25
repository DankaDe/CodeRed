package Game;

import java.util.ArrayList;
public class Inventory {

    int money;

    ArrayList<Field> fields = new ArrayList<>();

    public Inventory() {
        money = 1000;
    }

    public void buySimpleField() {
        System.out.println("Buying field!");

        //TODO 5: Make sure player still has money to buy the field

        Field field = new Field();
        fields.add(field);
        money = money - field.cost;
    }

    public void buyStrawberryField() {
        System.out.println("Buying Strawberry Field");
        StrawberryField strawberryField = new StrawberryField();
        fields.add(strawberryField);
        money = money - strawberryField.cost;
    }
        //TODO 2: Complete this method - done

    public void nextTurn() {
        System.out.println("Next turn!");
        for(Field f : fields) {
            money = money + f.calculateProfit();
        }
        //TODO 1: Print out how much money the user has
        System.out.println("You have these fields:");
        for(int i=0; i<fields.size();i++){
            System.out.println("fields.get(i)");
        }
    }
}

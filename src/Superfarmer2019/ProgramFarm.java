package Superfarmer2019;

import java.util.Random;

import static Superfarmer2019.FarmingField.*;

public class ProgramFarm {
    public static void printUserMenu(){
        System.out.println("Welcome to my game* \n" +
                "Options:\n" +
                "1 – Buy standard field\n" +
                "\n" +
                "2 – Buy Strawberry Field\n" +
                "\n" +
                "3 – Buy Enhanced Field\n" +
                "\n" +
                "4 – Show inventory\n" +
                "\n" +
                "5 – Next turn\n" +
                "\n" +
                "6 – Exit Game (I give up)");
    }

    public static void main (String[] args) {
        FarmingField field1 = new FarmingField();
        field1.calculateProfit();
        StrawberryField field2 = new StrawberryField();
        field2.calculateProfit();
        EnhancedField field3 = new EnhancedField();
        field3.calculateProfit();

        FarmingField[] farms = {field1, field2, field3};
        for (FarmingField a : farms) {
            a.calculateProfit();
        }
    }

}

package Game;

import java.util.Random;

public class StrawberryField extends Field {

    int snailsRisk = 20; //20% that snails will eat entire crop

    @Override
    public int calculateProfit() {
        Random r = new Random();
        int totallyRandomNumber = r.nextInt(100);

        if(totallyRandomNumber < snailsRisk) {
            System.out.println("oh noes, snails have attacked my field");//oh noes, snails have attacked
            return 0;
        }
        System.out.println("no snails - returning base profit * 2 as strawberries are more expensive to standard crop!");
        //no snails - returning base profit * 2 as strawberries are more expensive to standard crop!
        return baseProfit  * 2;
    }

    //public void add(Game.StrawberryField strawberryField) {
    }


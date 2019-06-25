package Superfarmer2019;

import java.util.Random;

public class StrawberryField extends FarmingField {

        int calculateProfit() {

            Random random = new Random();
            int snailsRisk = random.nextInt(100);

            if (snailsRisk == 100) {
                int profit = 0;
            }

            System.out.println(baseProfitAfterHarvest*2);
            return baseProfitAfterHarvest*2;

        }

}

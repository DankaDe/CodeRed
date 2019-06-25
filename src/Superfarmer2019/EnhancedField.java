package Superfarmer2019;

import java.util.Random;

public class EnhancedField extends FarmingField {

    int calculateProfit() {

        Random random = new Random();
        int droughtRisk = random.nextInt(100);
        int enhancementMultiplier=random.nextInt(50);

        if (droughtRisk == 100) {
            int profit = 0;
        }

        System.out.println(baseProfitAfterHarvest*enhancementMultiplier);
        return baseProfitAfterHarvest*enhancementMultiplier;

    }
}

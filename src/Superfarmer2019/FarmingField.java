package Superfarmer2019;

import java.util.Random;

public class FarmingField {
  int sowingCost;
  int baseProfitAfterHarvest=80;
  int droughtRisk;
       // void baseProfitAfterHarvest() {
        int calculateProfit() {

            Random random = new Random();
            int droughtRisk = random.nextInt(100);

                if (droughtRisk == 100) {
                    int profit = 0;
                }

            System.out.println(baseProfitAfterHarvest);
            return baseProfitAfterHarvest;

        }

        }




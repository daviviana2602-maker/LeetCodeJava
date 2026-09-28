package org.example;

public class bestTimeBuyAndSell {

    public static void main(String[] args) {

        // one day = one result
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);
        System.out.println(result);


    }

    private static int maxProfit(int[] prices) {

        int numberIndex = 0;

        int numberBought = 1000;
        int numberBoughtIndex = 0;

        int numberSold = 0;
        int numberSoldIndex;


        for (int number : prices) {

            numberIndex++;

            if (number < numberBought) {
                numberBought = number;
                numberBoughtIndex = numberIndex;
            }

        }


        for (int number : prices) {

            numberIndex++;

            if (number > numberSold) {

                numberSoldIndex = numberIndex;

                if (numberSoldIndex > numberBoughtIndex) {
                    numberSold = number;
                }

            }

        }

        return numberSold - numberBought;

    }

}
package com.lukgru.jalgoarena.medium;

/**
 * You've recently acquired market prediction superpowers that let you predict the closing stock price of a Acme Inc.'s stock a month into the future!
 * To get the most out of this superpower, you need to write a method called maxProfit that takes in an array of
 * integers representing the close out stock price on a given day. This method should return the maximum profit you can make out of trading Acme Inc.'s stock.
 * There are a few limitations however :
 You must sell your current holding before buying another - i.e. You may not buy and then buy again. It needs to be a buy - sell - buy - sell ... pattern.
 You may complete as many transactions as you like. You're using an awesome service like Robinhood, and so there are no transaction costs!
 If you're enormously unlucky (or karma takes over) and no profit can be made, return 0.
 Examples
 [50,100,20,80,20]
 ->
 110
 
 
 [50,100,]

[]

[1,2,3,4,3,2,4,5,1,2,3,4,5,]

[50,100,50,100,50,]

[100,40,20,10,]

[1,1,]

[1,]

[0,100,0,100,0,100,]

[150,100,]

[50,100,20,80,20,]

123

[0,50,10,100,30,]
 */
public class StockMarketOracle {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int atBuy = prices[0];
        int atSell = 0;
        boolean ableToBuy = true;
//        for (int i=0 ; i< prices.length ; i++) {
//            int price = prices[i];
//            if ()
//            if (atBuy )
//        }

        return profit;
    }

}

package org.example;

/*
 * 121. Best Time to Buy and Sell Stock
 * Easy
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 *
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 * Constraints:
 *
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 */

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices;
        prices = new int[]{7, 1, 5, 3, 6, 4};
//        prices = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int minBuy = prices[0];
        int profit = 0;         // Initialize the maximum profit
        for (int i = 1; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i]);   // Get the minimum price to buy...

            // (prices[i] - minBuy), и, если она больше, чем текущая максимальная прибыль, profit обновляется.
            profit = Math.max(profit, prices[i] - minBuy);
        }
        return profit;
    }

    public static int maxProfit2(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int minBuy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
        }
        return maxProfit;
    }

    /*
     * Данная задача решается с использованием жадного подхода (greedy approach)
     * и состоит в поиске наибольшей прибыли при покупке акций и продаже их в будущем.
     *
     * 1. В начале функции `maxProfit` проверяется базовый случай: если массив `prices` пустой
     * или содержит только один элемент (что означает, что невозможно провести транзакцию),
     * функция возвращает 0.
     *
     * 2. Создается переменная `minBuy`, которая инициализируется значением цены акции
     * на первый день (`prices[0]`). Это значение представляет собой наименьшую цену для покупки акции.
     *
     * 3. Создается переменная `profit`, которая инициализируется нулем.
     * Эта переменная будет хранить максимальную прибыль, которую можно получить.
     *
     * 4. Затем цикл начинается с индекса 1 и проходит по всем дням, начиная с второго дня.
     *
     * 5. На каждом шаге цикла:
     *    - `minBuy` обновляется, как минимум между текущей `minBuy` и ценой акции в текущий день (`prices[i]`).
     * Это гарантирует, что `minBuy` всегда содержит наименьшую цену для покупки акции на предыдущих днях.
     *    - Разница между текущей ценой акции и `minBuy` сравнивается с текущей максимальной прибылью
     * (`prices[i] - minBuy`), и, если она больше, чем текущая максимальная прибыль, `profit` обновляется.
     *
     * 6. После завершения цикла возвращается значение `profit`,
     * которое представляет собой максимальную прибыль, которую можно получить,
     * выбирая оптимальный момент для покупки и продажи акции.
     *
     * Таким образом, алгоритм проходит по всем дням, сохраняя наименьшую цену для покупки
     * и обновляя максимальную прибыль при возможности. Результатом является максимальная прибыль,
     * которую можно получить при соблюдении условий задачи.
     */
}

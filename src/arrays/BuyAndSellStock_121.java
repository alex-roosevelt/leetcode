void main() {

  System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
}

/**
 * Самый неоптимальный вариант для большого массива чисел Time : O(n) Space: O(1)
 *
 * @param prices
 * @return
 */

private static int maxProfit(int[] prices) {
  int maxProfit = 0;
  int buy = prices[0];
  for (int i = 1; i < prices.length; i++) {
    if (prices[i] < buy) {
      buy = prices[i];
    } else {
      if (prices[i] - buy > maxProfit) {
        maxProfit = prices[i] - buy;
      }
    }
  }
  return maxProfit;
}

/**
 * Самый неоптимальный вариант для большого массива чисел Time : O(n*m) Space: O(1)
 *
 * @param prices
 * @return
 */
// private static int maxProfit(int[] prices) {
//   int maxProfit = 0;
//   for (int i = 0; i < prices.length; i++) {
//     for (int j = i + 1; j < prices.length; j++) {
//       maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
//     }
//   }
//   return maxProfit;
// }
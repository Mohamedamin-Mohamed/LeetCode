class Solution {
//Use of DFS but slow
    public int maxProfit(int[] prices) {
        Stack<Integer> stack = new Stack();
        int maxProfit = Integer.MIN_VALUE;
        int profit = 0;
        for(int price : prices){
            if(stack.isEmpty() || price < stack.peek())
            stack.add(price);
            profit = price - stack.peek();
            if(profit > maxProfit) 
            maxProfit = profit;
        }
        return maxProfit;
    }
//Use of Greedy algorithm.
public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < minPrice)
            minPrice = price;
            if(price - minPrice > maxProfit)
            maxProfit = price - minPrice;
        }
        return maxProfit;
    }
}

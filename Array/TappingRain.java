import java.util.*;

public class TappingRain {// time complexity is O(num)
    public static int TappingWater(int num[]) {
        int leftMax[] = new int[num.length];
        int rightMax[] = new int[num.length];
        // calculate the left max value
        leftMax[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            leftMax[i] = Math.max(num[i], leftMax[i - 1]);
        }
        // calculate the right max value
        rightMax[num.length - 1] = num[num.length - 1];
        for (int i = num.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(num[i], rightMax[i + 1]);
        }
        int totalTappedWater = 0;
        for (int i = 0; i < num.length; i++) {
            // every element water level
            int tapping = Math.min(leftMax[i], rightMax[i]);
            // total amout of water level
            totalTappedWater += tapping - num[i];
        }

        return totalTappedWater;
    }

    public static int Stocktrade(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfite = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profite = price[i] - buyPrice;
                maxProfite = Math.max(maxProfite, profite);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfite;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 4, 2, 0, 6, 3, 2, 5 };
        int price[] = { 7, 1, 5, 3, 6, 4 };
        int calculate = TappingWater(num);
        System.out.println("total tapping water = " + calculate);

        int trade = Stocktrade(price);
        System.out.println(trade);
    }
}

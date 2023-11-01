package lld2.strategy.rainwater;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Time Complexity : ");
        String sTC = sc.nextLine();
        System.out.println("Enter Space Complexity : ");
        String sSC = sc.nextLine();

        List<Integer> heights = new ArrayList<>();

        RainWaterTrappingProblem problem = new RainWaterTrappingProblem();
        int ans = problem.solve(heights, sTC, sSC);
        System.out.println("Max water trapped : " + ans);
    }
}

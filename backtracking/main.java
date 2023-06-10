package backtracking;

import java.util.List;

public class main {
    public static void main(String[] args) {
        combinationSum sum = new combinationSum();

        int[] arr = {2,3,6,7};
        int target = 7;
        System.out.println(sum.combSum(arr, target));
    }

}

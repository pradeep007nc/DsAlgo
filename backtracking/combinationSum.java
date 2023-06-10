package backtracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {

    public List<List<Integer>> combSum(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tempList = null;
        helper(candidates, target, tempList, ans);
        return ans;
    }

    private void helper(int[] candidates, int target, List<Integer> tempList, List<List<Integer>> ans) {
        
    }

}

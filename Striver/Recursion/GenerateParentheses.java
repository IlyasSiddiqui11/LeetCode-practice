package Striver.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        return ans;
    }

    private static void generate(int n, int open, int close, String str, List<String> ans){
        if (open == n && close == n) {
            ans.add(str);
            return;
        }
        if (open < n) {
            generate(n, open + 1, close, str + "(", ans);
        }
        if (close < open) {
            generate(n, open, close + 1, str + ")", ans);
        }
    }
}

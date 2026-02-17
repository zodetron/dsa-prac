package Phase1_Day3;
//Stack Q4
// LeetCode 739

import java.util.Stack;
import java.util.Arrays;

public class day3c {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int preDay = stack.pop();
                res[preDay] = i - preDay;
            }
            stack.push(i);
        }
        return res;
    }




    public static void main(String[] args) {
        day3c sol = new day3c();
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] ans = sol.dailyTemperatures(temps);
        System.out.println(Arrays.toString(ans));
    }
}

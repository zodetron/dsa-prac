package Phase2_Day2;

public class Day2d {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Day2d solution = new Day2d();
        char[] s = {'h', 'e','l','l','l','l','o'};
        solution.reverseString(s);
        System.out.println(s);
    }
}

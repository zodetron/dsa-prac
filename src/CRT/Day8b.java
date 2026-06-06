package CRT;
// program to remove all # and print them first
// input = a#B#C#
// output = ###aBC
public class Day8b {
    public static void main(String[] args) {

        String s = "thi#hih#hih#isatest##";
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                count++;
            } else {
                result.append(c);
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print("#");
        }
        System.out.println(result);
    }
}
package hackerrank;

public class CountDistinctCharactersInString {

    //Input:"aaaabbbccd"
    //Output: "a4b3c2d1"
    static String countDistinctChars(String input) {

        StringBuilder sb = new StringBuilder();

        sb.append(input.charAt(0));

        char curr = input.charAt(0);
        int count = 0;

        for (char ch: input.toCharArray()) {  // O(n)
            if (ch == curr) {
                count++;
            } else {
                sb.append(count);
                sb.append(ch);
                curr = ch;
                count = 1;
            }

        }

        sb.append(count);

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(countDistinctChars("aaaabbbccd"));
    }
}

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        strings = new String[6];

        for (int j = 0; j < strings.length; j++) {
            strings[j] = console.nextLine();
        }

        for (int k = 0; k < strings.length; k++) {
            String s = strings[k];
            for (int m = 0; m < strings.length; m++) {
                if (s != null && s.equals(strings[m]) && k != m) {
                    strings[k] = null;
                    strings[m] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

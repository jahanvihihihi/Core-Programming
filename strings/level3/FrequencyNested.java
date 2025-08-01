import java.util.*;

public class FrequencyNested {
    static String[] findFreq(String s) {
        char[] ch = s.toCharArray();
        int[] freq = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }
        String[] res = new String[ch.length];
        int k = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') res[k++] = ch[i] + " : " + freq[i];
        }
        return Arrays.copyOf(res, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] out = findFreq(s);
        for (String x : out) System.out.println(x);
    }
}

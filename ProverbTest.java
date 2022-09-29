import java.util.Arrays;
import java.util.StringTokenizer;

public class ProverbTest {
    public static void main(String[] args) {
        String proverb = new String("Empty vessels make the most sound.");
        int count = 0;

        System.out.println("입력: " + proverb);
        StringTokenizer st = new StringTokenizer(proverb);

        String[] words = new String[st.countTokens()];
        while (st.hasMoreTokens())
            words[count++] = st.nextToken();
        System.out.println("단어 개수 : " + count);

        Arrays.sort(words);
        System.out.print("정렬된 토큰 :");
        for (String word : words)
            System.out.print(word + ", ");
    }
}
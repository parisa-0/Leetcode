import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {
    public static void main(String[] args) {
        String content = "ABCDEFG";
        int k = 3;
        List<String> chunks = new ArrayList<>();
        for (int i = 0; i < content.length(); i += k) {
            int end = Math.min(i + k + 1, content.length());
            chunks.add(content.substring(i, end));
        }
        System.out.println(chunks);
    }
}


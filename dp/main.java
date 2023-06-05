package dp;

import java.util.*;

public class main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String str[] = {"purpl", "uple", "eeee", "ple", "purp", "pur", "le", "e"};
        List<String> list = Arrays.asList(str);
        canConstructString string = new canConstructString();
        System.out.println(string.canConstruct3(list, "purple"));

        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");
    }
}

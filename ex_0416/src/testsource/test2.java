package testsource;

import java.util.function.Function;

public class test2 {
    public static void main(String[] args) {
    	Function<String, String> toUpperCase = s -> s.toUpperCase();
        String original = "hello";
        String upper = toUpperCase.apply(original);
        System.out.println(upper);
    }
}
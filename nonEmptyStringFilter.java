package myTaskJavaPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class nonEmptyStringFilter {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jik");

        List<String> nonEmptyString = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

        System.out.println("Non-Empty String: " + nonEmptyString);

    }
}

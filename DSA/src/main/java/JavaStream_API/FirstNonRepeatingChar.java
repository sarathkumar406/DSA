package JavaStream_API;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String str = "ssddfgfg";

//        String res = Arrays.stream(str.split("")).filter(c->str.indexOf(c) == str.lastIndexOf(c))
//                .findFirst().get();
//        System.out.println(res);

        Map<Character, Long> charMap = str.chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));

        char ans = charMap.entrySet()
                .stream()
                .filter(c->c.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().orElse('-');

        System.out.println(ans);

    }
}

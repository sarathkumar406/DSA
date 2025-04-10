package JavaStream_API;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedChar {

    public static void main(String[] args) {

        String str = "Hello World";

        Map<Character,Long> charMap = str.chars()
                .mapToObj(m->(char)m)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

       char res = charMap.entrySet()
               .stream()
               .filter(m->m.getValue() > 1)
               .map(Map.Entry::getKey)
               .findFirst()
               .orElse('-');
        System.out.println(res);
    }
}

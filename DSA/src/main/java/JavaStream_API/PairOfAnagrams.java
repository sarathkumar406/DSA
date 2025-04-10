package JavaStream_API;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PairOfAnagrams {

    public static void main(String[] args) {

        String[] str = {"pat","tap","pan","nap","Team","tree","meat"};


        List<String> list = Arrays.asList(str);

       Collection<List<String>>  res = list.stream()
               .collect(Collectors.groupingBy(x->Arrays.stream(x.toLowerCase().split(""))
                       .sorted()
                .collect(Collectors.toList()))).values();

        System.out.println(res);
    }

}

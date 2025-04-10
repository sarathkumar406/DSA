package JavaStream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractIntegerList {
    public static void main(String[] args) {

        String[] str = {"abc","123","xyz","456"};

        List<Integer> res = Arrays.stream(str)
                .filter(x->x.matches("[0-9]+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(res);
    }
}

package JavaStream_API;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MoveAllZerosFirst {

    public static void main(String[] args) {

        int[] arr = {5,0,8,0,1,0};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

       List<Integer> res = list.stream()
               .collect(Collectors.partitioningBy(x->x!=0))
               .values()
               .stream()
               .flatMap(Collection::stream)
               .collect(Collectors.toList());

        System.out.println(res);

    }
}

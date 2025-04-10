package JavaStream_API;

import java.util.Arrays;
import java.util.Collections;

public class ArrangeNumAsceDesc {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::print);
    }
}

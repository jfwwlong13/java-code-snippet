package guava;

import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;

/**
 * https://github.com/google/guava/wiki/PrimitivesExplained
 */
public class PrimitivesExplained {

    public static void main(final String[] args) {
        Integer sdf = Ints.tryParse("sdf");
        sdf = Ints.tryParse("-123");
        Double sdf1 = Doubles.tryParse("sdf");
        System.out.println(sdf1);
    }
}

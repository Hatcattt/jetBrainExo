package dev.hatcattt.jtbrn.exos;

import java.util.function.Function;
import java.util.function.UnaryOperator;

class PrefixSuffixOperator {
    String name = "coucou";

    public PrefixSuffixOperator(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = s -> PREFIX + s.trim() + SUFFIX;

    public static void main(String[] args) {
        String lambdaString = PrefixSuffixOperator.operator.apply("Un test de string ");
        System.out.println(lambdaString);

        // -------

        Function<String, PrefixSuffixOperator> prefixSuffixOperator = PrefixSuffixOperator::new;
        PrefixSuffixOperator prefixSuffixOperator1 = prefixSuffixOperator.apply("HELLO");
        System.out.println(prefixSuffixOperator1.getName());

    }
}

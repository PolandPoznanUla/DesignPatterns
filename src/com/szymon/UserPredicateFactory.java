package com.szymon;

import java.util.function.Predicate;

public class UserPredicateFactory {

//    lambda = anonimowa implementacja interfejsu z jedna metoda

    public static Predicate<String> nameStartsWith(String prefix) {

        return new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith(prefix);
            }
        };
//        return (e) -> e.startsWith(prefix);
    }
}

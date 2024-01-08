package org.FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class RecreatingForEach implements Consumer<Integer>{

    @Override
    public void accept(Integer o) {
        System.out.println(o);
    }

}

class EvenNuberPredicate implements Predicate<Integer>{

    @Override
    public boolean test(Integer number) {
        return number%2 == 0;
    }
}

public class LambdaBehindTheScreens {

    public static void main(String[] args) {

        List.of(13,25,14,19, 20, 78).stream()
                .filter(new EvenNuberPredicate())
                .forEach(new RecreatingForEach());

    }
}

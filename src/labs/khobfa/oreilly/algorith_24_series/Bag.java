package labs.khobfa.oreilly.algorith_24_series;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Iterable<T> {

    List<Integer> data = new ArrayList<>();

    @SuppressWarnings("unchecked")
    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) data.iterator();
    }

    @SuppressWarnings("unchecked")
    @Override
    public void forEach(Consumer<? super T> action) {
        data.forEach((Consumer<? super Integer>) action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return (Spliterator<T>) data.spliterator();
    }

    public void add(int vertex) {
        data.add(vertex);
    }
}

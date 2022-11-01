public class Randoms implements Iterable<Integer> {

    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator iterator() {
        return new Iterator(min);
    }

    class Iterator implements java.util.Iterator<Integer> {

        int current;

        public Iterator(int current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current <= max;
        }

        @Override
        public Integer next() {
            return (int) (Math.random() * ((max - min) + 1)) + min;
        }
    }

}
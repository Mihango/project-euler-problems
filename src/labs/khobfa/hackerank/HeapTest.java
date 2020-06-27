package labs.khobfa.hackerank;

import java.util.*;

public class HeapTest {

    static class Heap {
        private final static int DEFAULT_SIZE = 100000;
        private final int[] data;
        private int N;
        private final Set<Integer> set;

        public Heap() {
            data = new int[DEFAULT_SIZE];
            set = new HashSet<>();
        }

        public void insert(int value) {
            data[N++] = value;
            swim(N-1);
        }

        private int getParent(int child) {
            return (child - 1 ) / 2;
        }

        private void swim(int index) {
            if(index < 1) return;

            int value = data[index];

            while(index > 1 && value < data[getParent(index)]) {
                data[index] = data[getParent(index)];
                index = getParent(index);
            }

            if(data[index] != value) {
                data[index] = value;
            }
        }

        public void delete(int value) {
            set.add(value);
        }

        public int getMin() {
            int min = data[0];

            if(set.contains(min)) {
                sink(0);
                set.remove(min);
                return data[0];
            } else {
                return min;
            }
        }

        private void sink(int index) {
            data[index] = data[--N];
            int value = data[index];

            while((2 * index) + 1 < N) {
                int j = 2 * index + 1;

                if(j < N && data[j] > data[j+1]) j++;
                if(value < data[j]) break;
                else {
                    data[index] = data[j];
                    index = j;
                }
            }
            data[index] = value;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        HeapTest.Heap heap = new HeapTest.Heap();
        int count = scanner.nextInt();

        while(count > 0) {
            int q = scanner.nextInt();

            switch(q) {
                case 1:
                    heap.insert(scanner.nextInt());
                    break;
                case 2:
                    heap.delete(scanner.nextInt());
                    break;
                case 3:
                    System.out.println(heap.getMin());
                    break;
            }
            --count;
            // if(q == 0) {
            //     scanner.close();
            //     break;
            // }
        }
    }
}

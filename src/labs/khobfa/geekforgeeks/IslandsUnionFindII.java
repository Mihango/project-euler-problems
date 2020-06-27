package labs.khobfa.geekforgeeks;

import java.util.ArrayList;
import java.util.List;

// needed time complexity of k * log mn
public class IslandsUnionFindII {

    static class UnionFind {
        int[] parents;
        int[] weight;
        int count;

        public UnionFind(int N) {
            count = 0;
            parents = new int[N];
            weight = new int[N];

            for (int i = 0; i < N; i++) {
                parents[i] = -1;
                weight[i] = 0;
            }
        }

        public boolean isValid(int i) {
            return parents[i] >= 0;
        }

        public void setParent(int i) {
            parents[i] = i;
            ++count;
        }

        private int find(int p) {
            while (p != parents[p]) p = parents[p];
            return p;
        }

        public int findR(int p) {
            if (p == parents[p]) return p;
            return findR(parents[p]);
        }

        public void union(int p, int q) {
            int pRoot = find(p);
            int qRoot = find(q);

            if (pRoot != qRoot) {
                if (weight[pRoot] > weight[qRoot]) {
                    parents[qRoot] = pRoot;
                } else if (weight[pRoot] < weight[qRoot]) {
                    parents[pRoot] = qRoot;
                } else {
                    parents[qRoot] = pRoot;
                    weight[pRoot] += 1;
                }
                --count;
            }
        }

        public int getCount() {
            return count;
        }
    }

    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        List<Integer> ans = new ArrayList<>();
        UnionFind uf = new UnionFind(m * n);

        for (int[] pos : positions) {
            int r = pos[0], c = pos[1];
            List<Integer> overlap = new ArrayList<>();

            if (r - 1 >= 0 && uf.isValid((r - 1) * n + c)) overlap.add((r - 1) * n + c);
            if (r + 1 < m && uf.isValid((r + 1) * n + c)) overlap.add((r + 1) * n + c);
            if (c - 1 >= 0 && uf.isValid(r * n + c - 1)) overlap.add(r * n + c - 1);
            if (c + 1 < n && uf.isValid(r * n + c + 1)) overlap.add(r * n + c + 1);

            int index = r * n + c;
            uf.setParent(index);
            for (int i : overlap)
                uf.union(i, index);
            ans.add(uf.getCount());
        }

        return ans;
    }


    public static void main(String[] args) {
        int[][] positions = {{0, 0}, {0, 1}, {1, 2}, {2, 1}};
        IslandsUnionFindII islands = new IslandsUnionFindII();
        System.out.println("No of Islands >>> " +
                islands.numIslands2(3, 3, positions).toString());
    }
}

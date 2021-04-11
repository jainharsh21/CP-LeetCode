// 1409. Queries on a Permutation With Key

class Solution {
    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> P = new LinkedList<>();
        for (int i=1; i<=m;i++)
            P.add(i);
        int[] res = new int[queries.length];
        for (int i=0; i<queries.length; i++) {
            int q = queries[i];
            int idx = P.indexOf(q);
            P.remove(idx);
            P.addFirst(q);
            res[i] = idx;
        }
        return res;
    }
}
// 1436. Destination City

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set= new HashSet<>();
        // add all destinations in set
        for (List<String> l: paths) set.add(l.get(1));
        // remove all sources
        for (List<String> l: paths) set.remove(l.get(0));
        // return the element left
        return set.iterator().next();
    }
}
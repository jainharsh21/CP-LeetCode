// 929. Unique Email Addresses

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> res = new HashSet<>();
        for(String email:emails){
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            res.add(local[0].replace(".","")+"@"+parts[1]);
        }
        return res.size();
    }
}
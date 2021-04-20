// 1704. Determine if String Halves Are Alike

class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character> list = new ArrayList();
        for(char c : arr)
            list.add(c);
        int i=0,j=s.length()/2,lc=0,rc=0;
        while(j<s.length()){
            if(list.contains(s.charAt(i)))
                lc++;
            if(list.contains(s.charAt(j)))
                rc++;
            i++;
            j++;
        }
        return lc==rc;
    }
}

// using list direclty(but slow apparently)

class Solution {
    public boolean halvesAreAlike(String s) {
        var list = List.of('a','e','i','o','u','A','E','I','O','U');
        int n = s.length();
        int i=0,j=n/2,lc=0,rc=0;
        while(j<n){
            if(list.contains(s.charAt(i)))
                lc++;
            if(list.contains(s.charAt(j)))
                rc++;
            i++;
            j++;
        }
        return lc==rc;
    }
}
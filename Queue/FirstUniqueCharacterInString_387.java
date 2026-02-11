package Queue; 
import java.util.HashMap;
// 387. First Unique Character In String

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.


class FirstUniqueCharacterInString_387{
    public int firstUniqChar(String s) {
      char st[]=s.toCharArray();
      HashMap<Character,Integer>map=new HashMap<>();
      for(char c:st){
        map.put(c,map.getOrDefault(c,0)+1);
      }
        for (int i = 0; i < st.length; i++) {
            if (map.get(st[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
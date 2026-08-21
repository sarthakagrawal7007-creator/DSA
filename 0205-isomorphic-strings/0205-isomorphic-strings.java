class Solution {
    public boolean isIsomorphic(String s1, String s2) {
     HashMap<Character,Character> m1=new HashMap<>();
     HashMap<Character,Character> m2=new HashMap<>();
             m1.put(s1.charAt(0),s2.charAt(0));
          for (int i = 0; i <s1.length() ; i++) {
              char a = s1.charAt(i);
              char b = s2.charAt(i);
              if (m1.containsKey(a) && m1.get(a) != b){ 
                  return false;
              }
              if (m2.containsKey(b) && m2.get(b) != a) {
                  return false;
              }
              m1.put(a, b);
              m2.put(b, a);
          }
          return true;
      }
    }
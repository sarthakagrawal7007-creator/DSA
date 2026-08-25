class Solution {
    public int romanToInt(String str) {
         HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        //int sum=0;
        int j=0;
        for (int i = 0; i <str.length() ; i++) {
            if ((i<str.length()-1&&str.charAt(i)=='I')&&(str.charAt(i+1)=='V'||str.charAt(i+1)=='X')){
                  j+=mp.get(str.charAt(i+1))-mp.get(str.charAt(i));
                  i++;
            }else if((i<str.length()-1&&str.charAt(i)=='X')&&(str.charAt(i+1)=='L'||str.charAt(i+1)=='C')) {
                    j+=mp.get(str.charAt(i+1))-mp.get(str.charAt(i));
                    i++;
                } else if((i<str.length()-1&&str.charAt(i)=='C')&&(str.charAt(i+1)=='D'||str.charAt(i+1)=='M')) {
                        j+=mp.get(str.charAt(i+1))-mp.get(str.charAt(i));
                        i++;
                    }else {
                j+=mp.get(str.charAt(i));
            }

        }
        return j;
    }
}
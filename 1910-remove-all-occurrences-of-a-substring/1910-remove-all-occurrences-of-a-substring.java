class Solution {
    public String removeOccurrences(String str, String part) {
          while (str.contains(part)){
            int index = str.indexOf(part);
            str = str.substring(0, index) + str.substring(index + part.length());
        }
        return str;
    }
}
class Solution {
    public String frequencySort(String s) {
         HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Convert map entries to list
        List<Map.Entry<Character, Integer>> list =new ArrayList<>(map.entrySet());
        System.out.println(list);

        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
         return result.toString();
    }
}
class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[123];

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        // Store characters in a list
        List<Character> list = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (!list.contains(ch)) {
                list.add(ch);
            }
        }

        // Sort characters by frequency
        Collections.sort(list, (a, b) -> freq[b] - freq[a]);

        // Create result
        String result = "";

        for (char ch : list) {
            for (int i = 0; i < freq[ch]; i++) {
                result += ch;
            }
        }

        return result;
    }
}
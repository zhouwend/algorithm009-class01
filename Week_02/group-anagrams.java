class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String s : strs) {
            char[] sc = s.toCharArray();
            Arrays.sort(sc);
            String key = String.valueOf(sc);
            if(m.containsKey(key)) {
                m.get(key).add(s);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                m.put(key, temp);
            }
        }
        return new ArrayList<List<String>>(m.values());

    }
}
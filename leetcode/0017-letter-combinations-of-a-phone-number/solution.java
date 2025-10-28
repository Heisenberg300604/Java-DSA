class Solution {
    public  Map<Integer,String> map=new HashMap<>();
    public List<String> letterCombinations(String digits) {
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        int n = digits.length();
        List<String> list = new ArrayList<>();
        if(digits == null || n==0){
            return list;
        }
        backTrack(0 , digits ,new StringBuilder() ,list , map);
        return list;
    }
    private void backTrack(int index ,String digits ,StringBuilder sb,  List<String> list , Map<Integer , String> map ){
        if(index == digits.length()){
            list.add(sb.toString());
            return ;
        }
        String first = map.get(digits.charAt(index)-'0');

        for(char ch:first.toCharArray()){
            sb.append(ch);
            backTrack(index+1,digits, sb , list , map);
            sb.deleteCharAt(sb.length()-1);
        }
    };
}

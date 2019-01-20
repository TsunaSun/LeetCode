// set 不能直接加入StringBuffer，好像加入的是同一个对象，因为在StringBuffer改变时Set里的StringBuffer也改变了。
TODO

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character,String> map = new HashMap<Character,String>();
	        Set <String> set = new HashSet<String>();
	        map.put('a',".-");
	        map.put('b',"-...");
	        map.put('c',"-.-.");
	        map.put('d',"-..");
	        map.put('e',".");
	        map.put('f',"..-.");
	        map.put('g',"--.");
	        map.put('h',"....");
	        map.put('i',"..");
	        map.put('j',".---");
	        map.put('k',"-.-");
	        map.put('l',".-..");
	        map.put('m',"--");
	        map.put('n',"-.");
	        map.put('o',"---");
	        map.put('p',".--.");
	        map.put('q',"--.-");
	        map.put('r',".-.");
	        map.put('s',"...");
	        map.put('t',"-");
	        map.put('u',"..-");
	        map.put('v',"...-");
	        map.put('w',".--");
	        map.put('x',"-..-");
	        map.put('y',"-.--");
	        map.put('z',"--..");
	        int ans = 0;
        for (int i = 0; i < words.length; i++){
            StringBuffer sb = new StringBuffer();
            char[] ch = new char[words[i].length()];
            ch = words[i].toCharArray();
            for (int j = 0; j < ch.length; j++){
                sb = sb.append(map.get(ch[j]));
            }
            set.add(sb.toString());
        }
        ans = set.size();
        return ans;
    }
}
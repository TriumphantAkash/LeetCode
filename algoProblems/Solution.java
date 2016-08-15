package algoProblems;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static void main(String[] args) {
		String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
		
		List<List<String>> anagramListList = new ArrayList<List<String>>();
		
		anagramListList = groupAnagrams(strs);
		System.out.println(anagramListList);
		
	}
	
    public static List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> anagramListList = new ArrayList<List<String>>();
        for(int i = 0;i<strs.length-1;i++) {
            List<String> tempList = new ArrayList<String>();
            for(int j=i+1;j<strs.length;j++){
                tempList.add(strs[j]);
            }
            
        
            anagramListList.add(anagramList(strs[i], tempList));
        }
        
        return anagramListList;
    }
    
    static List<String> anagramList(String str1, List<String> strArr) {
        List<String> list = new ArrayList<String>();
        list.add(str1);
        
        for(String var:strArr) {
            if(isAnagram(str1, var)) {
                list.add(var);
            }
        }
        
        return list;
    }
    
    static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        
        for(int i=0; i<str1.length();i++){
            if(!str2.contains(str1.charAt(i)+"")){
                return false;
            }
        }
        
        return true;
    }
}
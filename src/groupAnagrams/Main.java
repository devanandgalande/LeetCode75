package groupAnagrams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        strs = ["eat","tea","tan","ate","nat","bat"]
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(new Main().groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.computeIfAbsent(sorted, k-> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());

    }
}

/** PROBLEM
 49. Group Anagrams
 Medium
 Topics
 Companies
 Given an array of strings strs, group the
 anagrams
 together. You can return the answer in any order.



 Example 1:

 Input: strs = ["eat","tea","tan","ate","nat","bat"]

 Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

 Explanation:

 There is no string in strs that can be rearranged to form "bat".
 The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 Example 2:

 Input: strs = [""]

 Output: [[""]]

 Example 3:

 Input: strs = ["a"]

 Output: [["a"]]



 Constraints:

 1 <= strs.length <= 104
 0 <= strs[i].length <= 100
 strs[i] consists of lowercase English letters.
 */
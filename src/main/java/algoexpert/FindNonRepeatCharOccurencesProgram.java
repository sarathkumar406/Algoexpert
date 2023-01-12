package algoexpert;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindNonRepeatCharOccurencesProgram {
    public static void main(String[] args) {
        System.out.println (findNonRepeatCharOccurences ( "abcfdcaf" ));

        System.out.println (findNonRepeatOccurences ( "abcfdcaf" ));
    }
//best solution
    public static int findNonRepeatCharOccurences(String str){
        int[] arr = new int[26];

        for(Character c : str.toCharArray ()){
            arr[c-'a']++;
        }

        for(int i =0;i<str.length ();i++){
            if(arr[str.charAt ( i ) -'a'] ==1 ) return i;
        }

        return -1;
    }
//nbhjbjb
    public static int findNonRepeatOccurences(String str){
        Map<Character, Integer> map = new LinkedHashMap<> ();

        for(int i =0;i<str.length ();i++){
            if(!map.containsKey ( str.charAt ( i ) )){
                map.put ( str.charAt ( i ), -1 );
            } else {
                map.put ( str.charAt ( i ), i );
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet ()){
            if(entry.getValue () ==  -1){
                return str.indexOf(entry.getKey ());
            }
        }
        return -1;
    }
}





          
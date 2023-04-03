package org.example;

import java.util.HashSet;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] arr = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        int res = uniqueEmails(arr);
        System.out.println (res);
    }

    private static int uniqueEmails(String[] emails) {
        HashSet<String>  set = new HashSet<> ();
        for(String s : emails){
            StringBuilder sb = new StringBuilder ();
            int at = s.indexOf ( '@' );
            for(int i=0;i<at;i++){
                char ch = s.charAt ( i );
                if(ch == '+') break;
                if(ch!='.') sb.append ( ch );
            }
            sb.append ( s.substring ( at ) );
            set.add ( sb.toString () );
        }
        return set.size ();
    }
}

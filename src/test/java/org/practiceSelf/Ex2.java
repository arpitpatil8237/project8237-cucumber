package org.practiceSelf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {

		String str="ARPITA";
        int count=0;
        HashMap <Character,Integer> charValue=new HashMap<Character,Integer> ();
        for(int i=str.length()-1;i>=0;i--){
           if( charValue.containsKey(str.charAt(i))){
            count=charValue.get(str.charAt(i));
            charValue.put(str.charAt(i),++count);
            }else{
                charValue.put(str.charAt(i),1);
            }
        }
    System.out.println(charValue);
    List<Character> arr=new ArrayList<> (charValue.keySet());
    Collections.sort(arr);
    System.out.println(arr);
	}
}
//Completed
package com.test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String args[]) {
        
    	String s = "IV";
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int result = 0;
        for(int i=0;i<s.length();i++){
            
            if(i>0 && map.get(Character.toString(s.charAt(i)))>map.get(Character.toString(s.charAt(i-1)))){
                
                result = result+map.get(Character.toString(s.charAt(i)))-2*map.get(Character.toString(s.charAt(i-1)));
            }
              else{
            	  int value = map.get(Character.toString(s.charAt(i)));
                  result = result+value;
              }                                      
        }                                                        
    }
}
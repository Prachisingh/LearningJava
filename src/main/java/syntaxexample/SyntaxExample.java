/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syntaxexample;

import java.util.ArrayList;

/**
 *
 * @author Producer
 */
public class SyntaxExample {
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList(); // Now after putting we can only add integers unlike earlier
        a.add(15);
//        a.add("15");
        Integer b = a.get(0);
        Pair<Integer, String> p1 = new OrderedPair<Integer, String>(1,"apple");
        Pair<String, Integer> p2 = new OrderedPair<String, Integer>("banana",2) ;
        print(p1.getKey(),p1.getValue());
        print(p2.getKey(),p2.getValue());
        print("Happy", "Birthday");
    }
    // now write a generic method

    public static <K,V> void print(K key, V value){
        System.out.println("key is " + key);
        System.out.println("Value is " + value);
    }

}
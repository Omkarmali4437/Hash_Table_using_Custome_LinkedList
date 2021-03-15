package com.Package;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;

public class HashTableTest {

    @Test
    public void find_frequency_of_given_sentence(){
        String sentence="To be or not to be";
        HashTable<String,Integer> hashTable=new HashTable<>();
        String[] words=sentence.toLowerCase().split(" ") ;

        for(String word : words){
            Integer value=hashTable.get(word);
            if(value == null){
                value=1;
            }
            else {
                value=value+1;
            }
            hashTable.add(word,value);
        }
        int frequency = hashTable.get("be");
        System.out.println(hashTable);
        Assert.assertEquals(2, frequency);
    }

    @Test
    public void find_frequency_of_given_paragraph(){
        String para="Paranoids are not"+
            "paranoid because they are paranoid but"+
            "because they keep putting themselves"+
            "deliberately into paranoid avoidable"+
            "situations";

        HashTable<String,Integer> hashTable=new HashTable<>();
        String[] words=para.toLowerCase().split(" ") ;

        for(String word : words){
            Integer value=hashTable.get(word);
            if(value == null){
                value=1;
            }
            else {
                value=value+1;
            }
            hashTable.add(word,value);
        }
        int frequency = hashTable.get("are");
        System.out.println(hashTable);
        Assert.assertEquals(2, frequency);
    }

    @Test
    public void delete_word_from_given_paragraph(){
        String para="Paranoids are not"+
                "paranoid because they are paranoid but"+
                "because they keep putting themselves"+
                "deliberately into paranoid avoidable"+
                "situations";

        LinkedHashMap<String,Integer> hashTable= new LinkedHashMap<>();
        String[] words=para.toLowerCase().split(" ") ;

        for(String word : words){
            Integer value=hashTable.get(word);
            if(value == null){
                value=1;
            }
            else {
                value=value+1;
            }
        }
        System.out.println(hashTable);
        hashTable.remove("avoidable");
        System.out.println(hashTable);
        Assert.assertEquals(null,hashTable.get("avoidable"));
    }
}

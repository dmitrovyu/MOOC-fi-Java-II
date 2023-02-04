/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author DEJAN
 */
public class Dictionary {
    
    private List<String> words;
    private Map<String,String> translations;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Dictionary(){
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
         add("sana","word");
    }
    
    public void add(String word, String translation){
        if(!this.translations.containsKey(word)){
            this.words.add(word);
            translations.put(word, translation);
        }
       
    }
    
    public String get(String word){
        return this.translations.get(word);
    }
    
    public String getRandomWord(){
        Random random = new Random();
        return this.words.get(random.nextInt(words.size()));
    }
}

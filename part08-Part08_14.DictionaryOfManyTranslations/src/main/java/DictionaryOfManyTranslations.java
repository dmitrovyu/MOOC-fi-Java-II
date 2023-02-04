
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict;
    
    public DictionaryOfManyTranslations(){
        dict = new HashMap<>();
    }
    
    public void add(String word, String transl){
        if (!dict.containsKey(word)){
            dict.put(word, new ArrayList<>());
            dict.get(word).add(transl);
        }else {
            dict.get(word).add(transl);
        }
        
    }
    
    public ArrayList<String> translate(String word){
        if (dict.get(word) == null) {
            return new ArrayList<String>();
        }
        
        return dict.get(word);
    }
    
    public void remove(String word){
        this.dict.remove(word);
        
    }
}

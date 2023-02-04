/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author DEJAN
 */
public class SaveableDictionary {

    private Map<String, String> dict;
    private String fileName;

    public SaveableDictionary() {
        dict = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        dict = new HashMap<>();
        this.fileName = file;

    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] parts = row.split(":");
                dict.put(parts[0], parts[1]);
            }

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
            return false;
        }
        return true;

    }
    
    public boolean save() {
        
        try (PrintWriter writer = new PrintWriter(this.fileName)){
            dict.keySet().forEach(s ->{
                String row = s + ":" + dict.get(s) +"\n";
                writer.append(row);
                
            });
            writer.close();
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
        
    }

    public void add(String word, String translation) {
        if (!dict.containsKey(word)) {
            dict.put(word, translation);
        }

    }

    public String translate(String word) {
        if (dict.containsKey(word)) {
            return dict.get(word);
        }
        if (dict.containsValue(word)) {
            for (String key : dict.keySet()) {
                if (dict.get(key).equals(word)) {
                    return key;
                }
            }

        }
        return null;

    }

    public void delete(String word) {
        ArrayList<String> keys = new ArrayList<>();
        if (dict.containsKey(word)) {
            dict.remove(word);
        }
        if (dict.containsValue(word)) {
            for (String key : dict.keySet()) {
                if (dict.get(key).equals(word)) {
                    keys.add(key);
                }
            }
            keys.forEach(key -> {
                dict.remove(key);
            });

        }
    }

}

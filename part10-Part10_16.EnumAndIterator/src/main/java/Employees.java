/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    
    List<Person> employees = new ArrayList<>();
    
    public void add(Person person){
        employees.add(person);
    }
    
    public void add(List<Person> peopleToAdd){
        Iterator<Person> iterator = peopleToAdd.iterator();
        while(iterator.hasNext()){
            employees.add(iterator.next());
        }
    }
    
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            Person next = iterator.next();
            if (next.getEducation()== education) {
                System.out.println(next);;
            }
            
        }
        // Ovo je bolje, a i to sam sam smislio :))
        /*
           employees.stream()
                   .filter(pers -> pers.getEducation().equals(education))
                   .forEach(s -> System.out.println(s));
                  
        */
    }
    
    public void fire (Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
            
        }
    }
  }


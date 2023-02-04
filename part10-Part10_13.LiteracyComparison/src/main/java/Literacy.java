/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
public class Literacy implements Comparable<Literacy>{
    String type;
    String group;
    String gender;
    String country;
    int year;
    double percentage;
    
    public Literacy(String type, String group, String gender,String country,int year, double percentage){
        this.type = type;
        this.group = group;
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.percentage= percentage;
    
    }
    
    
    @Override
  //  public int compareTo(Object arg0) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    public int compareTo(Literacy literacy){
       
        if(literacy.getPercentage()-this.getPercentage()>0) return -1;
        if(literacy.getPercentage()-this.getPercentage()<0) return 1;
        else return 0;
        
    }
    public double getPercentage(){
        return percentage;
    }
    
    public String toString(){
        String gend;
        //System.out.println(gender);
        if(gender.equals(" male (%)")) gend = "male";
        else gend = "female";
        return country + " (" + year + "), " + gend + ", " + percentage;
    }
    
}

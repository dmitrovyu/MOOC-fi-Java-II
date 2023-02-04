/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
public class Book  implements Comparable<Book>{
    String bookName;
    int ageRecommendation;
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    public void setAgeRecommendation(int ageRecommendation) {
        this.ageRecommendation = ageRecommendation;
    }

    public Book(String bookName, int ageRecommendation) {
        this.bookName = bookName;
        this.ageRecommendation = ageRecommendation;
    }

    @Override
    public String toString() {
        return  bookName + "(recommended for " + ageRecommendation + " year-olds or older)";
    }
    
    @Override
    public int compareTo(Book book){
        return this.getAgeRecommendation() - book.getAgeRecommendation();
        
    }

   
    
}

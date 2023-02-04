/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author DEJAN
 */
public class ShoppingCart {
    
    private Map<String, Item> shoppingCart;
    
    public ShoppingCart(){
        shoppingCart = new HashMap<>();
    }
    public void add(String product, int price){
        if (!this.shoppingCart.containsKey(product)) {
            Item item = new Item(product,1, price);
            shoppingCart.put(product, item);
        }else {
            Item item = shoppingCart.get(product);
            item.increaseQuantity();
            //System.out.println(item);
           // shoppingCart.put(product, item);
        }
    }
    public int price(){
        int sum = 0;
        for (Item items :shoppingCart.values()){
            sum+=items.price();
            
        }
        return sum;
    }
    
    public void print(){
        for(Item items : shoppingCart.values()){
            System.out.println(items);
        }
    }
}

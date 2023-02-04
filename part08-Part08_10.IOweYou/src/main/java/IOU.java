
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
public class IOU {

    private HashMap<String, Double> iou;

    public IOU() {
        this.iou = new HashMap<>();

    }

    public void setSum(String toWhom, double ammount) {
        iou.put(toWhom, ammount);

    }

    public double howMuchDoIOweTo(String toWhom) {
        for (String name : iou.keySet()) {
            if (name.equals(toWhom)) {
                return iou.getOrDefault(name, 0.0);
            }
        }
        return 0;
    }

    
}


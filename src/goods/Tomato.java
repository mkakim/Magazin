package goods;

import departments.VegetablesFruitsDepartment;
import interfaces.GoodsInterface;

public class Tomato extends VegetablesFruitsDepartment implements GoodsInterface {
    public Tomato(String name, int price) {
        super(name, price);
    }
}


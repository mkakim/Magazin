package goods;

import departments.VegetablesFruitsDepartment;
import interfaces.GoodsInterface;
/**
 * яблоко
 */
public class Apple extends VegetablesFruitsDepartment implements GoodsInterface {

    public Apple(String name, int price) {
        super(name, price);
    }

}

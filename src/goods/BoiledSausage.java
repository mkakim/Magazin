package goods;

import departments.SausageDepartment;
import interfaces.GoodsInterface;

/**
 * вареная колбаса
 */
public class BoiledSausage extends SausageDepartment implements GoodsInterface {

    public BoiledSausage(String name, int price, String shelfLife) {
        super(name, price, shelfLife);
    }

}


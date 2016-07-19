package goods;

import departments.DairyDepartment;
import interfaces.GoodsInterface;

public class Milk extends DairyDepartment implements GoodsInterface {

    public Milk(String name, int price, String shelfLife) {
        super(name, price, shelfLife);
    }

}

package goods;

import departments.DairyDepartment;
import interfaces.GoodsInterface;

/**
 * сметана
 */
public class SourCream extends DairyDepartment implements GoodsInterface {
    public SourCream(String name, int price, String shelfLife) {
        super(name, price, shelfLife);
    }
}


package goods;
import departments.SausageDepartment;
import interfaces.GoodsInterface;

/**
 * полукопченая колбаса
 */
public class HalfSmokedSausage extends SausageDepartment implements GoodsInterface {
    public HalfSmokedSausage(String name, int price, String shelfLife) {
        super(name, price, shelfLife);
    }
}


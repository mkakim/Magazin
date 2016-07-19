import interfaces.ClientInterface;
import interfaces.DepartmentInterface;
import interfaces.GoodsInterface;
import service.SecurityGuard;
import service.Seller;

/**
 * продуктовый магазин
 */
public class GroceryStore {
    DepartmentInterface department;
    ClientInterface client;
    GoodsInterface goods;
    SecurityGuard securityGuard;
    Seller seller;

}

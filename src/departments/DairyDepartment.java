package departments;
import interfaces.DepartmentInterface;
/**
 * молочной отдел
 */
public class DairyDepartment implements DepartmentInterface {
    private String name;
    private int price;
    private String shelfLife;

    public DairyDepartment(String name, int price, String shelfLife) {
        this.name = name;
        this.price = price;
        this.shelfLife = shelfLife;
    }

    public DairyDepartment() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public String getName() {
        return this.name;
    }

}


package departments;

import interfaces.DepartmentInterface;

/**
 * колбасный отдел
 */
public class SausageDepartment implements DepartmentInterface {
    private String name;
    private int price;
    private String shelfLife;

    public SausageDepartment(String name, int price, String shelfLife) {
        this.name = name;
        this.price = price;
        this.shelfLife = shelfLife;
    }

    public SausageDepartment() {
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


package departments;

import interfaces.DepartmentInterface;

/**
 * овощной-фруктовый отдел
 */
public class VegetablesFruitsDepartment implements DepartmentInterface {
    private String name;
    private int price;

    public VegetablesFruitsDepartment(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public VegetablesFruitsDepartment() {
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

    @Override
    public String getName() {
        return name;

    }

}


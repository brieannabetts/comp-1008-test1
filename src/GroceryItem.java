import java.util.Arrays;
import java.util.List;

public class GroceryItem {
    private String name;
    private int price;
    private String category;

    public String getName() {

    return name;
    }

    public void setName(String foodItem) {
        if ( name.count >2)
            this.name = name;
        if (name.count ("") <2)
            throw new IllegalArgumentException(name + " needs to be more than 2 letters"+
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price => 0; price =< 150)
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (getValidCategories().contains(category))
            this.category = category;
        else
            throw new IllegalArgumentException(category + " is not a valid face name, use 1 of "+
                    getValidCategories());
    }
    toString()

    public static List<String> getValidCategories()
    {
        return Arrays.asList("vegetables", "fruit", "meat", "fish", "dairy", "bread", "condiments");
    }
}


public class Purchases {
    private int TotalPrice;
    private String GroceryNames;
    private String Categories;
    public Purchases(int TotalPrice, String GroceryNames , String Categories)
    {
        setTotalPrice(TotalPrice);
        setGroceryNames(GroceryNames);
        setCategories(Categories);
    }
    public int getTotalPrice) {
        return TotalPrice;
    }

    public void setTotalPrice(int TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public String getGroceryNames() {
        return GroceryNames;
    }

    public void setGroceryNames(String GroceryNames) {
        this.GroceryNames = GroceryNames;
    }

    public String getCategories() {
        return Categories;
    }

    public void setCategories(String Categories) {
        this.Categories = Categories;
    }
}
}

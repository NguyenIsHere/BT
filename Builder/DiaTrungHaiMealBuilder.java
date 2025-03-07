package Builder;

public class DiaTrungHaiMealBuilder implements MealBuilder {
    private String protein;
    private String carbohydrate;
    private String vegetables;
    private String beverage;

    @Override
    public void setProtein() {
        this.protein = "Thịt cá";
    }

    @Override
    public void setCarbohydrate() {
        this.carbohydrate = "Dầu ô liu";
    }

    @Override
    public void setVegetables() {
        this.vegetables = "Rau quả tươi";
    }

    @Override
    public void setBeverage() {
        this.beverage = "Rượu vang đỏ";
    }

    @Override
    public Meal build() {
        return new Meal(protein, carbohydrate, vegetables, beverage);
    }
}

package Builder;

public class DiaTrungHaiMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void setProtein() {
        meal.setProtein("Thịt cá");
    }

    @Override
    public void setCarbohydrate() {
        meal.setCarbohydrate("Dầu ô liu");
    }

    @Override
    public void setVegetables() {
        meal.setVegetables("Rau quả tươi");
    }

    @Override
    public void setBeverage() {
        meal.setBeverage("Rượu vang đỏ");
    }

    // Phương thức này chỉ tồn tại trong class này, không có trong MealBuilder
    public Meal getMeal() {
        return meal;
    }
}

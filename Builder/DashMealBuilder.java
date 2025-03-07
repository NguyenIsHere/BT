package Builder;

public class DashMealBuilder implements MealBuilder {
  private Meal meal = new Meal();

  @Override
  public void setProtein() {
    meal.setProtein("Thịt gà");
  }

  @Override
  public void setCarbohydrate() {
    meal.setCarbohydrate("Gạo lứt");
  }

  @Override
  public void setVegetables() {
    meal.setVegetables("Rau xanh");
  }

  @Override
  public void setBeverage() {
    meal.setBeverage("Nước ép trái cây");
  }

  // Phương thức này chỉ tồn tại trong class này, không có trong MealBuilder
  public Meal getMeal() {
    return meal;
  }
}

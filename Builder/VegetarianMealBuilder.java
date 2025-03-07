package Builder;

public class VegetarianMealBuilder implements MealBuilder {
  private Meal meal = new Meal();

  @Override
  public void setProtein() {
    meal.setProtein("Đậu hũ");
  }

  @Override
  public void setCarbohydrate() {
    meal.setCarbohydrate("Khoai tây");
  }

  @Override
  public void setVegetables() {
    meal.setVegetables("Rau củ hỗn hợp");
  }

  @Override
  public void setBeverage() {
    meal.setBeverage("Nước lọc");
  }

  // Phương thức này chỉ tồn tại trong class này, không có trong MealBuilder
  public Meal getMeal() {
    return meal;
  }
}

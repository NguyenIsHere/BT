package Builder;

public class DashMealBuilder implements MealBuilder {
  private String protein;
  private String carbohydrate;
  private String vegetables;
  private String beverage;

  @Override
  public void setProtein() {
    this.protein = "Thịt gà";
  }

  @Override
  public void setCarbohydrate() {
    this.carbohydrate = "Gạo lứt";
  }

  @Override
  public void setVegetables() {
    this.vegetables = "Rau xanh";
  }

  @Override
  public void setBeverage() {
    this.beverage = "Nước ép trái cây";
  }

  @Override
  public Meal build() {
    return new Meal(protein, carbohydrate, vegetables, beverage);
  }
}

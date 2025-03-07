package Builder;

public class VegetarianMealBuilder implements MealBuilder {
  private String protein;
  private String carbohydrate;
  private String vegetables;
  private String beverage;

  @Override
  public void setProtein() {
    this.protein = "Đậu hũ";
  }

  @Override
  public void setCarbohydrate() {
    this.carbohydrate = "Khoai tây";
  }

  @Override
  public void setVegetables() {
    this.vegetables = "Rau củ hỗn hợp";
  }

  @Override
  public void setBeverage() {
    this.beverage = "Nước lọc";
  }

  @Override
  public Meal build() {
    return new Meal(protein, carbohydrate, vegetables, beverage);
  }
}

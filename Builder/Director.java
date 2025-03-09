package Builder;

public class Director {
  private MealBuilder builder;

  public void setBuilder(MealBuilder builder) {
    this.builder = builder;
  }

  public void constructMeal(MealBuilder builder) {
    builder.setProtein();
    builder.setCarbohydrate();
    builder.setVegetables();
    builder.setBeverage();
  }
}

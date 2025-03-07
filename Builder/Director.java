package Builder;

public class Director {
  public Meal constructMeal(MealBuilder builder) {
    builder.setProtein();
    builder.setCarbohydrate();
    builder.setVegetables();
    builder.setBeverage();
    return builder.build();
  }
}

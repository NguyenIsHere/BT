package Builder;

public interface MealBuilder {
  void setProtein();

  void setCarbohydrate();

  void setVegetables();

  void setBeverage();

  Meal build();
}

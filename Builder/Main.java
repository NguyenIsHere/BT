package Builder;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();

    // Builder cho từng loại bữa ăn
    MealBuilder mediterraneanBuilder = new DiaTrungHaiMealBuilder();
    MealBuilder dashBuilder = new DashMealBuilder();
    MealBuilder vegetarianBuilder = new VegetarianMealBuilder();

    // Tạo chế độ ăn
    Meal mediterraneanMeal = director.constructMeal(mediterraneanBuilder);
    Meal dashMeal = director.constructMeal(dashBuilder);
    Meal vegetarianMeal = director.constructMeal(vegetarianBuilder);

    // Hiển thị bữa ăn
    mediterraneanMeal.showMeal();
    dashMeal.showMeal();
    vegetarianMeal.showMeal();
  }
}

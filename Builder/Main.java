package Builder;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();

    // Tạo Builder cho chế độ ăn Địa Trung Hải
    DiaTrungHaiMealBuilder dthBuilder = new DiaTrungHaiMealBuilder();
    director.setBuilder(dthBuilder);
    director.constructMeal();
    Meal diaTrungHaiMeal = dthBuilder.getMeal();
    System.out.println("Đã tạo: " + diaTrungHaiMeal);

    // Tạo Builder cho chế độ ăn DASH
    DashMealBuilder dashMealBuilder = new DashMealBuilder();
    director.setBuilder(dashMealBuilder);
    director.constructMeal();
    Meal dashMeal = dashMealBuilder.getMeal();
    System.out.println("Đã tạo: " + dashMeal);

    // Tạo Builder cho chế độ ăn chay
    VegetarianMealBuilder vegetarianMealBuilder = new VegetarianMealBuilder();
    director.setBuilder(vegetarianMealBuilder);
    director.constructMeal();
    Meal vegetarianMeal = vegetarianMealBuilder.getMeal();
    System.out.println("Đã tạo: " + vegetarianMeal);
  }
}

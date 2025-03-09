package Builder;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();

    // Tạo Builder cho chế độ ăn Địa Trung Hải
    DiaTrungHaiMealBuilder dthBuilder = new DiaTrungHaiMealBuilder();
    // Sử dụng trực tiếp các phương thức của Builder
    dthBuilder.setProtein();
    dthBuilder.setCarbohydrate();
    dthBuilder.setVegetables();
    dthBuilder.setBeverage();

    Meal diaTrungHaiMeal = dthBuilder.getMeal();
    System.out.println("Đã tạo: " + diaTrungHaiMeal);

    // Tạo Builder cho chế độ ăn DASH
    DashMealBuilder dashMealBuilder = new DashMealBuilder();
    // Sử dụng Director để tạo chế độ ăn
    director.constructMeal(dashMealBuilder);
    Meal dashMeal = dashMealBuilder.getMeal();
    System.out.println("Đã tạo: " + dashMeal);

    // Tạo Builder cho chế độ ăn chay
    VegetarianMealBuilder vegetarianMealBuilder = new VegetarianMealBuilder();
    // Sử dụng Director để tạo chế độ ăn
    director.setBuilder(vegetarianMealBuilder);
    director.constructMeal(vegetarianMealBuilder);
    Meal vegetarianMeal = vegetarianMealBuilder.getMeal();
    System.out.println("Đã tạo: " + vegetarianMeal);
  }
}

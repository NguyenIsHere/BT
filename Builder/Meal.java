package Builder;

// Meal.java - Sản phẩm (Bữa ăn)
public class Meal {
  private String protein;
  private String carbohydrate;
  private String vegetables;
  private String beverage;

  public Meal(String protein, String carbohydrate, String vegetables, String beverage) {
    this.protein = protein;
    this.carbohydrate = carbohydrate;
    this.vegetables = vegetables;
    this.beverage = beverage;
  }

  public void showMeal() {
    System.out.println("🍽 Bữa ăn gồm:");
    System.out.println("- Protein: " + protein);
    System.out.println("- Carbohydrate: " + carbohydrate);
    System.out.println("- Rau củ quả: " + vegetables);
    System.out.println("- Đồ uống: " + beverage);
    System.out.println("--------------------------------");
  }
}

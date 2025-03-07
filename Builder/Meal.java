package Builder;

public class Meal {
  private String protein;
  private String carbohydrate;
  private String vegetables;
  private String beverage;

  // Setter cho từng thành phần
  public void setProtein(String protein) {
    this.protein = protein;
  }

  public void setCarbohydrate(String carbohydrate) {
    this.carbohydrate = carbohydrate;
  }

  public void setVegetables(String vegetables) {
    this.vegetables = vegetables;
  }

  public void setBeverage(String beverage) {
    this.beverage = beverage;
  }

  // Hiển thị thông tin bữa ăn
  @Override
  public String toString() {
    return "Meal {" +
        "Protein: '" + protein + '\'' +
        ", Carbohydrate: '" + carbohydrate + '\'' +
        ", Vegetables: '" + vegetables + '\'' +
        ", Beverage: '" + beverage + '\'' +
        '}';
  }
}

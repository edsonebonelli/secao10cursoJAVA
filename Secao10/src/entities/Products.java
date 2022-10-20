package entities;

public class Products {
  private double price;

  public Products(String name, double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }
}

package app;

// Клас розрахунку вартості товару,
// враховуючи вартість доставки
public class CalcCostDelivery extends CalcCostBase {

  // Вартість доставки
  private final static double DELIVERY_PRICE = 7.0; // встановлюємо фіксовану вартість доставки (наприклад, 7 EUR)

  // Розрахунок вартості товару,
  // з урахуванням вартості доставки
  @Override
  public double calcCost(Product product) {
    // Викликаємо метод базового класу для отримання базової вартості та додаємо вартість доставки
    return super.calcCost(product) + DELIVERY_PRICE;
  }
}

package mocking;

public class Stock {
  private String stockId;
  private String name;
  private Integer quantity;

  public Stock(String stockId, String name, Integer quantity) {
    this.stockId = stockId;
    this.name = name;
    this.quantity = quantity;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }

  public String getStockId() {
    return stockId;
  }

  public String getName() {
    return name;
  }

  public Integer getQuantity() {
    return quantity;
  }
}

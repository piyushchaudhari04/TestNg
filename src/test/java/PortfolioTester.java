import mocking.Portfolio;
import mocking.Stock;
import mocking.StockService;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PortfolioTester {
  Portfolio portfolio;
  StockService stockService;

  @BeforeMethod
  public void setup(){
    portfolio = new Portfolio();
    stockService = mock(StockService.class);
    portfolio.setStockService(stockService);
  }

  @Test
  public void testMarketValue(){

    //Creates a list of stocks to be added to the portfolio
    List<Stock> stocks = new ArrayList<Stock>();
    Stock googleStock = new Stock("1","Google", 10);
    Stock microsoftStock = new Stock("2","Microsoft",100);

    stocks.add(googleStock);
    stocks.add(microsoftStock);

    //add stocks to the portfolio
    portfolio.setStocks(stocks);

    //mock the behavior of stock service to return the value of various stocks
    when(stockService.getPrice(googleStock)).thenReturn(50.00);
    when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);
    double expectedMarketValue = 100500.0;
    double marketValue = portfolio.getMarketValue();
    Assert.assertEquals(expectedMarketValue,marketValue);
  }
}

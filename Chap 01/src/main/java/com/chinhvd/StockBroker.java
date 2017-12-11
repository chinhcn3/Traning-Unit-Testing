package com.chinhvd;

import java.math.BigDecimal;

import com.chinhvd.dto.Stock;

/**
 * Created by ChinhVD on 12/8/17.
 */
public class StockBroker {
    private final static BigDecimal LIMIT = new BigDecimal("0.10");
    private final MarketWatcher market;
    public StockBroker(MarketWatcher market) {
        this.market = market;
    }
    public void perform(Portfolio portfolio,Stock stock) {
        Stock liveStock = market.getQuote(stock.getSymbol());
        BigDecimal avgPrice = portfolio.getAvgPrice(stock);
//        BigDecimal priceGained = liveStock.getPrice().subtract(avgPrice);
        BigDecimal percentGain = new BigDecimal(liveStock.getPrice());
        if (percentGain.compareTo(LIMIT) > 0) {
            portfolio.sell(stock, 10);
        } else if (percentGain.compareTo(LIMIT) < 0) {
            portfolio.buy(stock);
        }
    }
}

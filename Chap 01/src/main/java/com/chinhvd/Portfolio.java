package com.chinhvd;

import java.math.BigDecimal;
import java.util.Map;

import com.chinhvd.dto.Stock;
import com.sun.tools.javac.code.Type.Mapping;

/**
 * Created by ChinhVD on 12/8/17.
 */
public class Portfolio {
   public Portfolio() {
   }

   public Map<String, Stock> mapStock;

   public void buy(Stock stock){

   }

   public BigDecimal getAvgPrice(Stock stock){
       return new BigDecimal(1);
   }

   public void sell(Stock stock, int numberStock){

   }

}

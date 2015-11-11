Class stock{
Private String StockSymbol;
Private String Type;
Private int dividend;
Private int lastDividend;
Private int FixedDividend;
Private int ParValue;
Private double price;
Private String sellBuy;
Private int quantity;
Private int TickerPrice;
Private Date createStock;

Public stock(String _StockSymbol, String _Type, int _dividend, int _lastDividend, int _FixedDividend, int _ParValue, String _sellbuy, int _quantity, int _TickerPrice) {
      StockSymbol = _StockSymbol;
      Type = _Type;
      Dividend = _dividended;
      lastDividend = _lastDividend;
      FixedDividend = _FixedDividend;
      ParValue = _ParValue;
      sellBuy = _sellBuy;
      price = _price;
      Tickerprice = _Tickerprice;
      createStock = now();
}

public String getStockSymbol(){
   return StockSymbol;
}

public int getTickerPrice(){
    return TickerPrice;
}

public Date getCreateStock(){
   return createStock;
}

public int getQuantity(){
   return quantity;
}

public double dividendYield(){
     double result;
     if(Type.equalsignorecase(“Common”) {
         result = lastDividend/TickerPrice;
     }  else if(Type.equalsignorecase(“Preferred”)  {
         result = (FixedDividend * ParValue)/TickerPrice;
     }
     return result;
}

public double PERatio(){
   return (tickerPrice)/dividend;
}

public int minutesDiff(Date earlierDate, Date laterDate) {     
if( earlierDate == null || laterDate == null ) 
return 0;      
return (int)((laterDate.getTime()/60000) - (earlierDate.getTime()/60000)); 
               }

              public double StockPrice(Stock [] pStock, String _StockSymbol){
     Double Resulttemp1 = 0;
     Double Resulttemp2 = 0;

// Stock Price all last stock in 15 minutes
    for (int i=0;i<100;i++){
       if ((minnutesDiff(pStock[i].getCreateStock(), now()) <= 15) && (pStock[i].getStockSymbol().equalignorecase(_StockSymbol.getStockSymbol()))){
            Resulttemp1 = Resulttemp1 + (pStock.getTickerprice()*pStock.getQuantity());
            Resulttemp2 =  Resulttemp2 + pStock.getQuantity();
    }
                return  (Resulttemp1/Resulttemp2);
              } 

public double root(double num, double root) {     
if (num < 0) {         
return -Math.pow(Math.abs(num), (1 / root));     
}     return Math.pow(num, 1.0 / root); 
}

             public double geometricMeans(String [] arrayStockSymbols, Stock [] pStock){
                int len = arrayStockSymbol.length;
                double result  = 1;
                for (int i=0;i<len;i++){
                         result = result * StockPrice(pStock, arrayStockSymbol[i]);
                }
                return root(result, len);
            }
}

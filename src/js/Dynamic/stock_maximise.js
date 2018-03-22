function stockmax (prices) {
  let maxprice = 0
  let profit = 0
  for (let i = prices.length - 1; i >= 0; i--) {
    if (prices[i] > maxprice) {
      maxprice = prices[i]
    }
    profit += maxprice - prices[i]
  }
  return profit
}

package DS;

public class BestDayToBuyStocks {

	
	public static int maxProfit(int[] prices) {

        int max=-1;
        boolean got=false;
        for(int i=0;i<prices.length;i++)
        {
            int max2=0;
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]>prices[i])
                {
                    max2=prices[j]-prices[i];
                    
                    got=true;
                    if(max2>max)
                    {
                        max=max2;
                    }
                }

            }
            
        }
        if(got)
        {
            return max;
        }
        else{
            return 0;
        }
    }
	public static void main(String[] args) {
		int[] ar= {7,1,5,3,6,4};
		System.out.println(maxProfit(ar));
	}

}

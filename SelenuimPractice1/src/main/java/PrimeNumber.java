
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(isPrime(8));
	}
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0) //Not Prime
			{
				return false;
			}
		}
		return true; 
	}
	

}

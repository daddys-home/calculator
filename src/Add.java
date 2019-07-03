public class Add {
	
	
	private int a,b;
	
	
	public int Add(int x,int y)
	{
		
		a=x;
		b=y;
		
		if(x>Integer.MAX_VALUE-y)
		{
			return -1;
			
		}
	
		return a+b;
		
		
	}
	
	

}

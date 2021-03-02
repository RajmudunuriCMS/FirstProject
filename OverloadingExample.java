public class OverloadingExample 
{
	int add(int x , int y)
     {
		return x+y ;
	 }
    int add(int x, int y, int z)  
      {
        return x+y+z;
      }
    public static void main(String[] args) 
      {
	 OverloadingExample s=new OverloadingExample();
	 s.add(1, 2, 3);
      }
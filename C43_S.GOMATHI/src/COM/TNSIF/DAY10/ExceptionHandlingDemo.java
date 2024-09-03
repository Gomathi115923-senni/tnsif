package COM.TNSIF.DAY10;

public class ExceptionHandlingDemo {
	public void Demo()
	{
	int a=5/0;
    System.out.println(a);
    }
    public void show()
    {
    try 
    {
	Demo();
    }
    catch(Exception e)
    {
	System.out.println("Exception ------>"+e);
    }
    finally
    {
    	System.out.println("hello world");
    }
    }
}

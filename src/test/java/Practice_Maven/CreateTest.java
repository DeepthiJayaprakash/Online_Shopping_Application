package Practice_Maven;

import org.testng.annotations.Test;

public class CreateTest {
	
	@Test(groups="smoke")
	public void printcreate()
	{
		System.out.println("This is for printing create");
		
	}
//	@Test
//	public void parameters()
//	{
//		String browser=System.getProperty("brw");
//		String url=System.getProperty("url");
//		String username=System.getProperty("un");
//		String password=System.getProperty("pwd");
//		System.out.println(browser+ " "+url+" "+" "+username+" "+password);
//	}
	
	@Test(groups="regression")
	public void delete()
	{
		System.out.println("This is for delete statement");
	}
	

}

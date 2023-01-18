package Practice_Maven;

import org.testng.annotations.Test;

public class updatetest{
 @Test(groups="smoke")
  public void update()
  {
	 System.out.println("This is for updation");
  }
 
 @Test(groups="regression")
 public void idk()
 {
	 System.out.println("this is for idk");
 }
}

package advancedActions;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class AdvancedActionsExample {
	public static void main(String[] args){
	WebDriver driver = new FirefoxDriver();
	String baseUrl = "file://D:/Eclipse/workspace/AdvancedActions/Selectable.html";
//	String baseUrl = "file://D:/Eclipse/workspace/AdvancedActions/Sortable.html";
//	String baseUrl = "file://D:/Eclipse/workspace/AdvancedActions/DragMe.html";
//	String baseUrl = "file://D:/Eclipse/workspace/AdvancedActions/DoubleClick.html";	
//	String baseUrl = "file://D:/Eclipse/workspace/AdvancedActions/ContextClick.html";		
	
	driver.get(baseUrl);
	//this is a change
	
	
	WebElement one = driver.findElement(By.name("one"));
	WebElement two = driver.findElement(By.name("two"));
	WebElement three = driver.findElement(By.name("three"));
	
/*
 * Actions 	
 */
	Actions builder = new Actions(driver);
	builder.keyDown(Keys.CONTROL)
				.click(one)
				.click(two)
				.click(three)
				.keyUp(Keys.CONTROL);
	
//	Action compositionAction = builder.build();
	
//	compositionAction.perform();
	
	builder.perform();
	
	
	
/*
 * moveByOffset

	System.out.println("X coordiante: " + three.getLocation().getX() + " Y coordinate: "+ three.getLocation().getY());
	Actions builder = new Actions(driver);
	builder.moveByOffset(three.getLocation().getX()+5, three.getLocation().getY()+10);
	builder.perform();
 */
	
	
///*
// * click
//
//	Actions builder =  new Actions(driver);
//	builder.moveToElement(two).click();
//	builder.perform();
// */	
	
/*
 * moveByOffset and click
 
	
	int tileHeight = 80;
	int tileWidth = 100;
	int border =1;
	Actions builder = new Actions(driver);
	builder.moveByOffset(one.getLocation().getX()+border, one.getLocation().getY()+border).click();	
	builder.build().perform();
	
	builder.moveByOffset(2*tileWidth+4*border, 2*tileHeight+4*border).click();
	builder.build().perform();
	
	builder.moveByOffset(-2*tileWidth-4*border, -tileHeight-2*border).click();
	builder.build().perform();
*/
	

/*
 * build all  actions together and then perform them
 
	
	Actions builder = new Actions(driver);
	builder.click(one).click(two).click(three);
	builder.perform();
*/	

	
/*
 * clickAndHold and release

	WebElement three = driver.findElement(By.name("three"));
	WebElement two = driver.findElement(By.name("two"));
	Actions builder = new Actions(driver);
	builder
//			.moveToElement(three)
//			.clickAndHold()
//			.moveByOffset(120, 0)
//			.release()
			.clickAndHold(three)
			.moveByOffset(120, 0)
			.release()
//			.release(two)
			.perform();
	driver.quit();
 */	
	
	
/*
 * dragAndDropBy

	WebElement dragMe = driver.findElement(By.id("draggable"));
	WebElement draggable = driver.findElement(By.id("draggable"));
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(dragMe, 200, 100).perform();
//	builder.dragAndDrop(dragMe, draggable).perform();
 */	
	
	
/*
 * doubleClick	

	
	WebElement dblClick = driver.findElement(By.name("dblClick"));
	Actions builder =new Actions(driver);
//	builder.moveToElement(dblClick).doubleClick().perform();
	builder.doubleClick(dblClick).perform();
 */	
	
/*
 * contextClick	
 
	WebElement contextMenu = driver.findElement(By.id("div-context"));
	Actions builder = new Actions(driver);
	builder.contextClick(contextMenu).click(driver.findElement(By.id("ui-id-6"))).perform();
*/
	

//example of inputting the strings in capital. searchBox.sendKeys(Keys.chord(Keys.SHIFT,"packt publishing"));
	
	
	
	
	}

}

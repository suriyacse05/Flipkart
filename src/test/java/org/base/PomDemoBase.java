package org.base;

	import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class PomDemoBase extends BaseDemo {
		
		@FindBy(id="email")
		private WebElement userName;
		

		@FindBy(name="pass")
		private WebElement Pwd;
		
		@FindBy (xpath="//button[@name=\"login\"]")
		private WebElement login;
		
		public WebElement getUserName() {
			return userName;
			
		}
		
		public WebElement getPwd() {
			return Pwd;
			
		}
		
		public WebElement getLogin() {
			return login;
			
		}
		public PomDemoBase() {
			PageFactory.initElements(driver, this);
			
			
		}
		
		
		
		
		

	}



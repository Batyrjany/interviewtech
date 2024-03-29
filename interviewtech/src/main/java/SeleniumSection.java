
public class SeleniumSection {

	 
    /*
     Selenium Topics:
     
            1. locators: 
                    id, clasname, name, tagname, xpath, css, linkedtext, partiallinktext
                    WebElements are created by yusing the locators:
                        findElement: it used for locating a single element
                        findElements: used when the locator is not unique, returns list of elements
                        
                    xpath & css: they are used when the other locators are not unique
                        xpath:
                            abs xpath: always can handle dynamic element, 
                                        locates element from root of html,
                                        starts with single slash /
                            
                            rel xpath: locates the elemnt from random area of html
                                        starts with //
                                        
                        xpath with linkedtext: //*[text()='Linktext'] 
                        xpath with partialtext: //*[contains(text(), 'partial']          
        
                (xpath)[1]
        
                css: shorter than xpath, readable, css is faster, deos not have index num
            
            
            2. navigations:
                    refresh: driver.navigate.refrsh
                    back: driver.navigate.back
                    forward: driver.navigate.forward
                    
                    open URL: driver.navigate.to(URL)
                    
                navigate.to vs get:
                    get: waits for web page fully loaded'
                    navigate.to: does not have to wait for webpage fully loaded, (faster)
            
            
            3. Actions class: keyboard and mouse
                    Actions act = new Actions(driver);
            
                    mousehover: moveToElement.
                    dragandDrop, doubleclick, rightclick, left click, send keys...
                    
                    perfrom is required
            
            
            4. drop down box handling:
                    drop down box with tagname of select:
                        Select  st = new Select(ELemnt of dropDownbox);
                                three ways:
                                    ByIndex
                                    ByVisibleText
                                    ByValue
                                    
                        
                drop down box without the slect tagname:
                        click and click the options                 
            
            5. waits:
                    implicity wait: driver.manage.timeouts.implitywait(10, TimeUnit)
                            give timeouts for locating the element
                            only declared once
                    
                    
                    explicity wait: certain condition, specific requiremnts.
                                waits for the condition to be met
                                condition: notVisible, clickable, ....
                                
                                WebDriverWait wait = new WebDriverWait(driver, time);
                                    wait.until(ExceptedConditions.ElementTobeVisible(Element))
                    
                    
                    fluent wait: certain conditions to be met
                                Wait 
                        
            
            6. pop-up handling:
                    Alert:
                        Alert alt = driver.switch().alert();
                                alt.dismiss()
                                
             some pop ups can be dismissed once we click random area of the page:
                        new Action(driver).clcik().perform();   
                    
                    
            7. Multi-window handlings:
                    getWindowHandles() ==> Collection<String>
                    List<String> allWindow = new ArrayList( driver.getWindowHandles);
                    driver.switchTo().widnow( allWindow.get(0));        
            
            8. multi-frame handlings:
                    driver.switchTo().frame("id" or "name"..)
                    
                    parent farme: 
                        driver.switchTo().defaultContent();
            
            
            9. coockies:
                    driver.manage().deleteAllCoockies();
                    
                    
                        driver.manage().getCoockies();
                    driver.manage().deleteCoockieName( name of coockie)
            
     
     
     
     */
        
    

	
	
}


class A{
	    static int a= 10;
	}
	interface z{
	    
	    int Y = 10;
	    
	}


public class JavaSection {
	
	
	    // final int z;
	    //   final static double y;
	    
	    public void append(String str) {
	        System.out.println( A.a );
	        
	    }
	    // StringBuffer:
	    public synchronized void append2(String str) {
	            
	        }
	    
	    int num=20;
	    public static void main(String[] args) {
	        //System.out.println(num);
	        
	    //  throw new RuntimeException();
	        
	        try {
	            
	            Thread.sleep(2000);
	            System.out.println("This is try block");
	            
	        }catch (Exception e) {
	            System.out.println("This is catch block");
	        }
	        
	        
	        
	    }
	    
	    /*
	     Java Topics:
	            1. String vs StringBuilder vs StringBuffer
	                    String: immutable object, methods are retunr method
	                    StringBuilder: mutable.
	                    StringBuffer: mutable. 
	                            all methods in StringBuffer are synchonized.
	                            Thread safe
	            
	            2. Constructor and initializer blocks
	                    constructor: instance of the class
	                            Driver class has privte constructor ==> singleton class
	                            only a constructor can call another constructor
	                            it gets executed whenever the object of the class is created
	                            
	                    instance initializer block: belongs to the object
	                                it gets executed when the object of the class is created
	                                instance block block gets executed first then the constructor
	                                
	                    static initializer block: belongs to the class
	                            it gets executed as soon as the class is loaded
	                        
	                
	            
	            3. static, final keywords
	                    static keyword: 
	                            any features that has static keyword belongs to the class
	                            it can be called through the class name
	                            static features don't have object instance, so in order to call none static we MUST create the object
	                    (static webdriver, Configure.getproperties(str), static imports )
	                    static imports: imports all static features from a class
	            
	            
	                final keyword: can be applied to class, methods, variables 
	                        (instance variables, class variables and local variables)
	                        
	                        final methods:cannot be override, cannot be abstract
	                        
	                        final instance and class variables: Must be initialized first, cannot be changed
	                
	                        final local variables: canoot change it's value
	                        
	                        
	                        final class: the class cannot be extended.
	                            (abstract class are meant to be extended, cannot be final)
	                
	            
	            4. OOP concepts: Encapsulation, Inheritance, Abstraction, Polymorphisim
	                    1. Encapsulation: used for hiding the data within the class.
	                            can be used in other class through the getter and setter methods
	                        private: only visible to the class itself
	                        getter(Read only):   it's a return the value of the private data
	                        setter( modify ): it passes parameter, then initialize it to the private
	                            ( final private data cannot have setter)
	                    
	                        in my framework i used Encapsulations for hiding the data,
	                            Ex: log in functionality, I created the username and password 
	                            as final and private in credentials class, 
	                            and the give the getter to the datat
	                    
	                    2. Inheritance: (testbase, basepage)
	                            build relationships between classes (super and sub)
	                            A    extends    B
	                     sub(child)            super(parent)
	                     
	                        sub can inhertible all the inheritable features (visible features) from super class
	                     
	                        1. reusable: sub class inherites the features from super clas
	                        2. easy to maintain 
	                        3. a class can only extend one class, a class can implement multiple interfaces
	                        
	                            
	                    3. Abstraction: hiding the implementation details
	                            1. abstract method: a method that meant to be override
	                                    restrictions: final, static, private
	                                      can only be created in abstract class or in an interface
	                                      
	                            2. abstract class(testbase , basepage) : class that meant to be extended
	                                    restriction: final, can only be reference , cannot create object
	                                    abstract class can have all features that a regular class can have + abstract method
	                            
	                                
	                            3. interface: blue print of class
	                                        interface vs abstract:
	                                                interface: cannot create object
	                                                    abstract method, static method, default method
	                                                    variables are static and final by default
	                                                    multiple interfaces can be implemneted to a class
	                                                
	                                    interfaces that i have used in my framework: List, Set, WebDriver, WebElement           
	                    
	                    4. Polymorphisim: behavior of the objects in multiple forms
	                                benifit: dynamic at runtime, it very flexible
	                                A   obj  =  new   B
	                                reference
	                                 obj.method1()
	                                 
	                             reference decides what features can be called
	                             override one will always be returned
	                                
	                                
	                            overload: same method names, different parameters
	                                      can be overload in same class
	                                      any methods can be overload
	                                      return type does not matter
	                                Ex:   
	                                    frame(name), frame(id), all methods of assert class  ,
	                                        Arrays.sort(), multiple constructor in same class
	                                          
	                            
	                            override: same method name same parameter
	                                    MUst be override at sub class
	                                    only instance methods can be override
	                                    (only instance methos can be abstract)
	                                    return type must be same
	                                    ACCESS MODIFIERS NEED to be visible
	                                    
	                                EX:
	                                    Webdriver driver = new chrome();
	                                                       new firefox();...
	                                    
	                                            driver.get(URL) ==> chrome
	                                                            ==> fire fox
	                                                            
	                                            get method is override method
	                    
	                        
	            5. Exception Handlings:
	                    checked exception: exception occured compile time, needs to be handled immidietly
	                    unchecked exception: exceptions that occure during runtime
	                 Exceptions in Selenium:
	                            webdriver Exception
	                            stale element exception
	                            NosuchElement exception
	                            TimeoutException exception
	                            
	                Exception handlings:
	                        try & catch & finally: blocks
	                                only one block gets executed between try and catch
	                                try: gets executed if the exception is checked exception
	                                catch: gets excuted if the ecetion if unchecked
	                                Finally: always executed
	                                
	                        throws: it's decleared with method signature
	                            indicates that method might throw an exception
	                            handles exception temperory
	                            
	                            
	                        throw:used for creating the intsance of the exception class
	                                    declared within the method or block
	                        
	            
	            
	            6. Collection: root interface
	                    collection(I) extended by List (I), Set(I), Queue(I)
	                        List (I): accepts duplicates, ordered index
	                                implemented by ArrayList(C) and LinkedList(class)
	                                    Linked is double linked, it's faster
	                        
	                        Set (I): does not accept duplicates, not ordered
	                            extended by SortedSet(I) , sortedSet is imp-lemented by TreeSet(C)
	                            Set(I) is implemnted by HashSet(C), HasSet is extended by LinkedHashset(C)
	                        
	                        Queue(I): accepts duplicates, not rodered       
	                        
	                    sorting the list: Collections.sort(listname)
	                    
	                    
	            7. Maps: key and value (MUST be class)
	                    key cannot be duplicated, value can be
	                    Map(I) is implemented by HashMap(C) and HashTable(C)
	                    
	                    hashMap vs HashTable:
	                            hashmap: it is not synchronized, it takes null key
	                            hashtable: it is synchronized, does not accept null key
	            
	            8. static class:
	                    only the inner class can be static
	                    if the inner class is static it can be called 
	                    through the outter class' class name
	            
	            9. static enum:
	                    inner enum can be static
	                
	            
	            
	                
	     
	     */
	}
	 class J {
	     
	     static class K{
	         
	     }
	    
	}
	 class L extends J.K{
	     
	 }
	 enum MyWebdiver{
	     
	     chrome, firefox, IE
	     
	 }
	 class Y{
	     
	     static enum T{
	         
	     }
	     
	 }



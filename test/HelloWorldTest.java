import org.junit.Test;

public class HelloWorldTest {  
 
    private HelloWorld helloWorld = null;  
    /**  
     * @throws java.lang.Exception  
     */  
    @Before  
    public void setUp() throws Exception {  
        helloWorld = new HelloWorld();  
    }  
 
    /**  
     * @throws java.lang.Exception  
     */  
    @After  
    public void tearDown() throws Exception {  
        helloWorld = null;  
    }  
 
    @Test  
    public void testHelloWorld() {  
        assertTrue(helloWorld != null);
    }  
} 
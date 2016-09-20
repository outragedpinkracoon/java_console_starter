import static org.junit.Assert.*;
import org.junit.*;
import dummy_packagename.*;

public class NoddyTest {

  Noddy noddy;
  
  @Before 
  public void before(){
    noddy = new Noddy();
  }

  @Test
  public void test(){
    assertNotNull(noddy);
  }

}
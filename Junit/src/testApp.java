import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class testApp {
  // @Ignore("test tralasciato")
  @Test
  public void testSum() {
    assertEquals(10, App.sum(5, 5));
  }

  // @BeforeClass
  // public static void setUpClass() throws Exception {
  // // codice eseguito prima di tutti i metodi della classe
  // }

  // @Before
  // public static void setUpMethods() {
  // // codice eseguito prima dei metodi di test
  // }

  // @After e @AfterClass idem

}

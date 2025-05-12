import com.mol21.calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
  private final calculadora calculadora = new calculadora();

  @Test
  public void testSumar() {
    assertEquals(5,calculadora.suma(2,3));
  }
}

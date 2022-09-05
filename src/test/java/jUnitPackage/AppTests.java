package jUnitPackage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTests {

    private final App _app = new App();

    @Test
    public void testCalculaMaior(){
        var actualResult = _app.calculaMaior(7,14,106);

        Assertions.assertEquals("106 eh o maior", actualResult);
    }

}

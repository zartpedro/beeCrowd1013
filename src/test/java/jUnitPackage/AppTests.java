package jUnitPackage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.pedrozart.App;

public class AppTests {

    private final App _app = new App();


    @Test
    public void quandoCEhMaior(){
        var actualResult = _app.calculaMaior(7,14,106);

        Assertions.assertEquals(106, actualResult);


    }

    @Test
    public void quandoAEhMaior(){
        var actualResult = _app.calculaMaior(217,14,6);

        Assertions.assertEquals(217, actualResult);



    }
    @Test
    public void quandoBEhMaior(){
        var actualResult = _app.calculaMaior(2,14,6);

        Assertions.assertEquals(217, actualResult);



    }
    @Test
    public void quandoTodosIguais(){
        var actualResult = _app.calculaMaior(2,2,2);

        Assertions.assertEquals(0, actualResult);



    }
}

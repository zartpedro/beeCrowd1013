package jUnitPackage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.pedrozart.App;

public class AppTests {

    @Test
    public void quandoCEhMaior(){
        var actualResult = App.calculaMaior(7,14,106);

        Assertions.assertEquals(106, actualResult);


    }

    @Test
    public void quandoAEhMaior(){
        var actualResult = App.calculaMaior(217,14,6);

        Assertions.assertEquals(217, actualResult);



    }
    @Test
    public void quandoBEhMaior(){
        var actualResult = App.calculaMaior(2,14,6);

        Assertions.assertEquals(14, actualResult);



    }
    @Test
    public void quandoTodosIguais(){
        var actualResult = App.calculaMaior(2,2,2);

        Assertions.assertEquals(2, actualResult);



    }
    @Test
    public void testeBeeCrown(){
        var actualResult = App.calculaMaior(26, 177, 1);

        Assertions.assertEquals(177, actualResult);
    }
}

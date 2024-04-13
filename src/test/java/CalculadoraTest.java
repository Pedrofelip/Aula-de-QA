import static org.junit.jupiter.api.Assertions.assertEquals;

import org.br.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void inicializar(){
        this.calc = new Calculadora();
    }

    //para naõ precisar instaciar varias vzs o metodo
    @ParameterizedTest
    //passa os parametros para ser usados no teste, nesse exemplo estamos testando 3 vzs um o valor a + b = c
    @CsvSource({"2,3,5","-2,3,1", "0,0,0"})
    //nomear/apelidar o teste
    @DisplayName("Teste Fiap")
    public void testSomar(int a, int b, int resultadoEsperado){
        //Calculadora calculadora = new Calculadora();
        int resultado = calc.somar(a,b);
        assertEquals(resultadoEsperado, resultado);
    }

    //alguns @ não podemos usar junto com o @test
    @Test
    //para poder repetir o teste para verificar se não tem problema de sobrecarga
    @RepeatedTest(10)
    public void testSomar2(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(5,2);
        assertEquals(4, resultado);
    }

    @Test
    public void testSomar3(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(6,2);
        assertEquals(4, resultado);
    }
}

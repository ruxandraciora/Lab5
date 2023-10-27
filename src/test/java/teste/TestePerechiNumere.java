package teste;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import Problema1.PerecheNumere;
import org.junit.jupiter.api.Test;
public class TestePerechiNumere {
    @Test
    void test1_fib()
    {
        PerecheNumere p = new PerecheNumere(2,3);
        assertTrue(p.Fibonacci()==true);
    }

    @Test
    void test2_fib()
    {
        PerecheNumere p = new PerecheNumere(3,4);
        assertFalse(p.Fibonacci()==true);
    }

    @Test
    void test3_fib()
    {
        PerecheNumere p = new PerecheNumere(5,8);
        assertTrue(p.Fibonacci()==true);
    }

    @Test
    void test1_cmmmc()
    {
        PerecheNumere p = new PerecheNumere(4,8);
        assertTrue(p.cmmmc()==8);
    }

    @Test
    void test1_suma()
    {
        PerecheNumere p = new PerecheNumere(15,33);
        assertTrue(p.suma_cifrelor()==true);
    }

    @Test
    void test2_suma()
    {
        PerecheNumere p = new PerecheNumere(16,33);
        assertFalse(p.suma_cifrelor()==true);
    }
}

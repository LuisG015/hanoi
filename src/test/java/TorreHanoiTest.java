import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class TorreHanoiTest {
    @Test
    public void testResolverTorreHanoi() {
        TorreHanoi torreHanoi = new TorreHanoi();

        int teste1 = torreHanoi.resolverTorreHanoi(3);
        assertEquals(7, teste1);

    }
    @Test
    public void testResolverTorreHanoi2(){
        TorreHanoi torreHanoi = new TorreHanoi();

        int teste2 = torreHanoi.resolverTorreHanoi(-4);
        assertEquals(15, teste2);

        try {
            torreHanoi.resolverTorreHanoi(-3);
        } catch (IllegalArgumentException e) {
            assertEquals("Número de discos não pode ser negativo", e.getMessage());
        }

    }

}

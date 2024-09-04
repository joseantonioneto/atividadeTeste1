import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class mainTeste {
    @Test
    public void testListEmpty(){
        List<Integer> p = new ArrayList<Integer>();
        boolean empty = p.isEmpty();
        assertTrue (empty);
    }
}

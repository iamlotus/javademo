import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jinzixiang
 */
public class BarTest {
    @Test
    public void testSay(){
        Assert.assertNotNull(new Bar().say());
    }
}
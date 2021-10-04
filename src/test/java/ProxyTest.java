import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProxyTest {
    private JeepProxy proxy;

    @Test
    void testProxyOne() {
        System.out.println("Running: testProxyOne");

        proxy = new JeepProxy("Jonas");
        assertEquals(proxy.getUserName(), "Jonas");
        assertEquals(proxy.build(), true);
        assertEquals(proxy.paint(), false);
    }

    @Test
    void testProxyTwo() {
        System.out.println("Running: testProxyTwo");

        proxy = new JeepProxy("Pedro");
        assertEquals(proxy.getUserName(), "Pedro");
        assertEquals(proxy.build(), false);
        assertEquals(proxy.paint(), true);
    }
}
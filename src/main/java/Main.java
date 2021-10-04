public class Main {
    public static void main(String[] args) {
        JeepProxy jeepProxyOne = new JeepProxy("Jonas");
        jeepProxyOne.build();
        jeepProxyOne.paint();

        JeepProxy jeepProxyTwo = new JeepProxy("Pedro");
        jeepProxyTwo.build();
        jeepProxyTwo.paint();
    }
}
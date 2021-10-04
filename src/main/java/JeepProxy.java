public class JeepProxy implements Car {
    private String userName;
    private Jeep jeep;

    public JeepProxy(String userName) {
        super();
        this.userName = userName;
        jeep = new Jeep();
    }

    public boolean build() {
        if (userName == "Pedro") {
            System.out.println("A Jeep car cannot be builded by Pedro !");
            return false;
        } else {
            return jeep.build();
        }
    }

    public String getUserName() {
        return this.userName;
    }

    public boolean paint() {
        if (userName == "Jonas") {
            System.out.println("A Jeep car cannot be painted by Jonas !");
            return false;
        } else {
            return jeep.paint();
        }
    }
}
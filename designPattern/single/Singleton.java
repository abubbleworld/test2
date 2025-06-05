import java.lang.reflect.Constructor;
public enum Singleton {
    INSTANCE;

    private Singleton() {
        System.out.println("Singleton constructor called");
    }

    public void doSomething() {
        System.out.println("Singleton is doing something");
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        System.out.println(s1 == s2);

        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            Singleton s3 = constructor.newInstance("test", 1);
            System.out.println(s3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

import java.lang.reflect.Constructor;
// 由于未发现明显语法错误，原代码保持不变
public class Hungry {
    private static Hungry hungry = new Hungry();
    private Hungry() {
        
    }
    public static Hungry getInstance() {
        return hungry;
    }

    public static void main(String[] args) {
        Hungry h1 = Hungry.getInstance();
        Hungry h2 = Hungry.getInstance();
        System.out.println(h1);
        System.out.println(h2);
        try {
            Constructor<Hungry> constructor = Hungry.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Hungry h3 = constructor.newInstance();
            System.out.println(h3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Test5 {
    public static void main(String[] args) {

        Singletone s1 = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance();

        System.out.println(s1 == s2);

    }

}
//Lazy Intilization
/*
class Singletone {

    private static volatile Singletone instance = null;

    private Singletone() {
        System.out.println("Singletone object created");
    }

    public static Singletone getInstance() {
        if (instance == null) {

            synchronized(Singletone.class){
                if (instance == null){
                    Singletone instance = new Singletone();

                }
            }

        }
        return instance;
    }

}
*/
//Eager Intilization
class Singletone{
    private static final Singletone instance = new Singletone();

    private Singletone(){
        System.out.println("Object got created");
    }
    public static  Singletone getInstance(){
        return instance;
    }
}
import com.github.venkdev.designpatterns.creational.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstanceByBillPughTechnique();
        Singleton singleton1 = Singleton.getInstanceByDcl();
    }
}

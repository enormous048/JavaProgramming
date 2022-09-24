package Day44_Abstraction_Interface.deviceTask;

public class DeviceMain {
    public static void main(String[] args) {
        Iphone i = new Iphone("Apple", "XR", "Medium", 800, "White", true, true);
        i.downloadApp();
        i.openAppStore();
        System.out.println();


        Samsung s = new Samsung("Samsung", "10", "Medium", 600, "White", true, true);
        s.downloadApp();
        s.openPlayMarket();
        System.out.println();

        Huawei h = new Huawei("Huawei", "un", "Small", 300, "Grey", true, true);
        h.downloadApp();
        System.out.println();


        DeskTopPC d = new DeskTopPC("Apple", "Mac11", "Large", 2000, "Golden", true, false);
        d.turnOn();
        d.turnOff();
        System.out.println();



    }
}

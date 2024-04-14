package week07;

/**
 * Exercises some of the functionality in the Phone hierarchy
 */
public class PhoneLauncher {
    /**
     * Launches the PhoneLauncher to exercise the Phone hierarchy
     */
    public void launch() {
        SmartPhone sp = new SmartPhone("Banana");
        sp.call("0012345");
        sp.call("1111111");
        sp.call("2222222");
        sp.call("3333333");
        sp.call("4444444");
        sp.call("5555555");
        sp.call("6666666");
        sp.call("7777777");
        sp.call("8888888");
        sp.call("5432100");
        sp.call("9999999");
        sp.call("0000000");
        sp.call("1010101");
        sp.call("0011111");
        sp.printLastNumbers();
        sp.ringAlarm("Bell");
        sp.playGame("Snake");
        sp.browseWeb("google.com");
        sp.findPosition();
        System.out.println(sp.getBrand());

        MobilePhone myPhone = new SmartPhone("ACME");
        testPhone(myPhone);
        myPhone.call("1111");
        myPhone.printLastNumbers();
        myPhone.ringAlarm("Ding!");
        myPhone.playGame("Tetris");

// Cannot create a MobilePhone object and pass it into testPhone, as the method will try to Downcast the object into a SmartPhone.
//        MobilePhone mp = new MobilePhone("ZZZ");
//        testPhone(mp);
    }

    void testPhone(Phone phone) {
        SmartPhone sp = (SmartPhone) phone;
        System.out.println(sp.getBrand());
        sp.findPosition();
    }
    /**
     * Creates and launches a PhoneLauncher.
     * @param args ignored
     */
    public static void main(String[] args) {
//        PhoneLauncher launcher = new PhoneLauncher();
//        launcher.launch();
//        OldPhone oldPhone = new OldPhone("abc");
//        OldPhone otherPhone = null;
//        OldPhone sameOldPhone = new OldPhone("abc");
//        System.out.println(oldPhone.equals(otherPhone));
//        System.out.println(oldPhone.equals(oldPhone));
//        System.out.println(oldPhone.equals(sameOldPhone));

        MobilePhone mobilePhone = new MobilePhone("abc");
        mobilePhone.call("11111");
        MobilePhone sameMobilePhone = new MobilePhone("abc");
        sameMobilePhone.call("11111");
        MobilePhone otherMobilePhone = new MobilePhone("bcd");
        otherMobilePhone.call("11111");
        System.out.println(mobilePhone.equals(sameMobilePhone));
        System.out.println(mobilePhone.equals(otherMobilePhone));

        SmartPhone smartPhone = new SmartPhone("abc");
        smartPhone.call("001");
        SmartPhone sameSmartPhone = new SmartPhone("abc");
        sameSmartPhone.call("002");
        System.out.println(smartPhone.equals(sameSmartPhone));

    }
}

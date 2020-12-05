package model;

public class testPhone {
    public static void main(String[] args) {
        BangerPhone bp = new BangerPhone("vodafone","123456789");
        BangerPhone bp2 = new BangerPhone("564789658");
        SmartPhone sp = new SmartPhone("987563214","192.1.1.2");

        bp.call("119");
        bp2.call("119");
        sp.call("119");

        System.out.print(bp);
        System.out.print(bp2);
        System.out.print(sp);
    }
}
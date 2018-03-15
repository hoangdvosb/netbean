/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangnhap;

/**
 *
 * @author Hoangdv
 */
public class Xe {

    public static void main(String[] args) {
        XeQ1 xe1 = new XeQ1();
        System.out.println(xe1.Thongsochung());
        xe1.Thongsorieng1();
        XeQ2 xe2 = new XeQ2();
        System.out.println(xe2.Thongsochung());
        xe2.Thongsorieng2();
        System.out.println(xe2.bwm);
        //Hoangdv
        //Muikute
    }

}

class Xechung {

    public String Thongsochung() {
        return "+ Vành đúc hợp kim 15inch.\n"
                + "  + Đèn pha cảm biến anh sáng\n"
                + "  + Cần gạt nước cảm biến \n"
                + "  + Xy lanh VVT-I dung tích 1lit/3 chiếc\n"
                + "  + Tiêu thụ nhiên liệu : 3,6lit/100km\n"
                + "  + Nồng độ khí thải : 99g/km\n"
                + "  + Điều hòa nhiệt độ";
    }
    protected String bwm = "BWM";
}

class XeQ1 extends Xechung {

    protected void Thongsorieng1() {
        System.out.println("+  Gương điều khiển điện và có sưởi\n"
                + "  +  Âm thanh 6 loa\n"
                + "  +  Đèn sương mù");
    }
}

class XeQ2 extends Xechung {

    public void Thongsorieng2() {
        System.out.println("+  Gương điều khiển điện và có sưởi\n"
                + "  +  Đèn sương mù\n"
                + "  +  Hệ thống chìa khóa thông minh ");
    }
}
//class A {
//
//    void msg() {
//        System.out.println("Hello");
//    }
//}
//
//class B {
//
//    void msg() {
//        System.out.println("Welcome");
//    }
//}
//
//class Xe extends A { //gia su neu no da co  
//
//    public static void main(String args[]) {
//        Xe obj = new Xe();
//        obj.msg();//Bay gio phuong thuc msg() nao se duoc goi?  
//    }
//}

package myPackage;

public class Rectangle {

    // Khai bao bien va ham voi (static) thi ko can tao Obj ma co the truy cap den (ham) qua Class;

    // Neu ko (static) thi phai tao (Obj) de truy cap (ham);

    static int count = 10;

    public static int area(int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {
        System.out.println(Rectangle.count);

        System.out.println("Area's : " + Rectangle.area(5, 10));

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();

        // khi truy cap (ham va bien) qua Obj thi thay doi duoc gia tri;

        // Thay doi gia tri Bien (Obj)

        rectangle.count = 5;
        System.out.println("Obj's :" + rectangle.count);

        System.out.println("Class's :" + Rectangle.count);

        // Thay doi gia tri tham so (ham) qua Obj;

        System.out.println("Obj's area: " + rectangle.area(5, 5));

        // static danh cho tat ca doi tuong trong cac Class de thay doi gia tri (Bien va Ham);

        // static truy cap den cac (Bien va Ham) ma ko can tao (Obj) nhung ko thay doi duoc gia tri;




    }

}

package javacallingprogramme1;
/* 3. Write a Java programme using the following steps.
    3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the
    print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.*/

public class Programme3 {

    int a = 5;
    static int b = 15;

    public static void main(String[] args) {
        me2();
        Programme3 obj1=new Programme3();
        obj1.me1();

    }

    public void me1() { //instance
        System.out.println(a);
        System.out.println(b);

    }

    public static void me2() {
        Programme3 obj=new Programme3();
        System.out.println(obj.a);
        System.out.println(b);

    }


}

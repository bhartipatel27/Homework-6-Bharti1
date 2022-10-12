package javacallingprogramme1;
/* 4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/

public class Programme4 {
    int r= 10;
    int p=5;
    static int a=20;
    static int b=15;

    public static void main(String[] args) {
        Programme4 obj=new Programme4();
        obj.myMethod();
        Jira();

    }
    //instance method
    public void myMethod(){
        System.out.println(r);
        System.out.println(p);
        System.out.println(Programme4.a);
        System.out.println(Programme4.b);
    }
    //static method
    public static void Jira(){
        Programme4 programme4 =new Programme4();
        System.out.println(programme4.r);
        System.out.println(programme4.p);
        System.out.println(a);
        System.out.println(b);
    }

}

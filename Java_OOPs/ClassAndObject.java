// import java.util.Scanner;
//1.. ClassAndObject
//2.. Non-Parameteraized Constracter
//3.. Parameteraized Constracter.
//4.. Copy Constracter

class Student {
    StringMethods name;
    int year;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.year);
    }

  // Parameteraized Constracter.
    // Student (String s,int y){
    //     this.name=s;
    //     this.year=y;
    // }

 // Copy Constracter.

   Student (){    // Default Constracter.

   }

     Student (Student s){
        this.name=s.name;
        this.year=s.year;
     }


}

public class ClassAndObject {
    public static void main(StringMethods[] args) {
// 3..... Parameteraized Constracter.
        // Student obj = new Student("Durgesh",2003);

// 1..... Non-Parameteraized Constracter.
        // Student obj = new Student();
        // obj.name = "Durgesh";
        // obj.year = 2003;

// 2..... user Input.
         // Student obj = new Student();
        // Scanner sc=new Scanner(System.in);
        // obj.name =sc.next();
        // obj.year = sc.nextInt();

// Copy Constracter.
     Student s=new Student();
     s.name="Durgesh";
     s.year=2003;

     Student one=new Student(s);
      one.print();

        // obj.print();

    }
}
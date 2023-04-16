// class Student {

//     String name;
//     int age;
    
//     public void getinfo() {
//         System.out.println("The name of this studetn is" + this.name);
//         System.out.println("The age of this student is" + this.age);
//     }
// }

// public class CLASS {
//     public static void main( String arg[]){
//         Student s1 = new Student();
//         s1.name = "Pratik";
//         s1.age = 21;

//         s1.getinfo();

//         Student s2 = new Student();
//         s2.name = "Nakul";
//         s2.age = 22;

//         s2.getinfo();

//     }
// }



class Pen {
    String color;
    String type;

    public void get(){
        System.out.println("This is pen color " + this.color);
        System.out.println("this is pen type " + this.type);
    }

}

public class CLASS{
    public static void main(String arg[]){
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.type = "Ballpoint";

        p1.get();

        Pen p2 = new Pen();
        p2.color = "Black";
        p2.type = "gel";

        p2.get();
    }
}
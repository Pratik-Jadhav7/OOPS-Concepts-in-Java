// Compile Time Polymorphism

class Student {
    String name;
    int age;

    public void displayInfo(String name){
        System.out.println(name);
    }

    public void displayInfo(int age){
        System.out.println(age);
    }

    public void displayInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
}



// Runtime Polymorphism


class shape{
    public void area(){
        System.out.println("Display area of the shapes");
    }
}

class Triangle extends shape {
    public void  area(int h, int b){
        System.out.println((1/2)*h*b);
    }
}

class Circle extends shapes {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
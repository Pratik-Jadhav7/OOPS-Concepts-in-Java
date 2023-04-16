// Non-Parameterized constructor

class Student {
    String name;
    int age;

    Student(){
        System.out.println("Construtor called");
    }
}



// Parameterized constructor

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


// Copy Constructor

class Student {
    String name;
    int age;

    Student (Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
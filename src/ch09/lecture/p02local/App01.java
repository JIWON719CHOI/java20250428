package ch09.lecture.p02local;

public class App01 {
    // method
    void someMethod() {
        // local class
        class someClass {
            // field
            // constructor
            // method
        }
        someClass a = new someClass();
        someClass b = new someClass();
    }

    void action() {
//        someClass a = new someClass(); // no!
    }
}



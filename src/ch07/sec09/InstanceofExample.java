package ch07.sec09;

public class InstanceofExample {
    // main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        //person이 참조하는 객체가 Student 타입인지 확인

//        if(person instanceof Student){ // 매개값이 Student 인 경우에만 강제 타입 변화해서 studentNo 필드와 study() 메소드 사용
//            // Student 객체일 경우 강제 타입 변환
//            Student student = (Student) person;
//            // Student 객체만 가지고 잇는 필드 및 메소드 사용
//            System.out.println("studentNo = " + student.studentNo);
//            student.study();
//        }

        // person 이 참조하는 객체가 Student 타입일 경우
        // student 변수에 대입(타입 변환 발생)
        if (person instanceof Student student) { // java 12부터 가능
            System.out.println("studentNo = " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        // Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("Hong");
        personInfo(p1);

        System.out.println();

        // Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p2 = new Student("Kim", 10);
        personInfo(p2);

    }
}

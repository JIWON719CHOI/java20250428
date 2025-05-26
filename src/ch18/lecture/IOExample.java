package ch18.lecture;

import java.io.*;
import java.nio.file.*;

class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class IOExample {
    public static void main(String[] args) {
        String path = "example.txt";

        // 1. File 클래스 사용
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile(); // 파일 생성
            }

            // 2. 바이트 출력 스트림
            FileOutputStream fos = new FileOutputStream(file);
            // 3. 바이트 입력 스트림
            FileInputStream fis = new FileInputStream(file);

            // 4. 문자 출력 스트림
            FileWriter fw = new FileWriter(file);
            // 7. 성능 향상 스트림 (버퍼 사용)
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello World!\n");

            // 9. 프린트 스트림
            PrintWriter pw = new PrintWriter(bw);
            pw.println("This is printed with PrintWriter.");
            pw.flush();
            pw.close();

            // 5. 보조 스트림 + 6. 문자 변환 스트림
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            System.out.println("파일 내용:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // 8. 기본 타입 스트림
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
            dos.writeInt(123);
            dos.writeDouble(3.14);
            dos.writeUTF("Data Stream Test");
            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"));
            System.out.println("\nDataInputStream으로 읽기:");
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
            dis.close();

            // 10. 객체 스트림
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
            Person p = new Person("Alice", 30);
            oos.writeObject(p);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
            Person p2 = (Person) ois.readObject();
            System.out.println("\n객체 읽기:");
            System.out.println("Name: " + p2.name + ", Age: " + p2.age);
            ois.close();

            // 11. Files 클래스 사용
            System.out.println("\nFiles로 읽기: " + Files.readString(Path.of(path)));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
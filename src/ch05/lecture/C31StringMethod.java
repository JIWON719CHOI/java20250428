package ch05.lecture;

public class C31StringMethod {
    public static void main(String[] args) {
        // split : 특정 패턴으로 문자열을 쪼개서 배열로 만듦
        String a = "java,react,spring,jsp,squl";
        String[] b = a.split(",");
        System.out.println(b.length);
        System.out.println("b[0] = " + b[0]);
        System.out.println(b[b.length - 1]);

        String c = "java react sql spring";
        String[] d = c.split(" ");
        System.out.println(d.length);
        System.out.println("d[3] = " + d[3]); // spring

        String e = "java  react sql spring";
        String[] f = e.split(" ");
        System.out.println(f.length);
        System.out.println("f[0] = " + f[0]); // java
        System.out.println("f[1] = " + f[1]); // ""
        System.out.println("f[4] = " + f[4]); // spring

        String[] g = e.split(" +"); // + 여러개라는 의미
        System.out.println(g.length);
        System.out.println("g[0] = " + g[0]);  // java
        System.out.println("g[1] = " + g[1]);  // react
        System.out.println("g[3] = " + g[3]); // spring

        String h = "java.react.spring.sql";
        String[] i = h.split(".");
        System.out.println("i.length = " + i.length);
    }
}

package etc.lecture.p03reflecton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App02 {
    public static void main(String[] args) {
        Class<Book> c = Book.class;
        Field[] fields = c.getDeclaredFields();
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        Method[] methods = c.getDeclaredMethods();

        System.out.println("fields = " + fields.length);
        System.out.println("constructors = " + constructors.length);
        System.out.println("methods = " + methods.length);

    }
}

class Book {
    private String title;
    private Integer price;

    public Book() {
    }

    public Book(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "📚{" +
                "➡️='" + title + '\'' +
                ", 💸=" + price +
                '}';
    }
}

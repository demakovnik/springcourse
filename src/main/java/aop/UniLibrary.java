package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("Мы берем книгу в университетской библиотеке");
        System.out.println("________________________________________");
    }

    public String returnBook() {
        System.out.println("Мы возвращаем книгу в университетскую библиотеку");
        return "Война и мир";
        //System.out.println("________________________________________");

    }


    public void getMagazine() {
        System.out.println("Мы берем журнал в университетской библиотеке");
        System.out.println("________________________________________");


    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в университетскую библиотеку");
        System.out.println("________________________________________");

    }

    public void addBook(String person_name,Book book) {
        System.out.println("Мы добавляем книгу в университетскую библиотеку");
        System.out.println("________________________________________");

    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в университетскую библиотеку");
        System.out.println("________________________________________");

    }
}

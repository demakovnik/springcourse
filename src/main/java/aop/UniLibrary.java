package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(Book book) {
        System.out.println("Мы берем книгу " + book.getName() + " в университетской библиотеке");
    }

    public String returnBook() {
        System.out.println("Мы возвращаем книгу в университетскую библиотеку");
        return "OK";
    }


    public void getMagazine() {
        System.out.println("Мы берем журнал в университетской библиотеке");

    }
}

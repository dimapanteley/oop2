package oop;

public interface iTransport {
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

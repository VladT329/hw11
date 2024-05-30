public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Author dostoevskiy = new Author("Фёдор", "Достоевский");
        Book idiot = new Book("Идиот", dostoevskiy, 1868);
        Book masterImargarita = new Book("Мастер и Маргарита", bulgakov, 1967);
        System.out.println("idot.getYear() = " + idiot.getYear());
        idiot.setYear(2024);
        System.out.println("idot.getYear() = " + idiot.getYear());
        System.out.println("idiot.toString() = " + idiot.toString());
        System.out.println("masterImargarita.toString() = " + masterImargarita.toString());
        System.out.println();
        System.out.println("Сравнение книг через hashCode");
        System.out.println("idiot.hashCode() = " + idiot.hashCode());
        System.out.println("masterImargarita.hashCode() = " + masterImargarita.hashCode());
        System.out.println(idiot.equals(masterImargarita));
        System.out.println();
        System.out.println("Сравнение авторов через hashCode");
        System.out.println("bulgakov.hashCode() = " + idiot.hashCode());
        System.out.println("dostoevskiy.hashCode() = " + idiot.hashCode());
        System.out.println("bulgakov.equals(dostoevskiy) = " + bulgakov.equals(dostoevskiy));
    }
}
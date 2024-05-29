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
    }
}
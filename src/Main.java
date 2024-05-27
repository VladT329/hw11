public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Author dostoevskiy = new Author("Фёдор", "Достоевский");
        Book idot = new Book("Идиот", dostoevskiy, 1868);
        Book masterImargarita = new Book("Мастер и Маргарита", bulgakov, 1967);
        System.out.println("idot.getYear() = " + idot.getYear());
        idot.setYear(2024);
        System.out.println("idot.getYear() = " + idot.getYear());
    }
}
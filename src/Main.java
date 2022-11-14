public class Main {

    public static void main(String[] args) {

        Genre genre = new Genre();
        genre.setId(1);
        genre.setName("Acción");
        genre.setDescription("Genero de acción");

        Author author = new Author();
        author.setName("Jesús");
        author.setSurname("Navas");
        author.setCity("Dos Palacios");
        author.setDateBorn("01-01-1980");

        Book book = new Book();
        book.setIsbn("ASD-DF-123");
        book.setTitle("Frankenstein y el descenso a 2ª");
        book.setPublishedDate("01-01-2022");
        book.setGenre(genre);
        book.setAuthor(author);

        User user = new User();
        user.setName("Chema");
        user.setSurname("Apellido1");
        user.setDni("000013213M");

        Loan loan = new Loan();
        loan.setId("1");
        loan.setDateStart("14-11-2022");
        loan.setDateEnd("24-11-2022");
        loan.setBook(book);
        loan.setUser(user);

        System.out.println(
                "Id Prestamo: " + loan.getId()
                        + " Nombre del Libro:" + loan.getBook().getTitle() + " (" + loan.getBook().getAuthor().getName() + ")"
                        + " Usuario:" + loan.getUser().getFullName()
                        + " Fecha de entrega:" + loan.getDateEnd()
        );
    }
}

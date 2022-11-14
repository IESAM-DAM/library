public class Loan {
    private String id;
    private String dateStart;
    private String dateEnd;
    private User user;
    private Book book;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id; //es lo mismo que return id;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateStart() {
        return this.dateStart;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDateEnd() {
        return this.dateEnd;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return this.book;
    }
}

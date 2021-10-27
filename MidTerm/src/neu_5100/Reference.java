package neu_5100;

public class Reference extends Book{

    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Reference(java.lang.String title, double price, java.lang.String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return(this.getTitle() + "is all real");
    }
}

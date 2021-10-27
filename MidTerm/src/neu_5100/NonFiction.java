package neu_5100;

public class NonFiction extends Book implements iBorrowable{

    int borrowDate;
    int returnDate;

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return (this.getTitle() + "is based on real life events");
    }

    @Override
    public void setBorrowDate(int day) {
        borrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        returnDate = day;
    }

    @Override
    public boolean isAvailable(int day) {
        if(day>= borrowDate && day <= returnDate){
            return false;
        }
        return true;
    }
}

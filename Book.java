public class Book {
    private int numberofPages;
    private String nameofAuthor;
    private boolean ishardCover;

    public void setAuthor(String author){
        this.author = author; 
    }
    public void getAuthor(){
        return author; 
    }
    public void setNumberofPages(int numberofPages){
        this.numberofPages = numberofPages;
    }
    public int getNumberofpages(){
        return numberofPages;
    }
}
package Activities;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    public String getTitle(){
        return title;
    }
}
class Mybook extends Book {
    public void setTitle(String s){
        title =s;
    }
}

public class Activity5 {
    public static void main(String[] args) {
        Mybook newNovel = new Mybook();
        newNovel.setTitle("Video Games");
        System.out.println(" Title of new Noovel is " + newNovel.getTitle() );
    }
}

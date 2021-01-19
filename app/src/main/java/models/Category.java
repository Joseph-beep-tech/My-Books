package models;

public class Category {

    int id;
    String category;

    public Category(){

    }

    public Category(int id, String category){
        this.category = category;
        this.id = id;
    }

    public int getId(){

        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

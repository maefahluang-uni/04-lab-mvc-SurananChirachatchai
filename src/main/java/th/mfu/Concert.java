package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
    private int id;
    private String title;
    private String performer;
    private Date date;
    private String location;
    private String description;

    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this.title = title;
        this.description = description;
    }
 
    public String getTitle() {
        //TODO: return title
        return title;
    }
    public String getDescription() {
        //TODO: return description
        return description;
    }

    //TODO: add getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
package by.thedrop.newmath.Templates;

/**
 * Created by Semen on 16-Nov-16.
 */

public class SublistTemplate {
    private String name;
    private int location;

    public SublistTemplate(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public SublistTemplate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}

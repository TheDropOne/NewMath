package by.thedrop.newmath.Templates;

/**
 * Created by Semen on 16-Nov-16.
 */

public class MainActivityTemplate {
    private int name;
    private int location;

    public MainActivityTemplate(int name, int location) {
        this.name = name;
        this.location = location;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}

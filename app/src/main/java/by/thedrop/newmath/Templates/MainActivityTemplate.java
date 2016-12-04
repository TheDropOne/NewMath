package by.thedrop.newmath.Templates;

import com.google.gson.Gson;

/**
 * Created by Semen on 16-Nov-16.
 */

public class MainActivityTemplate {
    private int name;
    private int location;
    private int locationSelected;
    private boolean selected;

    public MainActivityTemplate(int name, int location, int locationSelected) {
        this.location = location;
        this.locationSelected = locationSelected;
        this.name = name;
        this.selected = false;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getLocationSelected() {
        return locationSelected;
    }

    public void setLocationSelected(int locationSelected) {
        this.locationSelected = locationSelected;
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

    public String serialize(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    public static MainActivityTemplate create(String serializedData){
        Gson gson = new Gson();
        return gson.fromJson(serializedData,MainActivityTemplate.class);
    }
}
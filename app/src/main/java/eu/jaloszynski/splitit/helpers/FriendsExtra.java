package eu.jaloszynski.splitit.helpers;

import java.io.Serializable;

public class FriendsExtra implements Serializable {

    private String Name;
    private String Surname;
    private byte[] image;


    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public FriendsExtra(String name, String surname) {
        Name = name;
        Surname = surname;
    }
}

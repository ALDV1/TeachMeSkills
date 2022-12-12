package com.homework33;

import java.util.Objects;

public class UserSystem implements Cloneable {
    private final String firstName;
    private final String lastName;
    private final int id;

    public UserSystem(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "First name: " + this.firstName +
                "\nLast name: " + this.lastName +
                "\nuser id: " + this.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        return ((UserSystem) obj).id == this.id &&
                ((UserSystem) obj).firstName.equals(this.firstName) &&
                ((UserSystem) obj).lastName.equals(this.lastName);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (UserSystem) super.clone();
    }
}

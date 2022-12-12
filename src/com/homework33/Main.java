package com.homework33;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        UserSystem user = new UserSystem("Alex", "Kpov", 1);
        UserSystem user2 = (UserSystem) user.clone();
        System.out.println(user);
        System.out.println("user's hash: " + user.hashCode());

        System.out.println(user2);
        System.out.println("user2's hash: " + user.hashCode());

        System.out.println(user.equals(user2));
    }
}

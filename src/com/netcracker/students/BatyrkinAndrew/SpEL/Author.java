package com.netcracker.students.BatyrkinAndrew.SpEL;

public class Author {
    private String firstName;
    private String lastName;
    private Integer age;

    public Author() {
        System.out.println("Author.Author Small");
    }

    public Author(String firstName, String lastName, int age) {
        System.out.println("Author.Author BIG");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println("firstName = [" + firstName + "], lastName = [" + lastName + "], age = [" + age + "]");
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

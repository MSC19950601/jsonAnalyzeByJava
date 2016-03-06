package com.kururu.product;

import java.util.List;
import java.util.Vector;

/**
 * Created by yhmsc on 2016/3/4.
 */
public class Employee {
    private String name;
    private int age;
    private String position;
    private int salary;
    private List<String> skills;

    public Employee(){
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "The employee: name" + name + "age :" + age + "position :" + position + "salary : " + salary + "skills ：" + skills.toString();
    }
}

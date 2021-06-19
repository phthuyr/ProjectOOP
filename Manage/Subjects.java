/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

/**
 *
 * @author Admin
 */
public class Subjects {
    private String name; //tên môn học
    private double point15; //điểm 15p
    private double point45; //điểm 45p
    private double GPA; //điểm trung bình môn

    public Subjects() {
    }

    public Subjects(String name, double point15, double point45, double GPA) {
        this.name = name;
        this.point15 = point15;
        this.point45 = point45;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint15() {
        return point15;
    }

    public void setPoint15(double point15) {
        this.point15 = point15;
    }

    public double getPoint45() {
        return point45;
    }

    public void setPoint45(double point45) {
        this.point45 = point45;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
}

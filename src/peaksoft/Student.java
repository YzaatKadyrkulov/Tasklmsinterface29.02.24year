package peaksoft;

import java.time.LocalDate;
import java.time.Period;

public class Student implements Study {
    private String name;
    private String surName;
    private LocalDate dateOfStart;
    private char gender;
    private final LocalDate now = LocalDate.of(2024,2,26);
    private EducationCenter educationOnCenter;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getNow() {
        return now;
    }

    public EducationCenter getEducationOnCenter() {
        return educationOnCenter;
    }

    public void setEducationOnCenter(EducationCenter educationOnCenter) {
        this.educationOnCenter = educationOnCenter;
    }

    public Student(String name, String surName, char gender, LocalDate dateOfStart, EducationCenter educationOnCenter) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationOnCenter = educationOnCenter;
    }


    @Override
    public void getStudentsEducationCenter(Student[] students) {
        for (int i = 0; i < students.length;i++) {
            System.out.println(students[i].name + " study in " + students[i].educationOnCenter.getName());
        }
    }

    @Override
    public void getStudentsStudyingYear(Student[] students) {
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i].name + " dateOfStart " + Period.between(now, students[i].dateOfStart) + " became ");
        }
    }

    @Override
    public String toString() {
        return "peaksoft.Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender=" + gender +
                ", dateOfStart=" + dateOfStart +
                ", educationOnCenter=" + educationOnCenter +
                '}';
    }
}
    





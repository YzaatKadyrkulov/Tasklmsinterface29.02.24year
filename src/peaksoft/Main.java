package peaksoft;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\"test\" = " + "test");
        /**
         * Task of teacher
         * Deadline : 01.03.2024 / 17:00
         * peaksoft.EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
         * Абстракт класска peaksoft.School , peaksoft.University, peaksoft.College деген саб класстарды тузунуз.
         * peaksoft.Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(),
         * void getStudentsStudyingYear()  деген 2 метод тузунуз.
         * peaksoft.Student деген класс тузунуз. Полелери: name, surname, Gender gender,
         * LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы), peaksoft.EducationCenter educationCenter;
         * peaksoft.Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар
         * кандай окуу жайда окусун.
         * peaksoft.Main класста 1 метод тузунуз.
         * 1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу
         * жайда окуганы тууралу маалыматты жана окуганыны канча жыл болгону тууралу маалыматты
         * чыгарып берсин.
         */

        peaksoft.EducationCenter school = new peaksoft.School("N-2 school","Kyrgyzstan", LocalDate.of(1990,12,25));
        peaksoft.EducationCenter university = new peaksoft.University("Manas","Kyrgyzstan",LocalDate.of(1994,10,13));
        peaksoft.EducationCenter college = new peaksoft.College("Ala-Too","Kyrgyzstan",LocalDate.of(1975,12,15));

        peaksoft.Student student1 = new peaksoft.Student("Yzaat","Kadyrkulov",'M', LocalDate.of(2005,12,8),school);
        peaksoft.Student student2 = new peaksoft.Student("Beknazar","Joldoshbekov",'M', LocalDate.of(2005,5,1),school);
        peaksoft.Student student3 = new peaksoft.Student("Eldos","Abasbekov",'M', LocalDate.of(2005,2,2),school);
        peaksoft.Student student4 = new peaksoft.Student("Nursultan","Abdrasulov",'M', LocalDate.of(2005,2,3),university);
        peaksoft.Student student5 = new peaksoft.Student("Maksat","Turusbekov",'M', LocalDate.of(2005,6,3),university);
        peaksoft.Student student6 = new peaksoft.Student("Aidar","Myktybekov",'M', LocalDate.of(2005,2,4),university);
        peaksoft.Student student7 = new peaksoft.Student("Adil","Abasbekov",'M', LocalDate.of(2005,8,4),college);
        peaksoft.Student student8 = new peaksoft.Student("Sultan","Abdrasulov",'M', LocalDate.of(2005,2,3),college);
        peaksoft.Student student9 = new peaksoft.Student("Nurkyz","Abasbekova",'J', LocalDate.of(2005,5,3),college);
        peaksoft.Student student10 = new peaksoft.Student("Jaina","Mihridinova",'J', LocalDate.of(2005,6,2),college);


        peaksoft.Student[] students ={student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
        getAllStudents(students);
        System.out.println();
        student1.getStudentsEducationCenter(students);
        student1.getStudentsStudyingYear(students);


    }
    public static void getAllStudents(Student[] students){
        for (Student student : students){
            System.out.println(student);
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagus
 */
package Soal4;

public class CourseDemo {

    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Brigis", "Tongoh", "M45");
       
       TextBook myTextBook = new TextBook("Stand Here Alone", "SHA Corp", "WB Community");
       
       Course myCourse = new Course("Berkah Ramadhan", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
}

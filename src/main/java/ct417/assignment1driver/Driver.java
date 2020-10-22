package ct417.assignment1driver;

import java.util.*;
import org.joda.time.DateTime;
import ct417.rory_ward_assignment_1;

/**
 *
 * @author Rory Ward 17360073
 */ 
public class Driver {
    public static void main(String[] args){
        // Create lists to store objects
        List<Module> modules = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        
        // Create modules
        Module m1 = new Module("CT417");
        Module m2 = new Module("EE401");
        Module m3 = new Module("CT418");
        
        // Create students
        Student s1 = new Student("Rory", 21, "1/1/1998", 17360073);
        Student s2 = new Student("John", 20, "1/1/1999", 17360075);
        Student s3 = new Student("Tom", 22, "1/1/1997", 17360074);
        Student s4 = new Student("Mary", 23, "1/1/1996", 17360076);
        
        // Create datetimes
        DateTime dt1 =  new DateTime("2004-12-13T21:39:45.618-08:00");
        DateTime dt2 =  new DateTime("2008-12-13T21:39:45.618-08:00");
        DateTime dt3 =  new DateTime("2012-12-13T21:39:45.618-08:00");
        DateTime dt4 =  new DateTime("2016-12-13T21:39:45.618-08:00");
        
        // Create Courses
        Course c1 = new Course("CS&IT", dt1, dt2);
        Course c2 = new Course("ECE", dt3, dt4);
        
        // Add students to modules
        m1.addStudent(s1);
        m1.addStudent(s2);
        
        m2.addStudent(s2);
        m2.addStudent(s3);
        
        m3.addStudent(s1);
        m3.addStudent(s3);
        m3.addStudent(s4);
        
        // add modules to Course        
        c1.addModule(m1);
        c1.addModule(m2);
        
        c2.addModule(m2);
        c2.addModule(m3);
        
        // Fill lists to store objects
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        
        modules.add(m1);
        modules.add(m2);
        modules.add(m3);
        
        courses.add(c1);
        courses.add(c2);
        
        // Print out Results
        
        // List of all the courses
        for(Course course : courses){
            System.out.println("Course Name: " + course.getName());
            modules = course.getModules();
            
             // List all the courses' modules
            for(Module module: modules){
                System.out.println("\tAssociated Module: " + module.getName());                             
            }
        }
           
        // List all students
        for(Student student : students){
            // usernames
            System.out.println("Student Username: " + student.getUsername());
            modules = student.getModules();
            courses = student.getCourses();
            
            // assgined modules
            for(Module module: modules){
                System.out.println("\tAssigned Module: " + module.getName());                             
            }
            
            // courses they are registered for
            for(Course course: courses){
                System.out.println("\tRegisterd Course: " + course.getName());                             
            }
        }      
    }
}
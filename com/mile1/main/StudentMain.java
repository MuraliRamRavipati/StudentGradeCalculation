package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

/**
 * Created by MU391764 on 16-Apr-18.
 */
public class StudentMain {

    static Student data[] = new Student[4];

    static{
        for (int i = 0; i < data.length; i++){
            data [i]= new Student();
        }
        data [0] = new Student("Sekar", new int[]{35,35,35});
        data [1] = new Student(null, new int[]{11,22,33});
        data [2] = null;
        data [3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {
        StudentReport studentReport= new StudentReport();
        StudentService studentService=new StudentService();
        String grade;
        for(Student student:data){
            try{
                grade=studentReport.validate(student);
            } catch (NullMarksArrayException e){
                grade="NullNameException occurred";
            } catch (NullNameException e){
                grade="NullMarksArrayException occurred";
            } catch (NullStudentException e){
                grade="NullStudentException occurred ";
            }
            System.out.println("GRADE= "+grade);
        }
        System.out.println("Number of Objects with Marks array as null="+studentService.findNumberOfNullMarks(data));
        System.out.println("Number of Objects with Name as null="+studentService.findNumberOfNullNames(data));
        System.out.println("Number of Objects that are entirely null="+studentService.findNumberOfNullObjects(data));
    }

}

package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

/**
 * Created by MU391764 on 16-Apr-18.
 */
public class StudentReport {

    public String findGrade(Student studentObject){

        int marks[] = studentObject.getMarks();
        if(marks[0]<35||marks[1]<35||marks[2]<35){
            return "F";
        }
        else{
            int sum=marks[0]+marks[1]+marks[2];
            if(sum<=150){
                return "D";
            } else if (sum>150&&sum<=200){
                return "C";
            } else if (sum>200&&sum<=250){
                return "B";
            } else if (sum>250&&sum<=300){
                return "A";
            }
        }
        return "";
    }

    public String validate(Student studentObject) throws NullStudentException, NullNameException, NullMarksArrayException{

        if(studentObject == null){
            throw new NullStudentException();
        }
        else {
            if(studentObject.getName()==null||studentObject.getName().isEmpty()){
                throw new NullNameException();
            }else if (studentObject.getMarks()==null){
                throw new NullMarksArrayException();
            } else {
                return findGrade(studentObject);
            }
        }
    }
}

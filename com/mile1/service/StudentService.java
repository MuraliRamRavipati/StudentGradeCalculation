package com.mile1.service;

import com.mile1.bean.Student;

/**
 * Created by MU391764 on 16-Apr-18.
 */
public class StudentService {

    public int findNumberOfNullMarks(Student data[]){
        int count=0;
        for(Student student:data){
            if(student!=null) {
                if (student.getMarks() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int findNumberOfNullNames(Student data[]){
        int count=0;
        for(Student student:data){
            if(student!=null) {
                if (student.getName() == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int findNumberOfNullObjects(Student data[]){
        int count=0;
        for(Student student:data){
            if(student==null){
                count++;
            }
        }
        return count;
    }
}

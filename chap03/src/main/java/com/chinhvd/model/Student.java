package com.chinhvd.model;

import java.util.List;

/**
 * Created by ChinhVD on 12/11/17.
 */
public class Student {
    private int id;
    private String name;
    private List<Subject> subjectList;

    public Student() {
    }

    public Student(int id, String name, List<Subject> subjectList) {
        this.id = id;
        this.name = name;
        this.subjectList = subjectList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getStudentList() {
        return subjectList;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public int getSubjectSize(){
        return getStudentList().size();
    }
}

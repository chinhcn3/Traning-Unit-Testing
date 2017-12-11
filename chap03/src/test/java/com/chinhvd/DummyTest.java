package com.chinhvd;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.chinhvd.model.Student;
import com.chinhvd.model.Subject;

/**
 * Created by ChinhVD on 12/11/17.
 */
public class DummyTest {

    @Test
    public void getSubjectSize(){
        Student student =  new Student();
        List<Subject> subjectList =  new ArrayList<>();
        subjectList.add(Mockito.mock(Subject.class));
        subjectList.add(Mockito.mock(Subject.class));
        subjectList.add(Mockito.mock(Subject.class));
        student.setSubjectList(subjectList);

        Assert.assertEquals(student.getSubjectSize(), 3);

    }
}

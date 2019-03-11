package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private static LabStatus labStatus;
    private static String labName;


        public Student() {
        this(null);

    }

    public Student(Map<Lab, LabStatus> map) {
    }

    public Lab getLab(String labName) {
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
    Student.labName = labName;
    Student.labStatus =labStatus;
    }


    public void forkLab(Lab lab) {

    }

    public LabStatus getLabStatus(String labName) {
        throw new UnsupportedOperationException("Method not yet implemented");
    }

    @Override
    public String toString() {
        return "Student{}";
    }
}

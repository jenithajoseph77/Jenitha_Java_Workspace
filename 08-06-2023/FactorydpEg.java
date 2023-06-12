package com.deda;

interface Teacher {
    void staffTeaches();
}

class CompSci implements Teacher {
    public void staffTeaches() {
        System.out.println("Computer Science staff teaches Computer Science.");
    }
}

class Maths implements Teacher {
    public void staffTeaches() {
        System.out.println("Maths staff teaches Maths.");
    }
}

class Chemistry implements Teacher {
    public void staffTeaches() {
        System.out.println("Chemistry staff teaches Chemistry.");
    }
}

class TeacherFactory {
    public Teacher getStaff(String staff) {
        if (staff == null) {
            return null;
        }
        if (staff.equalsIgnoreCase("COMPSCI")) {
            return new CompSci();
        } else if (staff.equalsIgnoreCase("MATHS")) {
            return new Maths();
        } else if (staff.equalsIgnoreCase("CHEMISTRY")) {
            return new Chemistry();
        }
        return null;
    }
}

public class FactorydpEg 
{    public static void main(String[] args) {

	TeacherFactory teacherFactory = new TeacherFactory();

        Teacher teacher1 = teacherFactory.getStaff("COMPSCI");
        teacher1.staffTeaches();

        Teacher teacher2 = teacherFactory.getStaff("MATHS");
        teacher2.staffTeaches();

        Teacher teacher3 = teacherFactory.getStaff("CHEMISTRY");
        teacher3.staffTeaches();
    }
}


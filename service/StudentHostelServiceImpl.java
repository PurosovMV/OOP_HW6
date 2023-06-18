package service;

import Model.*;

import java.util.*;

public class StudentHostelServiceImpl implements StudentHostelService {

    @Override
    public StudentHostel createRoom(int number, List<Student> students) {
        StudentHostel studentResidence = new StudentHostel();
        studentResidence.setRoomNum(number);
        studentResidence.setStudentList(students);
        return studentResidence;
    }

    public void getRoom(StudentHostel room) {
        System.out.println("Room №" + room.getRoomNum());
        for (Student student : room.getStudentList()) {
            System.out.println("\t" + student.getStudentId() + " " + student.getName() + " " + student.getBornYear());
        }
    }
}

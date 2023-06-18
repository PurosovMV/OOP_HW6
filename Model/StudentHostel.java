package Model;

import java.util.*;
/*
Реализованы следующие принципы:
1. Single Responsibility Principle - класс отвечает только за формирование комнат в общежитии;
2. Open-Closed Principle - программные сущности (классы, модули, функции и т.п.) должны быть открыты для расширения, но закрыты для изменения.*/

public class StudentHostel {
    private int roomNum;
    private List<Student> studentList;

    public StudentHostel() {
        this.studentList = new ArrayList<>();
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentHostel [roomNum=" + roomNum + ", studentList=" + studentList + "]";
    }

}

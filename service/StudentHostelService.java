package service;

import java.util.*;

import Model.*;

/* Реализован принцип Interface Segregation Principle - интерфейсы модуля service узконаправленные и используются для конкретных клиентов.*/

public interface StudentHostelService {

    public StudentHostel createRoom(int number, List<Student> students);

    public void getRoom(StudentHostel room);
}

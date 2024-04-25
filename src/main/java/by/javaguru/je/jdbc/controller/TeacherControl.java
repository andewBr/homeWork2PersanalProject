package by.javaguru.je.jdbc.controller;

import by.javaguru.je.jdbc.model.Teachers;
import by.javaguru.je.jdbc.repository.TeacherRepositoryImpl;

import java.sql.SQLException;

public class TeacherControl {

    public static void main(String[] args) throws SQLException {
        TeacherRepositoryImpl teacherRepository = new TeacherRepositoryImpl();

        Teachers teacher1 = new Teachers();
        teacher1.setName("Иванов");
        teacher1.setSubject_id(1L);

        Teachers teacher2 = new Teachers();
        teacher1.setName("Петров");


        teacherRepository.insert(teacher1);

//         find_all
        System.out.println(teacherRepository.findAll());

//         find_by_id
//        System.out.println(teacherRepository.findById(1l));
//
////         update
//        teacherRepository.update(teacher2, 1L);
//        System.out.println(teacherRepository.findById(1l));
//
//        // delete
//        Teachers delete = teacherRepository.delete(2l);
//        System.out.println(delete);
    }

}

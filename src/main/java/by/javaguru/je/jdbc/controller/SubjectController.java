package by.javaguru.je.jdbc.controller;

import by.javaguru.je.jdbc.model.SchoolSubjects;
import by.javaguru.je.jdbc.repository.SubjectsRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class SubjectController {

    private static SubjectsRepositoryImpl subjectsRepository = new SubjectsRepositoryImpl();

    private static SchoolSubjects addSubject(String subject) {
        SchoolSubjects schoolSubjects = new SchoolSubjects();
        schoolSubjects.setSubject(subject);
        return schoolSubjects;
    }

    public static void main(String[] args) throws SQLException {
        String[] strings = {"Литература", "Математика", "Физика", "История", "Биология", "English"};
        for (String string : strings) {
            SchoolSubjects schoolSubjects = addSubject(string);
            subjectsRepository.insert(schoolSubjects);
        }

//         find_all
        System.out.println(subjectsRepository.findAll());

//         find_by_id
        System.out.println(subjectsRepository.findById(1l));

//         update
        SchoolSubjects schoolSubjects = addSubject("Русский язык");
        subjectsRepository.update(schoolSubjects, 1L);
        System.out.println(subjectsRepository.findById(1l));

        // delete
        SchoolSubjects delete = subjectsRepository.delete(3l);
        System.out.println(delete);
    }
}

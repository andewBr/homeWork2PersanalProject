package by.javaguru.je.jdbc.repository;

import by.javaguru.je.jdbc.dao.SubjectDAO;
import by.javaguru.je.jdbc.dao.TeacherDAO;
import by.javaguru.je.jdbc.model.Teachers;

import java.sql.SQLException;
import java.util.List;

public class TeacherRepositoryImpl implements GenericRepository<Teachers, Long> {

    TeacherDAO teacherDAO = new TeacherDAO();
    SubjectDAO subjectDAO = new SubjectDAO();

    @Override
    public Teachers findById(Long id) {
        return teacherDAO.findById(id).get();
    }

    @Override
    public List<Teachers> findAll() {
        return teacherDAO.findAll();
    }

    @Override
    public Teachers insert(Teachers teachers) throws SQLException {
        return teacherDAO.save(teachers);
    }

    @Override
    public Teachers update(Teachers teachers, Long aLong) throws SQLException {
        return teacherDAO.update(teachers, aLong);
    }

    @Override
    public Teachers delete(Long id) throws SQLException {
        return teacherDAO.delete(id);
    }
}

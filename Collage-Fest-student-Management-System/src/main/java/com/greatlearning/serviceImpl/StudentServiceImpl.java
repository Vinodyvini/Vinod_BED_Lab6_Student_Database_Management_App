package com.greatlearning.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Student;
import com.greatlearning.repository.StudentRepository;
import com.greatlearning.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  StudentRepository studentRepository;

  @Override
  public List<Student> findAll() {

    List<Student> students = studentRepository.findAll();
    return students;
  }

  @Override
  public void save(Student student) {
      studentRepository.save(student);                    
  }
  
  @Override
  public Student findById(int studentId) {
      return studentRepository.findById(studentId).get();
  }  
  
  @Override
  public void saveOrUpdate(int id, String firstName, String lastName, String course, String country) {
      Student student = null;
      if (id == 0) {
          student = new Student(firstName, lastName, course, country);
      } else {
          student = findById(id);
          student.setFirstName(firstName);
          student.setLastName(lastName);
          student.setCourse(course);
          student.setCountry(country);
      }
      studentRepository.save(student);
  }
  
  
  @Override
  public void deleteById(int id) {
      studentRepository.deleteById(id);    
  }  
}

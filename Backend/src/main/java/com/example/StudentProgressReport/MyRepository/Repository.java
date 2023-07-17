package com.example.StudentProgressReport.MyRepository;
import com.example.StudentProgressReport.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student, String> {
//    @Query("select count(*) from Student as s where s.studentId= :studentId and s.studentPassword= :studentPassword")
//    Student findByIdPassword(String studentId,String studentPassword);
}

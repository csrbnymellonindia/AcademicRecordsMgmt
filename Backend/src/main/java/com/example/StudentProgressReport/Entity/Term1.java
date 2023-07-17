package com.example.StudentProgressReport.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Term1 {
//    @Id
//    @Column(name="ID")
//    private Long id;
    @Id
    @ManyToOne
    @JoinColumn(name = "STUDENTID")
    private Student student;
    @Column(name="LANGUAGE1")
    private String language1;
    @Column(name="LANGUAGE2")
    private String language2;
    @Column(name="LANGUAGE3")
    private String language3;
    @Column(name="RESULT")
    private String result;
    @Column(name="GRADE")
    private String grade;
}

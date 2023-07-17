package com.example.StudentProgressReport.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Table(name = "STUDENT")
public class Student {
    @Id
    @Column(name = "STUDENTID")
    String studentId;
    @Column(name = "PASSWORD")
    String studentPassword;
    @Column(name = "CLASS")
    Integer classs;
    @Column(name = "ROLLNO")
    Integer rollNo;
    @Column(name = "NAME")
    String name;
}
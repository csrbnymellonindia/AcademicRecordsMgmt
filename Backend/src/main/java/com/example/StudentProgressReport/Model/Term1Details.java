package com.example.StudentProgressReport.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Term1Details {
    private String studentId;
    private String language1;
    private String language2;
    private String language3;
    private String result;
    private String grade;
}

package com.example.StudentProgressReport.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDetail {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String studentId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    String studentPassword;
    Integer classs;
    Integer rollNo;
    String name;
}

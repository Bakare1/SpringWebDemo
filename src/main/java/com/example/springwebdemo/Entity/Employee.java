package com.example.springwebdemo.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empID;
    @NotBlank(message = "Please fill the information")
    private String empName;
    private String empAddress;
    //@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSZ",shape = JsonFormat.Shape.STRING)
    private String empDOB;
/*
    public Employee(){

    }

    public Employee(long empID, String empName, String empAddress, LocalDateTime empDOB) {
        this.empID = empID;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empDOB = empDOB;
    }

    public long getEmpID() {
        return empID;
    }

    public void setEmpID(long empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public LocalDateTime getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOB(LocalDateTime empDOB) {
        this.empDOB = empDOB;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empDOB=" + empDOB +
                '}';
    }

 */
}

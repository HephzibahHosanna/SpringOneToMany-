package com.example.SpringOneToMany.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_contact")
public class EmployeeContact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private Long phoneNo;

    public EmployeeContact() {
    }

    public Integer getId() {
        return id;
    }

    public EmployeeContact setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "EmployeeContact [id=" + id + ", phoneNo=" + phoneNo + "]";
    }
}

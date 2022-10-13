package com.rmt.cloud.rent.commons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/** Customer */
@Entity
@Table(name = "r_customer")
@Data
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String fname;
  private String lname;
  private String email;
  private String zipcode;
  private String gender;
}

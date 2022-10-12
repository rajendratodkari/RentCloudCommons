package com.rmt.cloud.rent.commons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/** Vehicle */
@Entity
@Table(name = "r_vehicle")
@Data
public class Vehicle {

  @Id @GeneratedValue private int id;

  private String make;
  private String model;
  private String engineType;
  private boolean isSedan;
}

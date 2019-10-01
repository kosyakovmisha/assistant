package com.example.assistant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "GVS_hostel")
public class GVSHostel {

    @Id
    @Column(name = "GVS_hostel_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "GVS_hostel_date")
    private Date date;

    @Column(name = "GVS_hostel_time")
    private LocalTime time;

    @Column(name = "GVS_hostel_gcal")
    private BigDecimal gcal;

    @Column(name = "GVS_hostel_gcal_in")
    private BigDecimal gcal_in;

    @Column(name = "GVS_hostel_gcal_out")
    private BigDecimal gcal_out;

    @Column(name = "GVS_hostel_m3_in")
    private BigDecimal m3_in;

    @Column(name = "GVS_hostel_m3_out")
    private BigDecimal m3_out;

    @Column(name = "GVS_hostel_temperature")
    private String temperature;

}

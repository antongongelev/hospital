package ru.hospital.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.hospital.domain.TreatmentType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Prescription {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "treatment_id")
    private Treatment treatment;
    @Enumerated(EnumType.STRING)
    private TreatmentType treatmentType;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private Integer dose;
    private String timePattern;
}

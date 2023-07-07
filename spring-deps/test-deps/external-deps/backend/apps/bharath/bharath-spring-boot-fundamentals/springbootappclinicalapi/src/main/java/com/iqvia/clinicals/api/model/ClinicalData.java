package com.iqvia.clinicals.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "clinicaldata")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClinicalData {
	@Id
	private int id;
	private String componentName;
	private String componentValue;
	private Timestamp measuredDateTime;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", nullable = false)
	@JsonIgnore
	private Patient patient;
}

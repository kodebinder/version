package com.bharath.springdata.patientscheduling;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.springdata.patientscheduling.entities.Appointment;
import com.bharath.springdata.patientscheduling.entities.Doctor;
import com.bharath.springdata.patientscheduling.entities.Insurance;
import com.bharath.springdata.patientscheduling.entities.Patient;
import com.bharath.springdata.patientscheduling.repos.AppointmentRepository;
import com.bharath.springdata.patientscheduling.repos.DoctorRepository;
import com.bharath.springdata.patientscheduling.repos.PatientRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PatientschedulingApplicationTests {

	@Autowired
	DoctorRepository doctorRepository;

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	AppointmentRepository appointmentRepository;

	@Test
	public void test_1_CreateDoctor() {

		List<Doctor> list = new ArrayList<>();
		for (long i = 1; i <= 50; i++) {
			Doctor doctor = new Doctor();
			doctor.setId(i);
			doctor.setFirstName("Bharath");
			doctor.setLastName("Thippireddy");
			doctor.setSpeciality("Heart");

			list.add(doctor);
		}

		doctorRepository.saveAll(list);
	}

	@Test
	public void test_2_CreatePatient() {

		Patient patient = new Patient();
		patient.setId(1L);
		patient.setFirstName("Doug");
		patient.setLastName("Bailey");
		patient.setPhone("123456");

		Insurance insurance = new Insurance();
		insurance.setProviderName("Blue Cross Blue Shield");
		insurance.setCopay(20d);

		patient.setInsurance(insurance);

		Doctor doctor = doctorRepository.findById(1L).get();
		List<Doctor> doctors = Arrays.asList(doctor);
		patient.setDoctors(doctors);

		patientRepository.save(patient);

	}

	@Test
	public void test_3_CreateAppointment() {

		Appointment appointment = new Appointment();
		Timestamp appointmentTime = new Timestamp(new Date().getTime());
		appointment.setId(1L);
		appointment.setAppointmentTime(appointmentTime);
		appointment.setReason("I have a problem");
		appointment.setStarted(true);

		appointment.setPatient(patientRepository.findById(1L).get());
		appointment.setDoctor(doctorRepository.findById(1L).get());

		appointmentRepository.save(appointment);
	}

	@Test
	public void test_4_DeleteAppointment() {
		appointmentRepository.deleteAll();
	}

	@Test
	public void test_5_DeletePatient() {
		patientRepository.deleteAll();
	}

	@Test
	public void test_6_DeleteDoctor() {
		doctorRepository.deleteAll();
	}

}

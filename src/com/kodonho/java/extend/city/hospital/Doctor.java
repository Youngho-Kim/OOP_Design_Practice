package com.kodonho.java.extend.city.hospital;

import com.kodonho.java.extend.city.design.People;

public class Doctor extends People{
	
	public void diagnosis(Patient patient){
		System.out.println(patient.getName() + " 환자를 진찰한다.");
	}
}

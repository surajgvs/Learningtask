package cts.student.selflearningtask.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long studentId;
	private String studentName;
	private String courseName;
}
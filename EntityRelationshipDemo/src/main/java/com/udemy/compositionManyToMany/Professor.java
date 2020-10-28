package com.udemy.compositionManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="Professor")
public class Professor {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int professorId;
	
	@Column(name="professor_name")
	private String professorName;
	
	// mappedBy determines the owner 
	@ManyToMany(mappedBy = "professors", fetch = FetchType.LAZY, cascade = CascadeType.ALL  )
	private List<ResearchProject> projects;
	
	public Professor() {
		this.projects = new ArrayList<ResearchProject>();
	}
	
	public Professor(String professorName) {
		this();
		this.professorName = professorName;
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public List<ResearchProject> getProjects() {
		return projects;
	}

	public void setProjects(List<ResearchProject> projects) {
		this.projects = projects;
	}
	
	public void assignProjectToProfessor(ResearchProject project) {
		this.projects.add(project);
	}
}

package com.talentstream.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class RecuriterSkills {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	 @ManyToOne
	    @JoinColumn(name = "job_id")
	    private Job job;

    public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Column(nullable = false)
    private String skillName;

    @Column(nullable = false)
    private int minimumExperience;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getMinimumExperience() {
		return minimumExperience;
	}

	public void setMinimumExperience(int minimumExperience) {
		this.minimumExperience = minimumExperience;
	}
    
    
}

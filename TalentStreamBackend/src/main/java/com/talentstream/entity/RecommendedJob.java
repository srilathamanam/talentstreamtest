package com.talentstream.entity;

import jakarta.persistence.Entity;

@Entity

public class RecommendedJob {
	private long applicantId;
    private Long jobId;
    private String jobTitle;
    private String companyName;
    private String location;
    private double minSalary;
    private double maxSalary;
 private int minExperience;
 private int maxExperience;

    
	public RecommendedJob(long l, Long jobId, String jobTitle, String companyName, String location,
			double minSalary, double maxSalary,int minExperience,int maxExperience) {
		super();
		this.applicantId =  l;
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.location = location;		
		this.maxSalary = maxSalary;
		this.minExperience=minExperience;
		this.maxExperience=maxExperience;
	}

	public long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;

	}
	public void setJobTitle(String jobTitle) {

		this.jobTitle = jobTitle;

	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public double getMaxSalary() {
		return maxSalary;

	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

}

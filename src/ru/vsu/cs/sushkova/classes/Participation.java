package ru.vsu.cs.sushkova.classes;

public class Participation {

	private int hours;
	private ResearchAssociate researchAssociate;
	private Project project;

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public ResearchAssociate getResearchAssociate() {
		return this.researchAssociate;
	}

	public void setResearchAssociate(ResearchAssociate researchAssociate) {
		this.researchAssociate = researchAssociate;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
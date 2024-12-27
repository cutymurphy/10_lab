package ru.vsu.cs.sushkova.classes;

import java.util.Arrays;

public class Lecturer extends ResearchAssociate {

	private Course[] courses;

	public Lecturer(int ssNo, String name, String fieldOfStudy) {
		super(ssNo, name, fieldOfStudy);
	}

	public Course[] getCourses() {
		return this.courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public void addCourse(Course course) {
        if (this.courses == null) {
            this.courses = new Course[]{course};
        } else {
            for (Course c : this.courses) {
                if (c.getName().equals(course.getName())) {
                    System.out.println("Курс \"" + course.getName() + "\" уже добавлен.");
                    return;
                }
            }
            Course[] newCourses = Arrays.copyOf(this.courses, this.courses.length + 1);
            newCourses[this.courses.length] = course;
            this.courses = newCourses;
        }
    }

	public void removeCourse(Course course) {
        if (this.courses == null || this.courses.length == 0) {
            System.out.println("У преподавателя нет курсов для удаления.");
            return;
        }

        boolean found = false;
        for (Course c : this.courses) {
            if (c.getName().equals(course.getName())) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Курс \"" + course.getName() + "\" не найден.");
            return;
        }

        Course[] newCourses = new Course[this.courses.length - 1];
        int index = 0;
        for (Course c : this.courses) {
            if (!c.getName().equals(course.getName())) {
                newCourses[index++] = c;
            }
        }
        this.courses = newCourses;
    }

}
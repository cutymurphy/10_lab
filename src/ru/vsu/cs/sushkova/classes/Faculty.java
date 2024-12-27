package ru.vsu.cs.sushkova.classes;

import java.util.Arrays;

public class Faculty {

	private String name;
	private Institute[] institutes;

	public Faculty(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Institute[] getInstitutes() {
		return this.institutes;
	}

	public void setInstitutes(Institute[] institutes) {
		this.institutes = institutes;
	}

	public void addInstitute(Institute institute) {
        if (this.institutes == null) {
            this.institutes = new Institute[]{institute};
        } else {
            for (Institute inst : this.institutes) {
                if (inst.getName().equals(institute.getName())) {
                    System.out.println("Направление \"" + institute.getName() + "\" уже добавлено.");
                    return;
                }
            }
            Institute[] newInstitutes = Arrays.copyOf(this.institutes, this.institutes.length + 1);
            newInstitutes[this.institutes.length] = institute;
            this.institutes = newInstitutes;
        }
    }

    public void removeInstitute(Institute institute) {
        if (this.institutes == null || this.institutes.length == 0) {
            System.out.println("На факультете нет направлений для удаления.");
            return;
        }

        boolean found = false;
        for (Institute inst : this.institutes) {
            if (inst.getName().equals(institute.getName())) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Направление \"" + institute.getName() + "\" не найдено.");
            return;
        }

        Institute[] newInstitutes = new Institute[this.institutes.length - 1];
        int index = 0;
        for (Institute inst : this.institutes) {
            if (!inst.getName().equals(institute.getName())) {
                newInstitutes[index++] = inst;
            }
        }
        this.institutes = newInstitutes;
    }
}
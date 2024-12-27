package ru.vsu.cs.sushkova;

import ru.vsu.cs.sushkova.classes.AdministrativeEmployee;
import ru.vsu.cs.sushkova.classes.Course;
import ru.vsu.cs.sushkova.classes.Faculty;
import ru.vsu.cs.sushkova.classes.Institute;
import ru.vsu.cs.sushkova.classes.Lecturer;
import ru.vsu.cs.sushkova.classes.Project;
import ru.vsu.cs.sushkova.classes.ResearchAssociate;


public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        
        Institute toizi = new Institute("ТОиЗИ", "297");
        Institute is = new Institute("ИС", "387");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("ИТУ", "312п");
        Institute piit = new Institute("ПиИТ", "380");
        fkn.setInstitutes(new Institute[]{toizi, is, tst, itu, piit});
        fkn.addInstitute(is);
        
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Сирота Александр Анатольевич",
                "защита информации");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Митрофанова Елена Юрьевна",
                "моделирование систем");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Иванков Александр Юрьевич",
                "распознавание образов");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "Акимов Алексей Викторович",
                "технологии обработки информации");
        toizi.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4});
        
        Project project1 = new Project();
        project1.setName("Разработка системы защиты данных");
        Project project2 = new Project();
        project2.setName("Исследование алгоритмов машинного обучения");
        emp1.setProjects(new Project[]{project1, project2});
        
        Institute[] fkn_institutes = fkn.getInstitutes();
        
        AdministrativeEmployee admin = new AdministrativeEmployee();
        admin.setName("Кузнецова Анна Сергеевна");
        admin.setEmail("admin@vsu.ru");
        
        Lecturer lecturer = new Lecturer(1234, "Гаршина Вероника Викторовна", "интеллектуальные системы");
        
        Course course1 = new Course();
        course1.setName("интеллектуальные интерфейсы");
        Course course2 = new Course();
        course2.setName("компьютерная линвистика");

        lecturer.addCourse(course1);
        lecturer.addCourse(course2);
        lecturer.addCourse(course1);

        System.out.println("\nАдминистративные сотрудники:");
        System.out.println(admin.getName() + " (email: " + admin.getEmail() + ")");
       
        System.out.println("\nКафедры на факультете " + fkn.getName() + ":");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println((i + 1) + ". " + fkn_institutes[i].getName() + " (обращаться в кабинет " + fkn_institutes[i].getAddress() + ")");
        }
        
        ResearchAssociate[] toizi_employees = toizi.getEmployees();
        System.out.println("\nПодробная информация о сотрудниках кафедры " + toizi.getName() + ":");
        for (int i = 0; i < toizi_employees.length; i++) {
            ResearchAssociate emp = toizi_employees[i];
            System.out.println((i + 1) + ". " + emp.getName() + " (область исследований: " + emp.getFieldOfStudy() + ")");
        }

        System.out.println("\nПроекты сотрудников кафедры " + toizi.getName() + ":");
        for (ResearchAssociate emp : toizi.getEmployees()) {
            System.out.println(emp.getName() + " участвует в проектах:");
            if (emp.getProjects() != null) {
                for (Project project : emp.getProjects()) {
                    System.out.println("- " + project.getName());
                }
            } else {
                System.out.println("- Нет текущих проектов");
            }
        }
        
        System.out.println("\nКурсы, которые ведет лектор " + lecturer.getName() + ":");
        for (Course c : lecturer.getCourses()) {
            System.out.println("- " + c.getName());
        }
    }
}

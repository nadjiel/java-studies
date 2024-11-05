package dev.java_studies.bootcamping.main;

import dev.java_studies.bootcamping.service.Bootcamp;
import dev.java_studies.bootcamping.service.Course;
import dev.java_studies.bootcamping.service.Dev;
import dev.java_studies.bootcamping.service.Mentoring;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Bootcamp claroBootcamp = new Bootcamp(
                "Claro Bootcamp",
                "Java and Spring bootcamp",
                LocalDate.now().plusMonths(3)
        );

        claroBootcamp.getActivities().add(new Course(
                "OOP",
                "Object Oriented Programming",
                3,
                150
        ));
        claroBootcamp.getActivities().add(new Course(
                "Java Syntax",
                "From basics to advanced Java syntax",
                4,
                240
        ));
        claroBootcamp.getActivities().add(new Mentoring(
                "LinkedIn Self Promotion",
                "Reach 3 times more people on LinkedIn with these tips",
                LocalDate.of(2024, 12, 25),
                333
        ));

        System.out.print("Bootcamp created: ");
        System.out.println(claroBootcamp);

        System.out.println();

        Dev nadjiel = new Dev("Nadjiel");
        Dev peter = new Dev("Peter");
        Dev naomi = new Dev("Naomi");

        System.out.println("Dev " + nadjiel + " created!");
        System.out.println("Dev " + peter + " created!");
        System.out.println("Dev " + naomi + " created!");

        System.out.println();

        nadjiel.subscribeTo(claroBootcamp);
        peter.subscribeTo(claroBootcamp);
        naomi.subscribeTo(claroBootcamp);

        System.out.printf("Subscribed %s to %s%n", nadjiel, claroBootcamp.getName());
        System.out.printf("Subscribed %s to %s%n", peter, claroBootcamp.getName());
        System.out.printf("Subscribed %s to %s%n", naomi, claroBootcamp.getName());

        System.out.println();

        System.out.printf("%s now has %s as devs%n", claroBootcamp.getName(), claroBootcamp.getDevs());

        System.out.println();

        System.out.printf("%s's subscribed activities are: %s%n", nadjiel, nadjiel.getSubscribedActivities());
        System.out.printf("And %s's completed activities are: %s%n", nadjiel, nadjiel.getCompletedActivities());

        System.out.println();

        nadjiel.progress();

        System.out.printf("%s progressed and now his subscribed activities are: %s%n", nadjiel, nadjiel.getSubscribedActivities());
        System.out.printf("And his completed activities are: %s", nadjiel.getCompletedActivities());
    }

}

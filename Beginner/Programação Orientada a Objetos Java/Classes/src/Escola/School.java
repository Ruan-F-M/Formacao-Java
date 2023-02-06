package Escola;

import Enums.Enum.Sex;
import Enums.Enum.Color;
import Estudante.Student;

public class School {
    public void alunos() {
        Student student1 = new Student();
        student1.setName("John");
        student1.setAge(12);
        student1.setColor(Color.FAIR);
        student1.setSex(Sex.MALE);

        System.out.println("Nome: " + student1.getName());
        System.out.println("Idade: " + student1.getAge());
        System.out.println("Cor: " + student1.getColor());
        System.out.println("Sexo: " + student1.getSex());

        Student student2 = new Student();
        student2.setName("Sophia");
        student2.setAge(10);
        student2.setColor(Color.FAIR);
        student2.setSex(Sex.FEMALE);

        System.out.println("Nome: " + student2.getName());
        System.out.println("Idade: " + student2.getAge());
        System.out.println("Cor: " + student2.getColor());
        System.out.println("Sexo: " + student2.getSex());

        Student student3 = new Student();
        student3.setName("Lily");
        student3.setAge(11);
        student3.setColor(Color.DARK);
        student3.setSex(Sex.FEMALE);

        System.out.println("Nome: " + student3.getName());
        System.out.println("Idade: " + student3.getAge());
        System.out.println("Cor: " + student3.getColor());
        System.out.println("Sexo: " + student3.getSex());
    }
}
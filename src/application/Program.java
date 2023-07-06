package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();   // LENDO QUANTIDADE DE FUNCIONARIOS E GUARDANDO EM UMA VARIAVEL

        // FOR PARA LER REPETIDAMENTE A QUANTIDADE DE n FUNCIONARIOS
        for (int i=1; i<=n; i++) {
            System.out.println("Employee #" + i + " Data:");        // DADOS DO FUNCIONARIO
            System.out.print("Outsourced (y/n) ? " );               // É TERCEIRIZADO OU NÃO?
            char ch = sc.next().charAt(0);                      // RECEBENDO A LEITURA / VARIAVEL CHAR
            System.out.print("Name: ");
            sc.nextLine();                      // QUEBRA DE LINHA
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();          // PEDINDO PARA O FUNCIONARIO DIGITAR A TAXA
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));      // INSTANCIANDO E ADC FUNCIONARIO
            }
            else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        // PERCORRE A LISTA MANDANDO IMPRIMIR O NOME E O PAGAMENTO DE CADA UM
        for (Employee emp : list) {    // PARA CADA FUNCIONARIO emp NA MINHA LISTA, VOU IMPRIMIR NA TELA...
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));  // NAME COM PAGAMENTO DO FUNCIONARIO
        }

        sc.close();
    }
}
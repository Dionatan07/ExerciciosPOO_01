package application;

import entities.Personal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the name: ");
        String name = teclado.nextLine();

        System.out.print("Enter birth date: ");
        Date birthDate = sdf.parse(teclado.next());

        System.out.print("Enter height: ");
        double height = teclado.nextDouble();

        Personal p = new Personal(name, birthDate, height);

        System.out.println(p);










    }
}

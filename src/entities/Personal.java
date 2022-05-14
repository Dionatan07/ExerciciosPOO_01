package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Personal {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private Date birthDate;
    private Double height;

    public Personal(String name, Date birthDate, Double height) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public int calcAge() {
        Calendar cal = Calendar.getInstance();

        int currentYear = cal.get(Calendar.YEAR);
        cal.setTime(birthDate);
        int birthYear = cal.get(Calendar.YEAR);

        int age = currentYear - birthYear;
        return age;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Nome: ");
        sb.append(name + "\n");
        sb.append("Data de Nascimento: ");
        sb.append(sdf.format(birthDate) + "\n");
        sb.append("Altura: ");
        sb.append(String.format("%.2f%n", height));
        sb.append("Idade: ");
        sb.append(calcAge());
        return sb.toString();
    }

}

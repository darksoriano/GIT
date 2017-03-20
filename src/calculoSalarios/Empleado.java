
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoSalarios;
/* comentado por Antonio Jose Soriano Perez*/
/**
 *
 * @author MANUEL
 */
public class Empleado {
/* Declaración de variables privadas de la clase*/
    private String NombreDelEmpleado;
    private final int hourlyRate = 30;
    private int RatioHora;
 /* Metodo que visualiza el mensaje "Calculando el salario..."*/   
    public void printMessage()
    { 
        System.out.println("Calculando el salario...");
    }
/* Método que calcula el salario cuando no hay bonus */
    public int calculoSalario()
    {
        printMessage();
        int staffPay;
        staffPay = hourlyRate * RatioHora;
        if (RatioHora > 0)
            return staffPay;
        else
            return -1;
    }
    /* Método que calcula es salario cuando hay bonus*/
    public int calculoSalario(int bonus, int allowance)
    {
        printMessage();
        if (RatioHora>0)
            return RatioHora * hourlyRate + bonus + allowance;
        else
            return 0;
    }
   /* Mértodo setter que verifica que horas trabajadas es mayor que cero */
    public void setHoursWorked(int hours)
    {
        if (hours > 0)
            RatioHora = hours;
        else {
            System.out.println("-Error: HoursWorked Cannot be Smaller than zero");
            System.out.println("-Error: HoursWorked is not updated");
            }          
    }
    /* Método getter para asignar valores a horas trabajadas */
    public int getHoursWorked()
    {
        return RatioHora;
    }
    /* Constructores crean  objetos Staff */
    public Empleado(String name)
    {
        String NombreDelEmpleado = name;
        System.out.println("\n"+ NombreDelEmpleado);
        System.out.println("-------------------------");
    }
    public Empleado(String firstName, String lastName)
    {
        String NombreDelEmpleado = firstName + lastName;
        System.out.println("\n"+NombreDelEmpleado);
        System.out.println("-------------------------------");
    }
    }

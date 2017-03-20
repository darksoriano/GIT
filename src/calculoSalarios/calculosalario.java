/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoSalarios;

/**
 *
 * @author MANUEL
 */
public class calculosalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado staff1 = new Empleado("-Peter");
        staff1.setHoursWorked(160);
        int pay = staff1.calculoSalario(1000,400);
        System.out.println("pay= " + pay);

        Empleado staff2 = new Empleado("-Jane","Lee");
        staff2.setHoursWorked(160);
        pay=staff2.calculoSalario();
        System.out.println("Pay = "+ pay);
        
        System.out.println("\n\nUpdating Jane's hours worked to -10");
        staff2.setHoursWorked(-10);
        System.out.println("\nHours Worked = "+ staff2.getHoursWorked());
        pay = staff2.calculoSalario();
        System.out.println("Pay =" +pay);
        
        
        

        // TODO code application logic here
    }
    
}

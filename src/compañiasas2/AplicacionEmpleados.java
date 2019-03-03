
package compañiasas2;

import compañiasas.Empleados;
import javax.swing.JOptionPane;

public class AplicacionEmpleados {
    public static void main(String[] args) {
        
        Empleados empleado1 = new Empleados("Laura Tatiana Ramos Villanueva", 19, "Calle 10 No. 4-61", "3115836966");
        Empleados empleado2 = new Empleados("Johann Nicolás Nieto Cárdenas", 24,  "Carrera 8 No. 4A-22", "3105789672");
        Empleados empleado3 = new Empleados("Ana Carolina Villanueva Posada", 35, "Carrera 8a No. 7 - 88/94 ", "3232328702");
        Empleados empleado4 = new Empleados("Harold Alejandro Villanueva Manrrique", 38, "Calle 25 No. 4 - 38 piso 2 ", "3005876963");
        Empleados empleado5 = new Empleados("Ana Maria Nieto Ramos", 34, "Carrera 9  No. 7 - 341", "3123456644");
          
        int numEmpl;
        numEmpl=Integer.parseInt(JOptionPane.showInputDialog("Querid@ usuario, Digite un numero de 1 a 5 correspondiente \nal empleado del cual desea ver sus características:"));
                
        switch(numEmpl){
            case 1: JOptionPane.showMessageDialog(null,"EMPLEADO 1: \n*NOMBRE: "+ empleado1.getNombre()+"\n*EDAD: "+empleado1.getEdad()+"\n*DIRECCIÓN: "+empleado1.getDireccion()+"\n*TELÉFONO: "+ empleado1.getTelefono());
            break;
            case 2: JOptionPane.showMessageDialog(null,"EMPLEADO 2: \n*NOMBRE: "+ empleado2.getNombre()+"\n*EDAD: "+empleado2.getEdad()+"\n*DIRECCIÓN: "+empleado2.getDireccion()+"\n*TELÉFONO: "+ empleado2.getTelefono());
            break;
            case 3: JOptionPane.showMessageDialog(null,"EMPLEADO 3: \n*NOMBRE: "+ empleado3.getNombre()+"\n*EDAD: "+empleado3.getEdad()+"\n*DIRECCIÓN: "+empleado3.getDireccion()+"\n*TELÉFONO: "+ empleado3.getTelefono());
            break;
            case 4: JOptionPane.showMessageDialog(null,"EMPLEADO 4: \n*NOMBRE: "+ empleado4.getNombre()+"\n*EDAD: "+empleado4.getEdad()+"\n*DIRECCIÓN: "+empleado4.getDireccion()+"\n*TELÉFONO: "+ empleado4.getTelefono());
            break;
            case 5: JOptionPane.showMessageDialog(null,"EMPLEADO 5: \n*NOMBRE: "+ empleado5.getNombre()+"\n*EDAD: "+empleado5.getEdad()+"\n*DIRECCIÓN: "+empleado5.getDireccion()+"\n*"
                    + ""
                    + "TELÉFONO: "+ empleado5.getTelefono());
            break;
            default: JOptionPane.showMessageDialog(null, "NÚMERO DE EMPLEADO NO DISPONIBLE...");
            
        }   
    
    
    
    }
 
}

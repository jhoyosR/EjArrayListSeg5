package shiftEj5;

import javax.swing.*;

public class ShiftMain {
    public static void main(String[] args) {
        ShiftDAO dao = new ShiftDAO();

        String shift1StartTime = JOptionPane.showInputDialog(null,"Start Time of Shift 1: ");
        String shift1EndTime = JOptionPane.showInputDialog(null,"End Time of Shift 1: ");
        String shift1Description = JOptionPane.showInputDialog(null,"Description of Shift 1: ");
        Shift shift1 = new Shift(shift1StartTime, shift1EndTime, shift1Description);

        String shift2StartTime = JOptionPane.showInputDialog(null,"Start Time of Shift 2: ");
        String shift2EndTime = JOptionPane.showInputDialog(null,"End Time of Shift 2: ");
        String shift2Description = JOptionPane.showInputDialog(null,"Description of Shift 2: ");
        Shift shift2 = new Shift(shift2StartTime, shift2EndTime, shift2Description);

        dao.save(shift1);
        dao.save(shift2);

        System.out.println("Shifts assigned: ");
        dao.showShifts();

    }
}

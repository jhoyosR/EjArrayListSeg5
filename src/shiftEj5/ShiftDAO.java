package shiftEj5;

import java.util.ArrayList;

public class ShiftDAO {
    ArrayList<Shift> shifts;

    public ShiftDAO() {
        shifts = new ArrayList<>();
    }

    void save (Shift shift){
        shifts.add(shift);
    }

    public void showShifts(){
        for (Shift shift : shifts){
            System.out.println(shift);
        }
    }
}

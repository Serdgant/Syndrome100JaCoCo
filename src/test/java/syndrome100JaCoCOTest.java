import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Syndrome100JaCoCOTest {

    @Test
    void shoudFindMax() {
        syndrome100JaCoCO service = new syndrome100JaCoCO();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void shoudFindMaxaa(){
        syndrome100JaCoCO service= new syndrome100JaCoCO();
        long[] incomesInBillions ={-12, -5,-8, -8, -24, -3, 0, -6, -4, -11, -24};
        long expected=0;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected,actual);
    }



}
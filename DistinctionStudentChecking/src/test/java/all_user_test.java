import org.junit.Test;

import static org.junit.Assert.*;

public class all_user_test {

    @Test
    public void R1allusersTestCase() {
        Student student = new Student(120, 3.0);
        assertEquals(output.InvalidInput, student.checkDistinction());
    }

    @Test
    public void R2allusersTestCase() {
        Student student = new Student(90, 3.4);
        assertEquals(output.Distinction, student.checkDistinction());
    }

    @Test
    public void R3allusersTestCase() {
        Student student = new Student(75, 3.6);
        assertEquals(output.NotDistinction, student.checkDistinction());
    }

}
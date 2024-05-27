package ontrack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class UnitTest {
	private inbox inbox;
    private ByteArrayOutputStream outContent;

    task task1 = new task("1", LocalDate.of(2024,12,31), "Completed");
    task task2 = new task("2", LocalDate.of(2024,11,30), "Not Started");
    
    @Before
    public void setUp() {
        inbox = new inbox();
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAddTask() {
        int size = inbox.getTasks().size(); 
		inbox.Add(task1); 
		
		assertEquals(size + 1, inbox.getTasks().size()); 
		assertEquals(task1, inbox.getTasks().get(size)); 
    }

    @Test
    public void testRemoveTask() {
    	inbox.Add(task1); 
    	inbox.Add(task2); 
        int size = inbox.getTasks().size(); 
		inbox.Remove(task2); 
	
		assertEquals(size - 1, inbox.getTasks().size()); 
		assertFalse(inbox.getTasks().contains(task2)); 
    }

    @Test
    public void testShowInboxEmpty() {
        inbox.Show();
        assertEquals("None\n", outContent.toString());
    }

    @Test
    public void testShowInboxNonEmpty() {
    	task tk1 = new task("1", LocalDate.of(2024,12,31), "Completed");
        task tk2 = new task("2", LocalDate.of(2024,11,30), "Not Started");
       
        int size = inbox.getTasks().size(); 
        inbox.Add(tk1);
        inbox.Add(tk2);
        inbox.Show();
		
		assertEquals(size + 2, inbox.getTasks().size()); 
		assertTrue(inbox.getTasks().contains(tk1)); 
		assertTrue(inbox.getTasks().contains(tk2)); 
    }

}

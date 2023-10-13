
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ExerciseManagementTest {
    ExerciseManagement management = new ExerciseManagement();
    
    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning(){
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne(){
        management.add("Write a test.");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList(){
        management.add("Write a test.");
        assertTrue(management.exerciseList().contains("Write a test.")); 
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
    
    @Test
    public void removedExerciseIsNotInTheList(){
        management.add("New Exercise");
        management.remove("New Exercise");
        assertFalse(management.exerciseList().contains("New Exercise"));
    }
    

}

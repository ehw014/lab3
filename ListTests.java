import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> testList = new ArrayList<>();
        testList.add("Apple");
        testList.add("dog");
        //testList.add("Peach");


        List<String> checkList = ListExamples.filter(testList, new DogChecker());
        assertEquals(testList, checkList);
    }
    @Test 
    public void testMerge() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("a");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        List<String> merged = ListExamples.merge(list1, list2);
        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("a");
        testList.add("b");
        assertEquals(merged,testList);
    }
}

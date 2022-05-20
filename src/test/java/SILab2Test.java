import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private ArrayList<String> createList (String[] elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatement() {
        IllegalArgumentException exception;

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        String[] arg = {"0","#","#","0","0"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arg));

        ArrayList<String> finalArrayList = arrayList;

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(finalArrayList));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        String[] result = new String[]{"2", "#", "2", "#", "4", "#", "#", "#", "2"};
        arrayList = createList(result);

        String[] startingArr = {"0","#","0","#","0","#","#","#","0"};
        ArrayList<String> startList = new ArrayList<>(Arrays.asList(startingArr));

        assertEquals(arrayList, SILab2.function(startList));
    }

    @Test
    void everyBranch(){
        IllegalArgumentException exception;

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(new ArrayList<>()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        String[] start = {"0","#","#","0","0"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(start));

        ArrayList<String> finalArrayList = arrayList;

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(finalArrayList));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        start = new String[]{"0","0","0","#","0","#","0","#","0"};
        ArrayList<String> startingList = new ArrayList<>(Arrays.asList(start));

        String[] result = {"1","0","1","#","3","#","2","#","2"};
        arrayList = new ArrayList<>(Arrays.asList(result));

        assertEquals(arrayList, SILab2.function(startingList));
    }
}
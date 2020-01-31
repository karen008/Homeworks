package MapHomework;

import java.util.ArrayList;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        ArrayList<MapStudent> arrayListOfMapStudents = new ArrayList<>() {
            {
                add(new MapStudent("Diana", "Asatryan", 22, "0988111111", "Math"));
                add(new MapStudent("Diana", "Asatryan", 32, "0922111111", "Physics"));
                add(new MapStudent("Diana", "Asatryan", 21, "0938111111", "Philosophy"));
                add(new MapStudent("Karen", "Balayan", 12, "097777777", "Math"));
                add(new MapStudent("Karen", "Balayan", 23, "098888811", "Philosophy"));
                add(new MapStudent("Elen", "Mirzoyan", 12, "093333333", "English"));
            }

        };

        Map<String, Integer> studentsMap = MapStudentsService.getStudentsMap(arrayListOfMapStudents);
        for (Map.Entry mapElement : studentsMap.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }
        System.out.println();
        MapStudentsService.getNumberOfStudentsInEachFaculty(arrayListOfMapStudents);
        System.out.println();
    }
}

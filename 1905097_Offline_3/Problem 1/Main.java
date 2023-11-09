import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int id = 0;
        List<CrewMateInterface> crewList = new ArrayList<>();

        CrewMateInterface c1 = new CrewMate(++id, "a");
        CrewMateInterface c2 = new CrewMate(++id, "b");
        CrewMateInterface c3 = new CrewMate(++id, "c");
        crewList.add(c1);
        crewList.add(c2);
        crewList.add(c3);

        SpaceMonster m1 = new SpaceMonster(++id, "x");
        SpaceMonster m2 = new SpaceMonster(++id, "y");
        SpaceMonster m3 = new SpaceMonster(++id, "z");
        CrewMateInterface c4 = new CrewMateAdapter(m1);
        CrewMateInterface c5 = new CrewMateAdapter(m2);
        CrewMateInterface c6 = new CrewMateAdapter(m3);
        crewList.add(c4);
        crewList.add(c5);
        crewList.add(c6);

        for(CrewMateInterface c: crewList){
            c.studyInterstellarObjects();
            c.doMaintenanceTasks();
        }

    }
}

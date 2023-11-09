public class CrewMateAdapter implements CrewMateInterface{

    SpaceMonster spaceMonster;

    public CrewMateAdapter(SpaceMonster spaceMonster) {
        this.spaceMonster = spaceMonster;
    }

    public SpaceMonster getSpaceMonster() {
        return spaceMonster;
    }

    public void setSpaceMonster(SpaceMonster spaceMonster) {
        this.spaceMonster = spaceMonster;
    }

    @Override
    public void studyInterstellarObjects() {
        spaceMonster.poisoningCrewMates();
    }

    @Override
    public void doMaintenanceTasks() {
        spaceMonster.damagingSpaceship();
    }
}

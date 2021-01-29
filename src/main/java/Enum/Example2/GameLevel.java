package Enum.Example2;

//Represent specific ranged predefined data
public enum GameLevel {
    //If playing EASY level, have 300HP and have golden armor
    EASY(300, "Golden"),
    MEDIUM(200, "Iron"),
    HARD(100, "wooden"),
    HARDCORE(50, "nothing");


    private int healthPoints;
    private String armourType;

    GameLevel(int healthPoints, String armourType) {
        this.healthPoints = healthPoints;
        this.armourType = armourType;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getArmourType() {
        return armourType;
    }
}

package sample;

public class Habilidad {

    public int attack;
    public String attackName;
    public String type;


    public Habilidad(int attack, String attackName, String type) {
        this.attack = attack;
        this.attackName = attackName;
        type = type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        type = type;
    }
}

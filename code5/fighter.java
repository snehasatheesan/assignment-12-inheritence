class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    public String toString(){
       return "Fighter is a Warrior";
    }
    @Override
    public boolean isVulnerable(){
        return false;
    }
    @Override
    public int getDamagePoints(Fighter w) {
        if(w.isVulnerable())
            return 10;
        else
            return 6;
    }
}

class Wizard extends Fighter{
    boolean spell=false;
    public String  toString(){
        return "Fighter is a Wizard";
    }
    public void prepareSpell(){
        spell=true;
    }
    @Override
    public boolean isVulnerable(){
        return !spell;
    }
    @Override
    public int getDamagePoints(Fighter w){
        if(isVulnerable())
            return 3;
        else
            return 12;
    }
}

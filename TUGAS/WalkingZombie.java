package TUGAS;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1 -> health += health * 0.2; // Tambah 20%
            case 2 -> health += health * 0.3; // Tambah 30%
            case 3 -> health += health * 0.4; // Tambah 40%
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.02; // Kurangi 2% dari sisa health
        if (health < 0) health = 0; // Pastikan health tidak negatif
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }
}





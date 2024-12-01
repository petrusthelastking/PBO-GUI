package TUGAS;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1 -> health += health * 0.3; // Tambah 30%
            case 2 -> health += health * 0.4; // Tambah 40%
            case 3 -> health += health * 0.5; // Tambah 50%
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.01; // Kurangi 1% dari sisa health
        if (health < 0) health = 0; // Pastikan health tidak negatif
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}






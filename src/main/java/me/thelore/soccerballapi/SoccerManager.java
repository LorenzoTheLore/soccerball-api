package me.thelore.soccerballapi;

import me.thelore.soccerball.soccer.Ball;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;

public interface SoccerManager {
    public Ball getBall(Entity entity);
    public Ball spawnBall(Location location, Material material);
    public void removeBall(Ball ball);
}

package me.thelore.soccerballapi.events;

import me.thelore.soccerball.soccer.Ball;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BallLandEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();

    private Ball ball;

    public BallLandEvent(Ball ball) {
        this.ball = ball;
    }

    public Ball getBall() {
        return ball;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}

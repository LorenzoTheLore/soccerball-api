package me.thelore.soccerballapi.events;

import me.thelore.soccerball.soccer.Ball;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BallKickEvent extends Event {
    private static final HandlerList handlerList = new HandlerList();

    private Ball ball;
    private Player player;

    public BallKickEvent(Ball ball, Player player) {
        this.ball = ball;
        this.player = player;
    }

    public Ball getBall() {
        return ball;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}

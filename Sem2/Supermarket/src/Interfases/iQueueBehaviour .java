package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(Actor actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}
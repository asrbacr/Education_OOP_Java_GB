package Interfaces;

import Classes.Actor;

/**
 * Возврат товара
 */
public interface iReturnOrder {
    void purchasceReturn(Actor actor);
    boolean goodsCheck();
    void productApproved(Actor actor);

}
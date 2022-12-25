package fr.univnantes.alma.core.ressource;

import org.springframework.lang.NonNull;

/**
 * Interface representing a resource
 */
public interface Resource {

    /**
     * Gets the name
     *
     * @return the name
     */
    @NonNull String getName();

    /**
     * Gets the amount
     *
     * @return the amount
     */
    int getAmount();

    /**
     * Increases the resource amount
     *
     * @param amount the increases amount
     */
    void increaseAmount(int amount);

    /**
     * Decreases the resource amount
     *
     * @param amount the decrease amount
     */
    void decreaseAmount(int amount);


}
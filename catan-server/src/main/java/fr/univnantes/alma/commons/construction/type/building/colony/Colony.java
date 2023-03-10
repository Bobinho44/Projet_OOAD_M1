package fr.univnantes.alma.commons.construction.type.building.colony;

import fr.univnantes.alma.core.player.IPlayer;
import fr.univnantes.alma.core.construction.type.Building;
import org.springframework.lang.NonNull;

/**
 * Implementation of a building: colony
 */
public class Colony extends Building {

    /**
     * Creates a new colony
     *
     * @param owner the owner
     */
    public Colony(@NonNull IPlayer owner) {
        super(owner);
    }

}
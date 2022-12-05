package fr.univnantes.alma.commons.territory.type;

import fr.univnantes.alma.commons.annotation.TerritoryAmount;
import fr.univnantes.alma.commons.resource.type.OreResource;
import fr.univnantes.alma.commons.territory.TerritoryType;

@TerritoryAmount(3)
public class MountainTerritory extends TerritoryType {

    public MountainTerritory() {
        super(new OreResource());
    }

}
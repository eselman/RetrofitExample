package com.android.training.retrofitexample.entities;

/**
 * Created by eselman on 08/03/2017.
 */

public class Ability {
    private int slot;
    private boolean isHidden;
    private AbilityDetails ability;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public AbilityDetails getAbility() {
        return ability;
    }

    public void setAbility(AbilityDetails ability) {
        this.ability = ability;
    }
}

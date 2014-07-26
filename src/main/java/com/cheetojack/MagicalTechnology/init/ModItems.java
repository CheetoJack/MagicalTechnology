package com.cheetojack.MagicalTechnology.init;

import com.cheetojack.MagicalTechnology.item.ItemMT;
import com.cheetojack.MagicalTechnology.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Jack on 7/26/2014.
 */
public class ModItems {
    public static final ItemMT mapleLeaf = new ItemMapleLeaf();

    public static void init(){
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}

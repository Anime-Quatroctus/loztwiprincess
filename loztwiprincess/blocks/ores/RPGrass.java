package com.crafter6789.loztwiprincess.blocks.ores;

import java.util.ArrayList;
import com.crafter6789.loztwiprincess.item.MItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RPGrass extends BlockBush {

    public RPGrass(String unlocalizedName, Material material) {
        super(material);
    }
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        
        
        if (world.rand.nextFloat() < 0.5F)
        	{
            drops.add(new ItemStack(MItems.Rupee, world.rand.nextInt(3) + 1, 0));
            }
        	else
        		{
        			if (world.rand.nextFloat() < 0.7F)
        				{
        		        drops.add(new ItemStack(MItems.Rupee, world.rand.nextInt(2) + 1, 1));
        				}
        				else
        					{
            		        drops.add(new ItemStack(MItems.Rupee, world.rand.nextInt(1) + 1, 2));
        					}
        		}
        
        //TODO add specialized drops for unlockable items
        
        return drops;
    }
}

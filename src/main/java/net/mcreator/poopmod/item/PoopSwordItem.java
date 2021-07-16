
package net.mcreator.poopmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.poopmod.itemgroup.PoopmodItemGroup;
import net.mcreator.poopmod.PoopModModElements;

@PoopModModElements.ModElement.Tag
public class PoopSwordItem extends PoopModModElements.ModElement {
	@ObjectHolder("poop_mod:poop_sword")
	public static final Item block = null;
	public PoopSwordItem(PoopModModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 125;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PoopItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(PoopmodItemGroup.tab)) {
		}.setRegistryName("poop_sword"));
	}
}

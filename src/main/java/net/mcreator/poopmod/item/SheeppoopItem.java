
package net.mcreator.poopmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.poopmod.itemgroup.PoopmodItemGroup;
import net.mcreator.poopmod.PoopModModElements;

@PoopModModElements.ModElement.Tag
public class SheeppoopItem extends PoopModModElements.ModElement {
	@ObjectHolder("poop_mod:sheeppoop")
	public static final Item block = null;
	public SheeppoopItem(PoopModModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(PoopmodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(-20).saturation(0.3f).build()));
			setRegistryName("sheeppoop");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}

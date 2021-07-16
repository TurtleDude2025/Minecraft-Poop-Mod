
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
public class PoopdrinkItem extends PoopModModElements.ModElement {
	@ObjectHolder("poop_mod:poopdrink")
	public static final Item block = null;
	public PoopdrinkItem(PoopModModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(PoopmodItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(-20).saturation(0.3f).build()));
			setRegistryName("poopdrink");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}
	}
}

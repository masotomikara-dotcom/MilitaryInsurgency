package me.fryantit.militaryinsurgency.armor;

import me.fryantit.militaryinsurgency.item.MilitaryItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum MilitaryArmorMaterials implements ArmorMaterial {
    // Defense: [Boots, Leggings, Chestplate, Helmet]
    HARDENED_STEEL("hardened_steel", 17, new int[]{3, 6, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> Ingredient.ofItems(MilitaryItems.HARDENED_STEEL_PLATE)),
    KEVLAR("kevlar", 35, new int[]{3, 7, 9, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2.5F, 0.05F, () -> Ingredient.ofItems(MilitaryItems.KEVLAR_MESH)),
    TITANIUM("titanium", 40, new int[]{4, 7, 9, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.5F, 0.1F, () -> Ingredient.ofItems(MilitaryItems.TITANIUM_INGOT)),
    CARBON_FIBER("carbon_fiber", 37, new int[]{4, 8, 10, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.15F, () -> Ingredient.ofItems(MilitaryItems.CARBON_FIBER_SHEET));

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    MilitaryArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<>(repairIngredientSupplier);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return "militaryinsurgency:" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
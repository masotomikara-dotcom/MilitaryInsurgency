package me.fryantit.militaryinsurgency.armor;

import me.fryantit.militaryinsurgency.MilitaryInsurgencyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MilitaryArmorItems {
    public static final Item HARDENED_STEEL_HELMET = registerArmor("hardened_steel_helmet", MilitaryArmorMaterials.HARDENED_STEEL, EquipmentSlot.HEAD);
    public static final Item HARDENED_STEEL_CHESTPLATE = registerArmor("hardened_steel_chestplate", MilitaryArmorMaterials.HARDENED_STEEL, EquipmentSlot.CHEST);
    public static final Item HARDENED_STEEL_LEGGINGS = registerArmor("hardened_steel_leggings", MilitaryArmorMaterials.HARDENED_STEEL, EquipmentSlot.LEGS);
    public static final Item HARDENED_STEEL_BOOTS = registerArmor("hardened_steel_boots", MilitaryArmorMaterials.HARDENED_STEEL, EquipmentSlot.FEET);
    public static final Item KEVLAR_HELMET = registerArmor("kevlar_helmet", MilitaryArmorMaterials.KEVLAR, EquipmentSlot.HEAD);
    public static final Item KEVLAR_CHESTPLATE = registerArmor("kevlar_chestplate", MilitaryArmorMaterials.KEVLAR, EquipmentSlot.CHEST);
    public static final Item KEVLAR_LEGGINGS = registerArmor("kevlar_leggings", MilitaryArmorMaterials.KEVLAR, EquipmentSlot.LEGS);
    public static final Item KEVLAR_BOOTS = registerArmor("kevlar_boots", MilitaryArmorMaterials.KEVLAR, EquipmentSlot.FEET);
    public static final Item TITANIUM_HELMET = registerArmor("titanium_helmet", MilitaryArmorMaterials.TITANIUM, EquipmentSlot.HEAD);
    public static final Item TITANIUM_CHESTPLATE = registerArmor("titanium_chestplate", MilitaryArmorMaterials.TITANIUM, EquipmentSlot.CHEST);
    public static final Item TITANIUM_LEGGINGS = registerArmor("titanium_leggings", MilitaryArmorMaterials.TITANIUM, EquipmentSlot.LEGS);
    public static final Item TITANIUM_BOOTS = registerArmor("titanium_boots", MilitaryArmorMaterials.TITANIUM, EquipmentSlot.FEET);
    public static final Item CARBON_FIBER_HELMET = registerArmor("carbon_fiber_helmet", MilitaryArmorMaterials.CARBON_FIBER, EquipmentSlot.HEAD);
    public static final Item CARBON_FIBER_CHESTPLATE = registerArmor("carbon_fiber_chestplate", MilitaryArmorMaterials.CARBON_FIBER, EquipmentSlot.CHEST);
    public static final Item CARBON_FIBER_LEGGINGS = registerArmor("carbon_fiber_leggings", MilitaryArmorMaterials.CARBON_FIBER, EquipmentSlot.LEGS);
    public static final Item CARBON_FIBER_BOOTS = registerArmor("carbon_fiber_boots", MilitaryArmorMaterials.CARBON_FIBER, EquipmentSlot.FEET);

    private static Item registerArmor(String name, MilitaryArmorMaterials material, EquipmentSlot slot) {
        return Registry.register(Registries.ITEM, new Identifier(MilitaryInsurgencyMod.MOD_ID, name), new ArmorItem(material, slot, new FabricItemSettings()));
    }

    public static void registerModArmor() {
        MilitaryInsurgencyMod.LOGGER.info("Registering tactical armor for " + MilitaryInsurgencyMod.MOD_ID);
    }
}
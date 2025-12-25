package dev.anvilcraft.guideme.util;

import net.minecraft.world.level.storage.loot.providers.number.BinomialDistributionGenerator;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class NumberUtil {

    public static double getMin(NumberProvider provider) {
        return switch (provider) {
            case ConstantValue value -> value.value();
            case UniformGenerator uniform -> getMin(uniform.min());
            default -> 0;
        };
    }

    public static double getMax(NumberProvider provider) {
        return switch (provider) {
            case ConstantValue value -> value.value();
            case UniformGenerator uniform -> getMax(uniform.max());
            case BinomialDistributionGenerator binomial -> getMax(binomial.n());
            default -> 0;
        };
    }
}

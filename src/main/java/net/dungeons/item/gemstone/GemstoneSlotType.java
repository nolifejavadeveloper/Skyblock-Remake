package net.dungeons.item.gemstone;

public enum GemstoneSlotType {

    RUBY('❤', GemstoneType.RUBY),
    AMETHYST('❈', GemstoneType.AMETHYST),
    SAPPHIRE('✎', GemstoneType.SAPPHIRE),
    CARNELIAN('⫽', GemstoneType.CARNELIAN),
    JASPER('❁', GemstoneType.JASPER),
    COMBAT('⚔', GemstoneType.JASPER, GemstoneType.SAPPHIRE, GemstoneType.RUBY, GemstoneType.AMETHYST),
    DEFENSIVE('☤', GemstoneType.RUBY, GemstoneType.AMETHYST),
    UNIVERSAL('❂', GemstoneType.RUBY, GemstoneType.AMETHYST, GemstoneType.SAPPHIRE, GemstoneType.CARNELIAN, GemstoneType.JASPER);

    public final char icon;
    public final GemstoneType[] applicableGemstones;

    GemstoneSlotType(char icon, GemstoneType... applicableGemstones) {
        this.icon = icon;
        this.applicableGemstones = applicableGemstones;
    }

    public boolean isApplicable(Gemstone gemstone)
    {
        for (int i = 0; i < applicableGemstones.length; i++)
        {
            if (gemstone.getType() == applicableGemstones[i])
                return true;
        }

        return false;
    }
}

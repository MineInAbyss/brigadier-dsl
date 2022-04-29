plugins {
    id("com.mineinabyss.conventions.kotlin")
    id("com.mineinabyss.conventions.papermc")
    id("com.mineinabyss.conventions.publication")
}

repositories {
    maven("https://libraries.minecraft.net")
}

dependencies {
    api("com.mojang:brigadier:1.0.17")
}

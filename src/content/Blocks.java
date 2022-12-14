package mindustry.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class Blocks{
    public static Block

    //environment
    air, spawn, cliff, deepwater, water, taintedWater, deepTaintedWater, tar, slag, cryofluid, stone, craters, charr, sand, darksand, dirt, mud, ice, snow, darksandTaintedWater, space, empty,
    dacite, rhyolite, rhyoliteCrater, roughRhyolite, regolith, yellowStone, redIce, redStone, denseRedStone,
    arkyciteFloor, arkyicStone,
    redmat, bluemat,
    stoneWall, dirtWall, sporeWall, iceWall, daciteWall, sporePine, snowPine, pine, shrubs, whiteTree, whiteTreeDead, sporeCluster,
    redweed, purbush, yellowCoral,
    rhyoliteVent, carbonVent, arkyicVent, yellowStoneVent, redStoneVent, crystallineVent,
    regolithWall, yellowStoneWall, rhyoliteWall, carbonWall, redIceWall, ferricStoneWall, beryllicStoneWall, arkyicWall, crystallineStoneWall, redStoneWall, redDiamondWall,
    ferricStone, ferricCraters, carbonStone, beryllicStone, crystallineStone, crystalFloor, yellowStonePlates,
    iceSnow, sandWater, darksandWater, duneWall, sandWall, moss, sporeMoss, shale, shaleWall, grass, salt,
    coreZone,
    //boulders
    shaleBoulder, sandBoulder, daciteBoulder, boulder, snowBoulder, basaltBoulder, carbonBoulder, ferricBoulder, beryllicBoulder, yellowStoneBoulder,
    arkyicBoulder, crystalCluster, vibrantCrystalCluster, crystalBlocks, crystalOrbs, crystallineBoulder, redIceBoulder, rhyoliteBoulder, redStoneBoulder,
    metalFloor, metalFloorDamaged, metalFloor2, metalFloor3, metalFloor4, metalFloor5, basalt, magmarock, hotrock, snowWall, saltWall,
    darkPanel1, darkPanel2, darkPanel3, darkPanel4, darkPanel5, darkPanel6, darkMetal,
    pebbles, tendrils,

    //ores
    oreCopper, oreLead, oreScrap, oreCoal, oreTitanium, oreThorium,
    oreBeryllium, oreTungsten, oreCrystalThorium, wallOreThorium,

    //wall ores
    wallOreBeryllium, graphiticWall, wallOreTungsten,

    //crafting
    siliconSmelter, siliconCrucible, kiln, graphitePress, plastaniumCompressor, multiPress, phaseWeaver, surgeSmelter, pyratiteMixer, blastMixer, cryofluidMixer,
    melter, separator, disassembler, sporePress, pulverizer, incinerator, coalCentrifuge,

    //crafting - erekir
    siliconArcFurnace, electrolyzer, oxidationChamber, atmosphericConcentrator, electricHeater, slagHeater, phaseHeater, heatRedirector, heatRouter, slagIncinerator,
    carbideCrucible, slagCentrifuge, surgeCrucible, cyanogenSynthesizer, phaseSynthesizer, heatReactor,

    //sandbox
    powerSource, powerVoid, itemSource, itemVoid, liquidSource, liquidVoid, payloadSource, payloadVoid, illuminator, heatSource,

    //defense
    copperWall, copperWallLarge, titaniumWall, titaniumWallLarge, plastaniumWall, plastaniumWallLarge, thoriumWall, thoriumWallLarge, door, doorLarge,
    phaseWall, phaseWallLarge, surgeWall, surgeWallLarge,

    //walls - erekir
    berylliumWall, berylliumWallLarge, tungstenWall, tungstenWallLarge, blastDoor, reinforcedSurgeWall, reinforcedSurgeWallLarge, carbideWall, carbideWallLarge,
    shieldedWall,

    mender, mendProjector, overdriveProjector, overdriveDome, forceProjector, shockMine,
    scrapWall, scrapWallLarge, scrapWallHuge, scrapWallGigantic, thruster, //ok, these names are getting ridiculous, but at least I don't have humongous walls yet

    //defense - erekir
    radar,
    buildTower,
    regenProjector, barrierProjector, shockwaveTower,
    //campaign only
    shieldProjector,
    largeShieldProjector,
    shieldBreaker,

    //transport
    conveyor, titaniumConveyor, plastaniumConveyor, armoredConveyor, distributor, junction, itemBridge, phaseConveyor, sorter, invertedSorter, router,
    overflowGate, underflowGate, massDriver,

    //transport - alternate
    duct, armoredDuct, ductRouter, overflowDuct, underflowDuct, ductBridge, ductUnloader,
    surgeConveyor, surgeRouter,

    unitCargoLoader, unitCargoUnloadPoint,

    //liquid
    mechanicalPump, rotaryPump, impulsePump, conduit, pulseConduit, platedConduit, liquidRouter, liquidContainer, liquidTank, liquidJunction, bridgeConduit, phaseConduit,

    //liquid - reinforced
    reinforcedPump, reinforcedConduit, reinforcedLiquidJunction, reinforcedBridgeConduit, reinforcedLiquidRouter, reinforcedLiquidContainer, reinforcedLiquidTank,

    //power
    combustionGenerator, thermalGenerator, steamGenerator, differentialGenerator, rtgGenerator, solarPanel, largeSolarPanel, thoriumReactor,
    impactReactor, battery, batteryLarge, powerNode, powerNodeLarge, surgeTower, diode,

    //power - erekir
    turbineCondenser, ventCondenser, chemicalCombustionChamber, pyrolysisGenerator, fluxReactor, neoplasiaReactor,
    beamNode, beamTower, beamLink,

    //production
    mechanicalDrill, pneumaticDrill, laserDrill, blastDrill, waterExtractor, oilExtractor, cultivator,
    cliffCrusher, plasmaBore, largePlasmaBore, impactDrill, eruptionDrill,

    //storage
    coreShard, coreFoundation, coreNucleus, vault, container, unloader,
    //storage - erekir
    coreBastion, coreCitadel, coreAcropolis, reinforcedContainer, reinforcedVault,

    //turrets
    duo, scatter, scorch, hail, arc, wave, lancer, swarmer, salvo, fuse, ripple, cyclone, foreshadow, spectre, meltdown, segment, parallax, tsunami,

    //turrets - erekir
    breach, diffuse, sublimate, titan, disperse, afflict, lustre, scathe, smite, malign,

    //units
    groundFactory, airFactory, navalFactory,
    additiveReconstructor, multiplicativeReconstructor, exponentialReconstructor, tetrativeReconstructor,
    repairPoint, repairTurret,

    //units - erekir
    tankFabricator, shipFabricator, mechFabricator,

    tankRefabricator, shipRefabricator, mechRefabricator,
    primeRefabricator,

    tankAssembler, shipAssembler, mechAssembler,
    basicAssemblerModule,

    unitRepairTower,

    //payloads
    payloadConveyor, payloadRouter, reinforcedPayloadConveyor, reinforcedPayloadRouter, payloadMassDriver, largePayloadMassDriver, smallDeconstructor, deconstructor, constructor, largeConstructor, payloadLoader, payloadUnloader,
    
    //logic
    message, switchBlock, microProcessor, logicProcessor, hyperProcessor, largeLogicDisplay, logicDisplay, memoryCell, memoryBank,
    canvas, reinforcedMessage,
    worldProcessor, worldCell, worldMessage,

    //campaign
    launchPad, interplanetaryAccelerator

    ;
graphitePress = new GenericCrafter("graphite-press"){{
            requirements(Category.crafting, with(Items.copper, 75, Items.lead, 30));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(Items.graphite, 10);
            craftTime = 120f;
            size = 2;
            hasItems = true;

            consumeItem(Items.coal, 20);
        }};

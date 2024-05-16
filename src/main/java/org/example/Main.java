package org.example;

import fr.spoonlabs.flacoco.api.Flacoco;
import fr.spoonlabs.flacoco.api.FlacocoAPI;
import fr.spoonlabs.flacoco.api.result.FlacocoResult;
import fr.spoonlabs.flacoco.api.result.Location;
import fr.spoonlabs.flacoco.api.result.Suspiciousness;
import fr.spoonlabs.flacoco.cli.FlacocoMain;
import fr.spoonlabs.flacoco.core.config.FlacocoConfig;
import fr.spoonlabs.flacoco.core.test.method.TestMethod;
import fr.spoonlabs.flacoco.localization.spectrum.SpectrumFormula;
import fr.spoonlabs.flacoco.localization.spectrum.SpectrumSuspiciousComputation;
import fr.spoonlabs.flacoco.localization.spectrum.formulas.Formula;
import spoon.reflect.code.CtStatement;

import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FlacocoConfig config = new FlacocoConfig();
        config.setSpectrumFormula(SpectrumFormula.TARANTULA);
        config.setThreshold(0.6);
        config.setCoverTests(true);
        Flacoco flacoco = new Flacoco(config);
        FlacocoResult result = flacoco.run();
        Set<TestMethod> failingTests = result.getFailingTests();
        Map<Location, Suspiciousness> mapping = result.getDefaultSuspiciousnessMap();
        Map<CtStatement, Suspiciousness> spoonMap = result.getSpoonSuspiciousnessMap();
        printSuspiciousnessMap(mapping);
        //printSuspiciousnessCt(spoonMap);
    }

    public static void printSuspiciousnessMap(Map<Location, Suspiciousness> map) {
        for (Map.Entry<Location, Suspiciousness> entry : map.entrySet()) {
            Location location = entry.getKey();
            Suspiciousness suspiciousness = entry.getValue();
            System.out.println("Location: " + location + ", Suspiciousness: " + suspiciousness.getScore());

        }

    }

    public static void printSuspiciousnessCt(Map<CtStatement, Suspiciousness> map) {
        for (Map.Entry<CtStatement, Suspiciousness> entry : map.entrySet()) {
            CtStatement location = entry.getKey();
            Suspiciousness suspiciousness = entry.getValue();
            System.out.println("Location: " + location + ", Suspiciousness: " + suspiciousness.getScore());

        }

    }
}



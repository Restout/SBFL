package org.example;

import fr.spoonlabs.flacoco.api.Flacoco;
import fr.spoonlabs.flacoco.api.result.FlacocoResult;
import fr.spoonlabs.flacoco.api.result.Location;
import fr.spoonlabs.flacoco.api.result.Suspiciousness;
import fr.spoonlabs.flacoco.core.config.FlacocoConfig;
import fr.spoonlabs.flacoco.core.test.method.TestMethod;

import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FlacocoConfig config = new FlacocoConfig();

        config.setFamily(FlacocoConfig.FaultLocalizationFamily.SPECTRUM_BASED);

        Flacoco flacoco = new Flacoco(config);
        FlacocoResult result = flacoco.run();

        Set<TestMethod> failingTests = result.getFailingTests();
        Map<Location, Suspiciousness> mapping = result.getDefaultSuspiciousnessMap();
        printSuspiciousnessMap(mapping);
    }

    public static void printSuspiciousnessMap(Map<Location, Suspiciousness> map) {
        for (Map.Entry<Location, Suspiciousness> entry : map.entrySet()) {
            Location location = entry.getKey();
            Suspiciousness suspiciousness = entry.getValue();
            System.out.println("Location: " + location + ", Suspiciousness: " + suspiciousness.getScore());
        }
    }
}
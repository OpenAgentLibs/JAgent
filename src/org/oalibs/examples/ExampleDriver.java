package org.oalibs.examples;

import org.oalibs.examples.code.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: Matt Balmer
 * Date: 8/8/13
 * Time: 11:50 PM
 */
public class ExampleDriver {

    private static List<Example> examples = new ArrayList<Example>(Arrays.asList(
        new UtilExamples()
    ));

    public static void main(String[] args) {
        System.out.println("> > Running All Examples");

        for(Example e : examples) {
            System.out.println("> Running example : "+e.getClass().getSimpleName());
            e.run();
        }
    }
}

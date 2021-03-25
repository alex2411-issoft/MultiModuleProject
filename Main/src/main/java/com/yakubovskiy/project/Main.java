package com.yakubovskiy.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        int[] sortedArray = new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99};
        int first = 0;
        int last = sortedArray.length - 1;
        int index = UtilClass.recursiveBinarySearch(sortedArray, first, last, 99);
        if (index != -1) {
            LOGGER.info("Index of key value is {} ", index);
        } else {
            LOGGER.info("The key is not in array.");
        }
    }
}

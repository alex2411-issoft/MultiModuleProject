package com.yakubovskiy.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UtilClass {
    private static final Logger LOGGER = LoggerFactory.getLogger(UtilClass.class);

    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int key) {
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;
            if (arr[mid] == key) {
                LOGGER.debug("The key value equal with the middle element. Return this index.");
                return mid;
            }

            if (arr[mid] > key) {
                LOGGER.debug("The key value is less then middle element ({} < {}). Calling a recursive function",
                        key, arr[mid]);
                return recursiveBinarySearch(arr, firstElement, mid - 1, key);
            }

            LOGGER.debug("The key value is more then middle element ({} > {}). Calling a recursive function",
                    key, arr[mid]);
            return recursiveBinarySearch(arr, mid + 1, lastElement, key);
        }

        LOGGER.debug("The key is not found in array.");
        return -1;
    }
}

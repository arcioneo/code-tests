package com;

import java.util.List;

public class BigSorting {

    public List<String> bigSorting(List<String> unsorted) {
        unsorted.sort(new Comparator());

        return unsorted;
    }

    private class Comparator implements java.util.Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int asciiCodeO1 = 0;
            int asciiCodeO2 = 0;
            o1 = removeLeftZeroes(o1);
            o2 = removeLeftZeroes(o2);

            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            } else {
                for (int i = 0; i < o1.length(); i++) {
                    asciiCodeO1 = (int) o1.charAt(i);
                    asciiCodeO2 = (int) o2.charAt(i);

                    if (asciiCodeO1 > asciiCodeO2) {
                        return 1;
                    } else if (asciiCodeO1 < asciiCodeO2) {
                        return -1;
                    }
                }
                return 0;
            }
        }

        private String removeLeftZeroes(String value) {
            return value.replaceAll("^[0]+", "");
        }
    }

}

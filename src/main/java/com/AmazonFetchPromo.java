package com;

import static java.lang.String.join;
import static java.util.stream.Collectors.joining;

import java.util.List;
import java.util.regex.Pattern;

public class AmazonFetchPromo {

    public int isPrizeEligible(List<String> codeList, List<String> shoppingCart) {
        return codeList == null || codeList.isEmpty() || shoppingCart == null || shoppingCart.isEmpty()
                ? 0 : isEligible(codeList, shoppingCart);
    }

    private int isEligible(List<String> codeList, List<String> shoppingCart) {
        String search = codeList.stream()
                                .map(e -> e.contains(" ") ? e + "[a-zA-Z ]*" : e + "[ ]*")
                                .collect(joining(""))
                                .replaceAll("anything", "[a-zA-Z]+");
        //System.out.println(search + "\n" + String.join(" ", shopCart));
        return Pattern.compile(search)
                      .matcher(join(" ", shoppingCart))
                      .find() ? 1 : 0;
    }
}

package com;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>Amazon is building a way to help customers search reviews quicker by providing real-time suggestions to search
 * terms when the customer starts typing. When given a minimum of two characters into the search field the system will
 * suggest at most three keywords from the review word repository. As the customer continues to type in the reviews
 * search bar the relevant keyword suggestions will update automatically.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Write an algorithm that will output a maximum of three keyword suggestions after each character is typed by the
 * customer in the search field.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>If there are more than three acceptable keywords, return the keywords that are first in alphabetical order.<br>
 * Only return keyword suggestions after the customer has entered two characters.<br> Keyword suggestions must start
 * with the characters already typed</p>
 *
 * <p>Both the repository and the customerQuery should be compared in a case-insensitive way.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>Input</strong><br>
 * The input to the method/function consists of two arguments:<br>
 * <em>repository, </em>a list of unique strings representing the various keywords from the Amazon review comment
 * section;<br> customerQuery, a string representing the full search query of the customer.</p>
 *
 * <p><strong>Output</strong><br>
 * Return a list of a list of strings in lower case, where each list represents the keyword suggestions made by the
 * system as the customer types each character of the customerQuery. Assume the customer types characters in order
 * without deleting or removing any characters. If an output is not possible, return an empty array ([]).</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>Example</strong><br>
 * Input:<br> repository = [ "mobile", "mouse", "moneypot", "monitor", "mousepad" ]<br> customerQuery = "mouse"</p>
 *
 * <p>Output:<br>
 * ["mobile", "moneypot", "monitor"]<br> ["mouse", "mousepad"]<br> ["mouse", "mousepad"]<br> ["mouse", "mousepad"]</p>
 *
 * <p>Explanation:<br>
 * The chain of words that will generate in the search box will be<br> mo, mou, mous, mouse<br> and each line from
 * output shows the suggestion of "mo", "mou", "mous", "mouse", respectively in each line.<br> For the keyword
 * suggestions made by the system that are generated for 'mo', the matches that will be generated are:["mobile",
 * "mouse", "moneypot", "monitor", "mousepad"]<br> Alphabetically, they will be reordered to [ "mobile", "moneypot",
 * "monitor", "mouse", "mousepad" ].<br> Thus the keyword suggestions made by the system are [ "mobile", "moneypot",
 * "monitor"].</p>
 */

public class SearchSuggestionsTest {

    private SearchSuggestions subject;

    @Before
    public void setUp() {
        subject = new SearchSuggestions();
    }

    @Test
    public void searchSuggestions() {
        List<List<String>> expectedOutput = new ArrayList<>();
        List<String> outputForMo = asList(new String[]{"mobile", "moneypot", "monitor"});
        List<String> outputForMou = asList(new String[]{"mouse", "mousepad"});
        List<String> outputForMous = asList(new String[]{"mouse", "mousepad"});
        List<String> outputForMouse = asList(new String[]{"mouse", "mousepad"});

        List<List<String>> result = subject.searchSuggestions(
                asList(new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}), "mouse");

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        assertEquals(4, result.size());
        assertEquals(outputForMo.size(), result.get(0).size());
        assertEquals(outputForMou.size(), result.get(1).size());
        assertEquals(outputForMous.size(), result.get(2).size());
        assertEquals(outputForMouse.size(), result.get(3).size());
    }

    @Test
    public void searchSuggestions2() {
        List<String> outputForAb = asList(new String[]{"abbS", "abc", "Abs"});
        List<String> outputForAbb = asList(new String[]{"abbS"});
        List<String> outputForAbbs = asList(new String[]{"abbS"});

        List<List<String>> result = subject.searchSuggestions(
                asList(new String[]{"abbS", "abc", "Abs", "bcs", "bdsa", "cdde", "rgb", "yjmm", "xxmm", "zeee"}),
                "abbs");

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        assertEquals(3, result.size());
        assertEquals(outputForAb.size(), result.get(0).size());
        assertEquals(outputForAbb.size(), result.get(1).size());
        assertEquals(outputForAbbs.size(), result.get(2).size());
    }

    @Test
    public void searchSuggestions3() {
        List<List<String>> result = subject.searchSuggestions(
                asList(new String[]{"jbckjsc", "Kjabnkasj", "iojncklsmc", "dnklasnmaskl", "ohdkan", "niahdklas",
                        "iandkja", "hjdklasnc", "ancksJ", "nhx"}), "abcd");

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        assertEquals(0, result.size());
    }

}

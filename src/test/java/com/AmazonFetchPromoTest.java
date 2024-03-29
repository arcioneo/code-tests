package com;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>Amazon Fresh is running a promotion in which customers receive prizes for purchasing a secret combination of
 * fruits. The combination will change each day, and the team running the promotion wants to use a code list to make it
 * easy to change the combination. The code list contains groups of fruits. Both the order of the groups within the code
 * list and the order of the fruits within the groups matter. However, between the groups of fruits, any number, and
 * type of fruit is allowable. The term “anything” is used to allow for any type of fruit to appear in that location
 * within the group.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Consider the following secret code list: [[apple, apple], [banana, anything, banana]]</p>
 *
 * <p><br>
 * Based on the above secret code list, a customer who made either of the following purchases would win the
 * prize:&nbsp;<br> orange, apple, apple, banana, orange, banana<br> apple, apple, orange, orange, banana, apple,
 * banana, banana</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Write an algorithm to output 1 if the customer is a winner else output 0.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>Input</strong></p>
 *
 * <p>The input to the function/method consists of two arguments:</p>
 *
 * <p>codeList, a string array of space-separated values representing the order and grouping of specific fruits that
 * must be purchased in order to win the prize for the day.</p>
 *
 * <p>shoppingCart, a list representing the order in which a customer purchases fruit.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>Output</strong><br>
 * Return an integer 1 if the customer is a winner else return 0.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>Note</strong><br>
 * ‘anything’ in the codeList represents that any fruit can be ordered in place of ‘anything’ in the group.<br>
 * ‘anything’ has to be something, it cannot be “nothing.”<br> ‘anything’ must represent one and only one fruit.<br> If
 * secret code list is empty then it is assumed that the customer is a winner.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>Examples</strong><br>
 * Example 1:</p>
 *
 * <p><br>
 * Input:<br> codeList =<br> [[apple, apple],<br> &nbsp;[banana, anything, banana]]<br> shoppingCart =<br> [orange,
 * apple, apple, banana, orange, banana]</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Output:&nbsp;<br>
 * 1</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Explanation:<br>
 * codeList contains two groups - [apple, apple] and [banana, anything, banana].<br> The second group contains
 * ‘anything’ so any fruit can be ordered in place of ‘anything’ in the shoppingCart.<br> The customer is a winner as
 * the customer has added fruits in the order of fruits in the groups and the order of groups in the codeList is also
 * maintained in the shoppingCart.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Example 2:<br>
 * Input:<br> codeList =<br> [[apple, apple],<br> &nbsp;[banana, anything, banana]]<br> shoppingCart =<br> [banana,
 * orange, banana, apple, apple]</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Output:&nbsp;<br>
 * 0</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Explanation:<br>
 * The customer is not a winner as the customer has added the fruits in order of groups but group [banana, orange,
 * banana] is not following the group [apple, apple] in the codeList.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Example3:<br>
 * Input:<br> codeList =&nbsp;<br> [[apple, apple],<br> [banana, anything, banana]]<br> shoppingCart=&nbsp;<br> [apple,
 * banana, apple, banana, orange, banana]</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Output:&nbsp;<br>
 * 0</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Explanation:<br>
 * The customer is not a winner as the customer has added the fruits in an order which is not following the order of
 * fruit names in the first group.</p>
 *
 * <p><br>
 * Example4:<br> Input:<br> codeList =&nbsp;<br> [[apple, apple],<br> [apple, apple, banana]]<br>
 * shoppingCart=&nbsp;<br> [apple, apple, apple, banana]</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Output:<br>
 * 0</p>
 *
 * <p>&nbsp;</p>
 *
 * <p>Explanation:<br>
 * The customer is not a winner as the first 2 fruits form group 1, all three fruits would form group 2, but can't
 * because it would contain all fruits of group 1.</p>
 */
public class AmazonFetchPromoTest {

    private AmazonFetchPromo subject;

    @Before
    public void setUp() {
        subject = new AmazonFetchPromo();
    }

    @Test
    public void isPrizeEligible() {
        List<String> codeList = Arrays.asList("apple apple", "banana", "anything", "banana");
        List<String> shoppingCart = Arrays.asList("orange", "apple", "apple", "banana", "orange", "banana");
        assertEquals(1, subject.isPrizeEligible(codeList, shoppingCart));

        codeList = Arrays.asList("apple apple", "banana", "anything", "banana");
        shoppingCart = Arrays.asList("banana", "orange", "banana", "apple", "apple");
        assertEquals(0, subject.isPrizeEligible(codeList, shoppingCart));

        codeList = Arrays.asList("apple apple", "apple", "apple", "banana");
        shoppingCart = Arrays.asList("apple", "banana", "apple", "banana", "orange", "banana");
        assertEquals(0, subject.isPrizeEligible(codeList, shoppingCart));

        codeList = Arrays.asList("apple apple", "banana", "anything", "banana");
        shoppingCart = Arrays.asList("apple", "apple", "apple", "banana");
        assertEquals(0, subject.isPrizeEligible(codeList, shoppingCart));
    }

}

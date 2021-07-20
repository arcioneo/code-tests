package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang.StringUtils;

public class StrongPassword {

    public int getEditsToMakeStrong(String password) {
        return isAStrongPassword(password) ? 0 : getEditsToMakeStrong(password, 0);
    }

    private int getEditsToMakeStrong(String password, int edits) {
        return isAStrongPassword(password) ? edits : getEditsToMakeStrong(makePasswordStronger(password), ++edits);
    }

    private String makePasswordStronger(String password) {
        if (StringUtils.isBlank(password)) {
            return "A";
        } else if (!hasValidMinLength(password)) {
            return addChar(password);
        } else if (!hasValidMaxLength(password)) {
            return password.substring(0, password.length() - 1);
        } else if (!hasAtLeastANumber(password)) {
            return addOrReplace(password, "1");
        } else if (!hasAtLeastAnUppercase(password)) {
            return addOrReplace(password, "A");
        } else if (hasThreeOfTheSameLetterInARow(password)) {
            Matcher matcher = Pattern.compile("(.)\\1\\1").matcher(password);

            while(matcher.find()) {
                String value = matcher.group();
                char lastChar = value.toCharArray()[value.length() - 1];
                char nextChar = (char) (lastChar + 1);
                String newValue = value.substring(0, 2) + nextChar;

                return password.replace(value, newValue);
            }
        }
        return password;
    }

    private String addOrReplace(String password, String s) {
        if (isMaxLength(password)) {
            return s + password.substring(1, password.length());
        }
        return s + password;
    }

    private boolean isMaxLength(String password) {
        return password.length() >= 20;
    }

    private String addChar(String password) {
        if (!hasAtLeastANumber(password)) {
            return password + "1";
        } else if (!hasAtLeastAnUppercase(password)) {
            return password + "A";
        } else {
            char lastChar = password.toCharArray()[password.length() - 1];
            char nextChar = (char) (lastChar + 1);
            return password + nextChar;
        }
    }

    private boolean isAStrongPassword(String password) {
        return !StringUtils.isBlank(password) &&
                hasValidMinLength(password) &&
                hasValidMaxLength(password) &&
                hasAtLeastANumber(password) &&
                hasAtLeastAnUppercase(password) &&
                !hasThreeOfTheSameLetterInARow(password);
    }

    private boolean hasThreeOfTheSameLetterInARow(String password) {
        return password.matches(".*(.)\\1\\1.*");
    }

    private boolean hasAtLeastAnUppercase(String password) {
        return password.matches(".*[A-Z]+.*");
    }

    private boolean hasAtLeastANumber(String password) {
        return password.matches(".*[0-9]+.*");
    }

    private boolean hasValidMaxLength(String password) {
        return password.length() < 21;
    }

    private boolean hasValidMinLength(String password) {
        return password.length() > 5;
    }
}

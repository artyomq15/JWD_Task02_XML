package by.ts.task02.dao.parse.helpaction;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ParseHelper {
    private static final String FOR_TAG_NAME = "<([^\\s/]+)\\s*((\\S+=\"[^\"]*\"\\s*)*)/?>";
    private static final int TAG_NAME_GROUP = 1;

    private static final String FOR_ATTRIBUTES = "(\\S+)=\"([^\"]*)\"";
    private static final int NAME_ATTRIBUTE_GROUP = 1;
    private static final int VALUE_ATTRIBUTE_GROUP = 2;

    private static final String FOR_CONTENT = "(?<=>).+";

    private ParseHelper() {
    }

    public static Map<String, String> getAttributes(String tag) {
        Map<String, String> attributes = new HashMap<>();
        Pattern pattern = Pattern.compile(FOR_ATTRIBUTES);
        Matcher matcher = pattern.matcher(tag);
        while (matcher.find()) {
            attributes.put(matcher.group(NAME_ATTRIBUTE_GROUP), matcher.group(VALUE_ATTRIBUTE_GROUP));
        }
        return attributes;
    }

    public static String getNameTag(String tag) {
        Pattern pattern = Pattern.compile(FOR_TAG_NAME);
        Matcher matcher = pattern.matcher(tag);
        matcher.find();
        return matcher.group(TAG_NAME_GROUP);
    }

    public static String getContent(String tag) {
        Pattern pattern = Pattern.compile(FOR_CONTENT);
        Matcher matcher = pattern.matcher(tag);
        matcher.find();
        return matcher.group();
    }
}

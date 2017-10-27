package by.ts.task02.dao.parse.helpaction;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ParseHelper {
    private static final String TAG_NAME_PATTERN = "<([^\\s/]+)\\s*((\\S+=\"[^\"]*\"\\s*)*)/?>";
    private static final int TAG_NAME_GROUP = 1;

    private static final String ATTRIBUTES_PATTERN = "(\\S+)=\"([^\"]*)\"";
    private static final int NAME_ATTRIBUTE_GROUP = 1;
    private static final int VALUE_ATTRIBUTE_GROUP = 2;

    private static final String CONTENT_PATTERN = "(?<=>).+";

    private ParseHelper() {
    }

    public static Map<String, String> getAttributes(String tag) {
        Map<String, String> attributes = new HashMap<>();
        Pattern pattern = Pattern.compile(ATTRIBUTES_PATTERN);
        Matcher matcher = pattern.matcher(tag);
        while (matcher.find()) {
            attributes.put(matcher.group(NAME_ATTRIBUTE_GROUP), matcher.group(VALUE_ATTRIBUTE_GROUP));
        }
        return attributes;
    }

    public static String getNameTag(String tag) {
        Pattern pattern = Pattern.compile(TAG_NAME_PATTERN);
        Matcher matcher = pattern.matcher(tag);
        matcher.find();
        return matcher.group(TAG_NAME_GROUP);
    }

    public static String getContent(String tag) {
        Pattern pattern = Pattern.compile(CONTENT_PATTERN);
        Matcher matcher = pattern.matcher(tag);
        matcher.find();
        return matcher.group();
    }
}

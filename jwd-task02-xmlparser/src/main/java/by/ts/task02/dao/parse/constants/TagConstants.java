package by.ts.task02.dao.parse.constants;

public final class TagConstants {
    public static final String OPEN_TAG = "(<([^\\?\\s/]+)\\s*((\\S+=\"[^\"]*\"\\s*)*)>)";
    public static final String CLOSE_TAG = "(</\\s*([^\\?\\s<]+)\\s*>)";
    public static final String SELF_CLOSING_TAG = "(<([^\\?\\s]+)\\s*((\\S+=\"[^\"]*\"\\s*)*)/>)";
    public static final String XML_TAG = "(<?.+?>)";
    public static final String FINDER = "(<.*?>)|([^<]+)";

    private TagConstants(){}

}

package com.java.automation.lab.fall.kapinus.core22.constant;

public class IOConstant {
    public static final String PROPERTIES_EXPANSION = ".properties";
    public static final String PROPERTIES_PATH = System.getProperties().getProperty("user.dir") + "/src/main/resources/properties";
    public static final String TMP_DIR_PATH = System.getProperties().getProperty("user.dir") + "/tmp";
    public static final String RS_PATH = TMP_DIR_PATH + "/rs";
    public static final String RQ_PATH = TMP_DIR_PATH + "/rq";
    public static final String XML_OBJ_PATH = TMP_DIR_PATH + "/%s.xml";
    public static final String JSON_OBJ_PATH = TMP_DIR_PATH + "/%s.json";

    public static final String CWD = System.getProperty("user.dir");
    public static final String PATH_SEP = System.getProperty("file.separator");
    public static final String CONFIG_PATH = String.format(
            "%s%s%s%s%s%s%s%s%s",
            CWD, PATH_SEP, "src", PATH_SEP, "main", PATH_SEP, "resources", PATH_SEP, "config.properties");
    public static final String MYBATIS_CONFIG_PATH = String.format(
            "%s%s%s%s%s%s%s",
            "src", PATH_SEP, "main", PATH_SEP, "resources", PATH_SEP, "mybatisconfig.xml");

}
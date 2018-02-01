package cn.itcast.activemq;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * Ues in test, like in Spring<br/>
 * &lt;context:property-placeholder location="classpath:prop.properties"/&gt;<br/>
 * ${name}<br/><br/>@Value<br/>
 * private String name;<br/>
 * @author lwc
 */
public class PropUtils {

    private ResourceBundle rb = null;

    /** classPath:baseName.properties */
    public PropUtils(String baseName) {
        rb = ResourceBundle.getBundle(baseName);
    }

    public String get(String key){
        return rb.getString(key);
    }

    public Integer getInt(String key){
        return Integer.parseInt(rb.getString(key));
    }

    public String[] getArray(String key){
        return rb.getStringArray(key);
    }

    public Enumeration<String> getKeys(String key) {
        return rb.getKeys();
    }

    /** static for prop.properties */
    private static ResourceBundle srb = ResourceBundle.getBundle("prop");

    /** static get for prop.properties */
    public static String getS(String key){
        return srb.getString(key);
    }

    /** static getInt for prop.properties */
    public static Integer getSInt(String key){
        return Integer.parseInt(srb.getString(key));
    }

    /** static getArray for prop.properties */
    public static String[] getSArray(String key){
        return srb.getStringArray(key);
    }

    /** static getKeys for prop.properties */
    public static Enumeration<String> getSKeys(String key) {
        return srb.getKeys();
    }
}

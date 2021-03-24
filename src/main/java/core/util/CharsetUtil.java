package core.util;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

/**
 * @ProjectName: yoTool
 * @Package: core.util
 * @ClassName: CharsetUtil
 * @Description: 作用描述
 * @Author: Young
 * @CreateDate: 2021/3/24 23:09
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/3/24 23:09
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class CharsetUtil {
    /**
     * ISO-8859-1
     */
    public static final String ISO_8859_1 = "ISO-8859-1";
    /**
     * UTF-8
     */
    public static final String UTF_8 = "UTF-8";
    /**
     * GBK
     */
    public static final String GBK = "GBK";

    /**
     * ISO-8859-1
     */
    public static final Charset CHARSET_ISO_8859_1 = StandardCharsets.ISO_8859_1;
    /**
     * UTF-8
     */
    public static final Charset CHARSET_UTF_8 = StandardCharsets.UTF_8;
    /**
     * GBK
     */
    public static final Charset CHARSET_GBK;

    static {
        //避免不支持GBK的系统中运行报错
        Charset _CHARSET_GBK = null;
        try {
            _CHARSET_GBK = Charset.forName(GBK);
        } catch (UnsupportedCharsetException e) {
            System.out.println(e.getCharsetName());
            e.printStackTrace();
        }
        CHARSET_GBK = _CHARSET_GBK;
    }


}

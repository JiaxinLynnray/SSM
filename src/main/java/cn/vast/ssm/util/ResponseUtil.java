package cn.vast.ssm.util;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/28 23:36
 */
public class ResponseUtil {
    public static void write(HttpServletResponse response, Object o) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        response.addHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = response.getWriter();
        out.print(o.toString());
        out.flush();
        out.close();
    }
}

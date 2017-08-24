package exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by Sunny on 17/8/24.
 */
public class UtilException extends Exception {

    public UtilException(String message) {
        super(message);
    }

    public UtilException(String message, Exception ex) {
        super(message,ex);
    }

    @Deprecated
    protected UtilException(String message,Object...Ocups) {
        //TODO 这个方法 暂时留作考虑
        super(String.format(message, Ocups));
    }

    public String getOriMessage(){
        return getMessage();
    }

    public static String getStackString(Exception ex) {
        //TODO 是否有线程问题
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        //TODO 这个\r\n 是否合适
        return "\r\n" + sw.toString() + "\r\n";
    }
}

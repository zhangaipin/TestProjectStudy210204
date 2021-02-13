package baiduforjenkins;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description:
 * @author: ManolinCoder
 * @time: 2021/2/4 23:10
 */
public class BaiDuPage {
    public static final Logger Log = LoggerFactory.getLogger(BaiDuPage.class);
    /**
     * @Description: 加法计算
     * @param	a
     * @param	b
     * @Return: int 和
     * @Date: 2021/2/4 23:33
     **/
    public int addMethod(int a, int b){
        int num = a + b;
        Log.info("加法计算：" +a+" + "+b +" = "+num);
        return num;
    }

    /**
     * @Description: 减法计算
     * @param:	a
     * @param:	b
     * @Return: int 差
     * @Date: 2021/2/4 23:38
     **/
    public int lessMethod(int a, int b){
        int num = a - b;
        Log.info("减法计算：" +a+" - "+b+ " = "+num);
        return num;
    }
}

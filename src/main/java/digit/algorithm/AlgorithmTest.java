package digit.algorithm;

import org.junit.Test;

/**
 * @ Author     ：zhouxiang.
 * @ Date       ：Created in 15:42 2020/12/9
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
public class AlgorithmTest {
    /**
     * 功能描述: <br>
     * @Param: 二分法查找
     * @Return: void
     * @Author: zhouxiang
     * @Date: 2020/12/9 15:43
     */
    @Test
    public void test(){
        int[] a= new int[]{1,2,4,5,8,9,110};
        System.out.println( AlgorithmEg.biSearch(a,4));
    }

}

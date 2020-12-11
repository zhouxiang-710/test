package digit.algorithm;

import org.junit.Test;

/**
 * @ Author     ：zhouxiang.
 * @ Date       ：Created in 14:24 2020/12/9
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
public class AlgorithmEg {


    /**
     * 功能描述: <br>
     * @Param：二分查找，又叫折半查找，要求待查找的序列 有序。
     * @return 数组下标
     */
    public static int biSearch(int[] array,int a  ){
        int lo = 0;
        int hi=array .length - 1;
        int mid;
        while(lo<=hi){
            mid=(lo+hi)/2;//中间位置
            if(array[mid]==a){
                return mid+1;
            }else if(array[mid]<a){//向右查找
                lo = mid+ 1;
            }else if(array[mid]>a){//向左查找
                hi=mid -1;
            }
        }
        return  -1;
    }
    /**
     * 功能描述: <br>
     * @Param：冒泡排序，前面的数据大于后面的数据，就将这两个数据交换
     * @return 数组下标
     */
    public static void bubbleSort(int[] a , int n){
        int i, j ;
    }

}

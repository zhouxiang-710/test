package digit.util;

import java.util.*;

/**
 * @ Author     ：zhouxiang.
 * @ Date       ：Created in 16:17 2020/12/7
 * @ Description：数字键盘转换并自由组合工具类
 * @ Modified By：
 * @Version: $version$
 */
public class DigitConvertUtil {

    private static Map digitMap = new HashMap<String,String>();

    public static void initDigitsMap(){
        digitMap.put("0", Arrays.asList(""));
        digitMap.put("1",Arrays.asList(""));
        digitMap.put("2",Arrays.asList("A","B","C"));
        digitMap.put("3",Arrays.asList("D","E","F"));
        digitMap.put("4",Arrays.asList("G","H","I"));
        digitMap.put("5",Arrays.asList("J","K","L"));
        digitMap.put("6",Arrays.asList("M","N","O"));
        digitMap.put("7",Arrays.asList("P","Q","R","S"));
        digitMap.put("8",Arrays.asList("T","U","V"));
        digitMap.put("9",Arrays.asList("W","X","Y","Z"));
    }

    /*
     * 功能描述: 输入数字，转换成字符并自由组合
     */
    public static void digitToLetters(int digit){
        initDigitsMap();
        if(digit<0||digit>99){
            System.out.println("输入不合法！只能输入0-99的数字,请重新输入：");
        }
        String[] arrStr=String.valueOf(digit).split("");
        List<String[]> dataList=new ArrayList<String[]>();

        for(int i=0;i<arrStr.length;i++){
            List<String> lettersList= (List<String>) digitMap.get(arrStr[i]);
            if(lettersList.size()>0){
                String[] letterArr= (String[]) lettersList.toArray();
                dataList.add(letterArr);
            }
        }
        //递归算法返回多数组排列组合
        List<String[]> resultList= convertLetters(dataList,0,null);
        System.out.print("Output:");
        //打印组合结果
        for(int i=0;i<resultList.size();i++){
            String[] letterArr=resultList.get(i);
            System.out.print(" ");
            for(String s: letterArr){
                System.out.print(s);
            }
        }
    }

    private static List<String[]> convertLetters(List<String[]> dataList, int index, List<String[]> resultList){
        if(index==dataList.size()){
            return resultList;
        }
        List<String[]> resultList0=new ArrayList<String[]>();
        if(index==0){
            String[] dataArr=dataList.get(0);
            for(String s : dataArr){
                resultList0.add(new String[]{s});
            }

        }else{
            String[] dataArr=dataList.get(index);
            for(String[] dataArr0: resultList){
                for(String s : dataArr){
                    //复制数组并扩充新元素
                    String[] dataArrCopy=new String[dataArr0.length+1];
                    System.arraycopy(dataArr0, 0, dataArrCopy, 0, dataArr0.length);
                    dataArrCopy[dataArrCopy.length-1]=s;
                    //加入结果集中
                    resultList0.add(dataArrCopy);
                }
            }
        }
        return convertLetters(dataList,++index,resultList0);
    }

}

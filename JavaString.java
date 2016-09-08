package cn.com.songjy;  
import java.text.NumberFormat;  
//Java 中给数字左边补0  
public class NumberFormatTest {  
  public static void main(String[] args) {  
    // 待测试数据  
    int i = 1;  
    // 得到一个NumberFormat的实例  
    NumberFormat nf = NumberFormat.getInstance();  
    // 设置是否使用分组  
    nf.setGroupingUsed(false);  
    // 设置最大整数位数  
    nf.setMaximumIntegerDigits(4);  
    // 设置最小整数位数  
    nf.setMinimumIntegerDigits(4);  
    // 输出测试语句  
    System.out.println(nf.format(i));  
    }  
}  


    /**   
     * Java里数字转字符串前面自动补0的实现。   
     *     
     */    
    public class TestStringFormat {     
      public static void main(String[] args) {     
        int youNumber = 1;     
        // 0 代表前面补充0     
        // 4 代表长度为4     
        // d 代表参数为正数型     
        String str = String.format("%04d", youNumber);     
        System.out.println(str); // 0001     
      }     
    }    
    
    
    //流水号加1后返回，流水号长度为4  
        private static final String STR_FORMAT = "0000";   
      
        public static String haoAddOne_2(String liuShuiHao){  
            Integer intHao = Integer.parseInt(liuShuiHao);  
            intHao++;  
            DecimalFormat df = new DecimalFormat(STR_FORMAT);  
            return df.format(intHao);  
        }  

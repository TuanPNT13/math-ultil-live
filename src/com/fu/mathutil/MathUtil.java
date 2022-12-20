
package com.fu.mathutil;

//ta viết cái class để cung cấp tiện ích cho nơi khác xài
// -> ta ko cần nhớ cái gì cho riêng ta
// -> hàm static giúp làm điều này
public class MathUtil {
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
            //hàm dừng liền ko cần return
            //xuống đây là n = 0 .. 20
        if (n == 0 || n == 1)
                return 1;
        //chơi for hoặc đệ quy
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

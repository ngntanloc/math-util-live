/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Nguyen Tan Loc
 */
// TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
// KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÁI GÌ
// CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY

public class MathUtil {

    // n! = 1 * 2 * 3 * ... * n
    // Quy ước 0! = 1! = 1
    // Ko tính đc giai thừa cho số âm
    // 20! là vừa khớp kiểu long, kiểu long chỉ tối đa 18 số 0
    // 21! lố kiểu long
    // nếu đưa vào âm/21 giai thừa ta éo tính, ta đập vào mặt ai xài hàm này
    // 1 cái ngoại lệ -> chửi éo tính đc
    
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        // hàm dừng liền, éo cần return
        // xuống đến đây là n nằm trong 0..20 ròi
        if (n == 0 || n == 1)
            return 1;   // dừng ngay khi n đặc biệt
        
        // xuống đến đây n = 2 .. 20 òi
        // chơi for hoặc đệ qui - recursion
        // kĩ thuật nhồi con heo đất, ốc bu dồn thịt
        // i = 2, i = 3, i = 4, i = 5, i = ... nhồi liên tục i vào cái tích
        long product = 1; // tích khởi đầu =1 , nhồi 2 3 4 5 6 ... n
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

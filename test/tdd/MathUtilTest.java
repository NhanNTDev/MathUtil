/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;





import static nhannt.util.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    @Test // báo cho JVM  biết đây là thằng hàm main()
    //  trong hàm này chứa các lệnh để test code chính của mình
    // ta test các tình huống thành công ở đây,
    // thành công: cF(5) - > 120 gọi là thành công
    public void testSuccessfulCases()
    {
        //assertEquals(30, 50);
        //tao kỳ vọng có 30, xem mày đưa vào thực tế là bao nhiêu (50)
        // 2 thứ khớp nhau, mày xử lí như dự kiến, đèn xanh
        //                            không như dự kiến, đèn đỏ
        assertEquals(120, computeFactorial(5));
        assertEquals(720, computeFactorial(6));
        assertEquals(1, computeFactorial(1));
        assertEquals(1, computeFactorial(0));
        assertEquals(2, computeFactorial(2));
        // muốn xanh thì tất cả phải xanh, đúng hết các cases
        // có 1 thằng đỏ, coi như đỏ
        // vì hàm ý: code phải chạy đúng cho mọi tình huống
        // ta chỉ cần nhìn xanh đỏ, khỏi cần dò bằng mắt
        
    }
    
    @Test(expected = IllegalArgumentException.class) //annotation, dấu hiệu báo cho JVM và thư viện jar liên
    // quan biết cần phải làm gì
    // hàm này chuwsas các tình huống cà chớn, ví dụ cf(-5), cF(16)
    public void testFailedCases() {
        // tao kì vọng mày ra ngoại lệ 
        // ngoại lệ k phải là một value để so sánh nên không xài 
        // assert.Equals() được
        // trong khi đó ném ra ngoại lệ không phải là actual value để so sánh
        // ta phải xài chiêu khác khi bắt ngoại lệ coi có đúng 
        // ngoại lệ mình cần không
        computeFactorial(-5);
    }
    // code có thể còn tiềm ẩn lỗi nhưng Clean & Build luôn ra file .jar nếu code không sai cú pháp
    // vậy thì nguy hiểm quá đi
    // mình phải DISABLE cái nút CLEAN & BUILD NẾU CODE CÒN MÀU ĐỎ
    // Tức là còn ERROR LOGIC
    // Nhớ 2 con số: 1005 Netbeans 8, 1204 NetBeans 10 trở lên
    // khi chơi với Ant project
    
    
}

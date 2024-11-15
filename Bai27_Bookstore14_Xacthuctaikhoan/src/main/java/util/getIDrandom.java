package util;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class getIDrandom {
	   public static void main(String[] args) {
		   
	        // Gọi hàm để tạo java.sql.Date với hiệu lực là 1 phút 30 giây
	        Date hieuLuc = createCustomDate(1, 30);

	        // In ra ngày tháng năm giờ phút giây
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        String formattedDate = dateFormat.format(hieuLuc);
	        System.out.println("Ngày tháng năm giờ phút giây: " + formattedDate);
	    }

	    // Hàm tạo java.sql.Date với hiệu lực chỉ định (số phút và số giây)
	    public static Date createCustomDate(int minutes, int seconds) {
	        long customTimeMillis = System.currentTimeMillis() + (minutes * 60 * 1000) + (seconds * 1000);
	        return new Date(customTimeMillis);
	    }
}

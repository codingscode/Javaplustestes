package programa;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Teste1 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); // adicionar hora
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		System.out.println();

	}

}
/*
25/06/2018 12:42:07
25/06/2018 16:42:07





------------------------------------
padrão iso 8601



*/

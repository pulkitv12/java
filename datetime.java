import java.util.*;
import java.text.*;
class dt
{
	public static void main (String[] args) throws Exception
	{
		int days,months,years;
		Calendar c=Calendar.getInstance();
		Calendar x=Calendar.getInstance();
		String mystring = "13/11/1996";
		Date d = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(mystring);
		c.setTime(d);
		int cy=x.get(Calendar.YEAR);
		int cm=x.get(Calendar.MONTH);
		int cd=x.get(Calendar.DATE);
		int ry=c.get(Calendar.YEAR);
		int rm=c.get(Calendar.MONTH);
		int rd=c.get(Calendar.DATE);
		years=cy-ry;
		if(cm<rm)
		{
			--years;
			months=12-rm+cm;
		}
		else
			months=cm-rm;
		
		if(cd<rd)
		{
			--months;
			days=31-rd+cd;
		}
		else
			days=cd-rd;
			
		System.out.println (years+" "+months+" "+days+" "+(years*365+months*31+days));
		System.out.println (c.getTimeInMillis());
	}
}
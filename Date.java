package project1;
public class Date {
private String date;
Date()
{
	
}
Date(String d)
{
	this.date=d;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String checkDate(String date)
{
	String p=date.substring(3,5);
	int a=Integer.parseInt(date.substring(0,2));
	if(p.equals("01")||p.equals("02")||p.equals("03")||p.equals("04")||p.equals("05")||
		p.equals("06")||p.equals("07")||p.equals("08")||p.equals("09")||
		p.equals("10")||p.equals("11")||p.equals("12"))
	{
		if(p.equals("04")||p.equals("06")||p.equals("09")||p.equals("11"))
			{if(a>=01&&a<=30)
				return "valid date";
			else
				return "not valid date";}
		else if(p.equals("02"))
			{if(a>=01 &&a<=28)
				return "valid date";
			else
				return "not valid date";}
		else
		{
			if(a>=01 &&a<=31)
				return "valid date";
			else
				return "not valid date";}
		}
	return "not valid date";
}
public String nextDate(String date)
{
	int d=Integer.parseInt(date.substring(0,2));
	int m=Integer.parseInt(date.substring(3,5));
	int y=Integer.parseInt(date.substring(6));
	if(d>=01 &&d<=29 && (m==04||m==06||m==9||m==11)&& m!=02)
		d=d+1;
	else if(d==30 && (m==04||m==06||m==9||m==11)&&m!=02)
	{
		d=1;
        m=m+1;
	}
	if(d>=01 &&d<=30 && (m!=02||m!=04||m!=06||m!=9||m!=11))
		d=d+1;
	else if(d==31 && (m!=02||m!=04||m!=06||m!=9||m!=11) )
	{
		d=1;
        if(m<12)
        	m=m+1;
        else
        {
        	m=1;
        	y=y+1;
        }
	}
	if(d>=01 &&d<=27 && (m==02))
		d=d+1;
	else if(d==28 && m==02 )
	{
		d=1;
		m=m+1;
	}
	return d+"-"+m+"-"+y;
}
}

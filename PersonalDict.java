
/*
 * �ӤH�ƭ^�~�r��
 * ��ơG
 * 1. Design Pattern �]�p�Ҧ�
 * 2. algorithm �t��k
 * 3. GitHub �}���{���X���ɰ�
 * 4. ELK ��ı�Ƨe�{��x���R
 * 5. Gossip �}���ج[
 * 6. Spring ��Ʈw���}���ج[
 * 7. Hibernate ��Ʈw���}���ج[
 * 8. solaris unix�@�~�t�Τ��@
 * 
 * �\��G��J�^��d�ߤ���
 *
 *2018/11/07
 *�쥻�Ndata�@�ּg�bmain�̡A��}�������O����o�d��F
 *�ت��G�NData���O�̪����X����Ǩ�PersonalDict���O�ϥ�
 *
 *
 */

import java.io.*;
import java.util.*;

public class PersonalDict {

	public static void main(String args[]) throws IOException {
		
		Datan data = new Data();
		TreeMap<String,String> tr = new TreeMap<String,String>(data.adddata());	//����
		
		System.out.println("===�u�{�v�^�~�r��===");
		System.out.println("((���}�п�Jq))");
		String str;
		do {
			System.out.println("�п�J�n�d�ߪ��^���r:");
			BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
			str = bfr.readLine();
			if (!str.equals("q")) {
				System.out.println(data.adddata());//���աG���Q�⪫��Ǧ^�ӡA�����G���h���X���󪺯S��
				
				String answer = (TreeMap)cdata.adddata()___.get(str.toLowerCase()); //�d��

				System.out.println(answer);
			}
		} while (!str.equals("q"));
	}

}


 class Data {
	
	String enginneren[] = { "design Pattern", "algorithm", "github",
			"elk", "gossip", "spring", "hibernate","solaris" };
	String enginnercn[] = { "�]�p�Ҧ�", "�t��k", "�}���{���X���ɰ�", 
			"��ı�Ƨe�{��x���R", "�}���ج[", "��Ʈw���}���ج[", "��Ʈw���}���ج[", "unix�@�~�t�Τ��@" };

	
	
	public  Object adddata() {
		TreeMap<String, String> tmap = new TreeMap<String, String>();
		for(int i = 0;i<enginneren.length;i++)
		{
			tmap.put(enginneren[i], enginnercn[i]);
		}
		return tmap;
	}
	
}

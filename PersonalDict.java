
/*
 * 個人化英漢字典
 * 資料：
 * 1. Design Pattern 設計模式
 * 2. algorithm 演算法
 * 3. GitHub 開源程式碼分享區
 * 4. ELK 視覺化呈現日誌分析
 * 5. Gossip 開源框架
 * 6. Spring 資料庫的開源框架
 * 7. Hibernate 資料庫的開源框架
 * 8. solaris unix作業系統之一
 * 
 * 功能：輸入英文查詢中文
 *
 *2018/11/07
 *原本將data一併寫在main裡，拆開到兩個類別之後卻卡住了
 *目的：將Data類別裡的集合物件傳到PersonalDict類別使用
 *
 *
 */

import java.io.*;
import java.util.*;

public class PersonalDict {

	public static void main(String args[]) throws IOException {
		
		Datan data = new Data();
		TreeMap<String,String> tr = new TreeMap<String,String>(data.adddata());	//失敗
		
		System.out.println("===工程師英漢字典===");
		System.out.println("((離開請輸入q))");
		String str;
		do {
			System.out.println("請輸入要查詢的英文單字:");
			BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
			str = bfr.readLine();
			if (!str.equals("q")) {
				System.out.println(data.adddata());//測試：順利把物件傳回來，但似乎失去集合物件的特性
				
				String answer = (TreeMap)cdata.adddata()___.get(str.toLowerCase()); //卡住

				System.out.println(answer);
			}
		} while (!str.equals("q"));
	}

}


 class Data {
	
	String enginneren[] = { "design Pattern", "algorithm", "github",
			"elk", "gossip", "spring", "hibernate","solaris" };
	String enginnercn[] = { "設計模式", "演算法", "開源程式碼分享區", 
			"視覺化呈現日誌分析", "開源框架", "資料庫的開源框架", "資料庫的開源框架", "unix作業系統之一" };

	
	
	public  Object adddata() {
		TreeMap<String, String> tmap = new TreeMap<String, String>();
		for(int i = 0;i<enginneren.length;i++)
		{
			tmap.put(enginneren[i], enginnercn[i]);
		}
		return tmap;
	}
	
}

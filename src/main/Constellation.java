package main;

import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.time.LocalDateTime;

public class Constellation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("     ⋆｡ﾟ☾︎｡⋆ 오늘의 별자리 운세 ｡ ﾟ☾ ﾟ｡⋆");
		System.out.println("  ⁎⛧꙳⭒☪︎⭒꙳⛧＊생일을 입력해 주세요⁎⛧꙳⭒☪︎⭒꙳⛧＊");
		System.out.println("    ━━━━ 음력으로만 입력해 주세요! ━━━━");	
		System.out.println("      ━━━━ 입력 예시 : 02.02 ━━━━");
		System.out.print("             ✔︎ ");
		String date = in.nextLine();
		String month = date.substring(0,2);
		String day = date.substring(3,5);
		String jari = "error";
		switch(month) {
			case "01":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19":
						jari = "염소자리";
						break;
					case "20": case "21": case "22": case "23": case "24":
					case "25": case "26": case "27": case "28": case "29":
					case "30": case "31":
						jari = "물병자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "02":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18":
						jari = "물병자리";
						break;
					case "19": case "20": case "21": case "22": case "23":
					case "24": case "25": case "26": case "27": case "28":
					case "29": case "30":
						jari = "물고기자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "03":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19": case "20":
						jari = "물고기자리";
						break;
					case "21": case "22": case "23": case "24": case "25":
					case "26": case "27": case "28": case "29": case "30":
					case "31":
						jari = "양자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "04":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19":
						jari = "양자리";
						break;
					case "20": case "21": case "22": case "23": case "24":
					case "25": case "26": case "27": case "28": case "29":
					case "30":
						jari = "황소자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "05":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19": case "20": 
						jari = "황소자리";
						break;
					case "21": case "22": case "23": case "24": case "25": 
					case "26": case "27": case "28": case "29": case "30": 
					case "31":
						jari = "쌍둥이자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "06":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19": case "20": 
					case "21":
						jari = "쌍둥이자리";
						break;
					case "22": case "23": case "24": case "25": case "26":
					case "27": case "28": case "29": case "30": 
						jari = "게자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "07":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19": case "20":
					case "21": case "22":
						jari = "게자리";
						break;
					case "23": case "24": case "25": case "26": case "27": 
					case "28": case "29": case "30": case "31":
						jari = "사자자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "08":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19": case "20": 
					case "21": case "22":
						jari = "사자자리";
						break;
					case "23": case "24": case "25": case "26": case "27": 
					case "28": case "29": case "30": case "31":
						jari = "처녀자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "09":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19": case "20": 
					case "21": case "22": case "23":
						jari = "처녀자리";
						break;
					case "24": case "25": case "26": case "27": case "28":
					case "29": case "30": 
						jari = "천칭자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "10":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19": case "20": 
					case "21": case "22":
						jari = "천칭자리";
						break;
					case "23": case "24": case "25": case "26": case "27":
					case "28": case "29": case "30": case "31":
						jari = "전갈자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "11":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19": case "20": 
					case "21": case "22":
						jari = "전갈자리";
						break;
					case "23": case "24": case "25": case "26": case "27":
					case "28": case "29": case "30":
						jari = "사수자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
			case "12":
				switch(day) {
					case "01": case "02": case "03": case "04": case "05": 
					case "06": case "07": case "08": case "09": case "10":
					case "11": case "12": case "13": case "14": case "15":
					case "16": case "17": case "18": case "19": case "20":
					case "21": case "22": case "23": case "24":
						jari = "사수자리";
						break;
					case "25": case "26": case "27": case "28": case "29":
					case "30": case "31":
						jari = "염소자리";
						break;
					default:
						jari = "error";
						break;
					}
				break;
		}
		if(jari == "error") {
			System.out.println("  ┌───────────────────┐\n"
					+ "  │  입력이 잘못되었어요 ! │\n"
					+ "  └───────────────────┘\n"
					+ "　　ᕱ ᕱ   ||\n"
					+ "　 (⸝⸝•ᴗ•⸝) ||\n"
					+ "　 /　つ づ ||\n");
		}
		else {
			String url = "https://search.naver.com/search.naver?where=nexearch&sm=tab_etc&qvt=0&query=" + jari + "%20운세";
			try {
				System.out.println();
				Thread.sleep(1000);
				System.out.println("        ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮");
				System.out.print("            입력이 확인 되었습니다 ! ︎\n");
				System.out.println("        ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞╯");
						Thread.sleep(400);
						System.out.print("       O\n");
						Thread.sleep(350);
						System.out.print("      °    \n");
						Thread.sleep(200);
						System.out.print("  ᕱ _ᕱ  \n");
						System.out.print("  つ⋅⌄⋅)づ⌁⌁");
						Thread.sleep(120);
						System.out.print("❤⌁⌁⋆");
						Thread.sleep(120);
						System.out.print("𖤐⋆♡⌁⋆");
						Thread.sleep(120);
						System.out.print( "𖤐⋆");
						Thread.sleep(700);
						System.out.print("   ✔︎ ");
						Thread.sleep(1500);
				for(int i = 0; i < 20;i++) System.out.println();
					Thread.sleep(1550);
					System.out.println("      ━━━━ 당신의 별자리는..? ━━━━");
					Thread.sleep(700);
					System.out.print("      ");
					Thread.sleep(800);
					System.out.print("별 ");
					Thread.sleep(850);
					System.out.print("자 ");
					Thread.sleep(120);
					System.out.print("리 ");
					Thread.sleep(120);
					System.out.print("를 ");
					Thread.sleep(850);
					System.out.print("찾 ");
					Thread.sleep(120);
					System.out.print("는 ");
					Thread.sleep(800);
					System.out.print("중 ");
					Thread.sleep(800);
					System.out.print(" • ");
					Thread.sleep(600);
					System.out.print(" • ");
					Thread.sleep(550);
					System.out.print(" • ");
					Thread.sleep(500);
				for(int i = 0; i < 100;i++) System.out.println();
					Thread.sleep(850);
					System.out.println("  ┌───────────────────────┐\n"
						+ "  │ 찾았어요! 곧 알려드릴게요..!│\n"
						+ "  └───────────────────────┘\n"
						+ "　　ᕱ ᕱ   ||\n"
						+ "　 (⸝⸝•ᴗ•⸝) ||\n"
						+ "　 /　つ づ ||\n");
				Thread.sleep(2500);
				for(int i = 0; i < 100;i++) System.out.println();
				System.out.print("  /) /)\n"
						+ " ( ･`ω´･)╮−−< 당신은..? ");
						Thread.sleep(850);	
						System.out.print("!");
						Thread.sleep(120);
						System.out.print("!");
						Thread.sleep(120);
						System.out.print("! ");
						Thread.sleep(650);
						System.out.print("\""+jari+"\"");
						System.out.print(" 군");
						Thread.sleep(120);
						System.out.print( "요");
						Thread.sleep(120);
						System.out.print( "!");
						Thread.sleep(120);
						System.out.print( "! 。");
						Thread.sleep(120);
						System.out.print( "˚✧₊ ");
						Thread.sleep(120);
						System.out.print( "⁎⁺˳✧");
						Thread.sleep(120);
						System.out.print( "༚ ♡ミ");
						Thread.sleep(120);
				System.out.println();
				Thread.sleep(2000);
				for(int i = 0; i < 100;i++) System.out.println();
				Thread.sleep(850);
				System.out.println("┏━━━━━━━━━━━━━ 오늘의 "+jari+" 운세 ━━━━━━━━━━━━━┓");
				Document doc = Jsoup.connect(url).get();
				Elements menus = doc.select(".api_subject_bx ._cs_fortune_text");
				String name = menus.get(0).text();
				String print;
				while(true) {
					if(name.length()<=31) break;
					print = name.substring(0,30);
					name = name.substring(30);
					print = print.trim();
					System.out.println("  " + print);
				} 
				System.out.println("  " + name);
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
				System.out.print("  ♡ (\\   ⑅/) ♡");
				System.out.print(" 운세는 마음에 드셨나요? ");
				System.out.print("설령 좋은 운세가 아니여도 운세는 운세일뿐!\n");
				System.out.print("   ฅ꒰ ⸝˶• ﻌ•˶⸝꒱ฅ");
				System.out.print("  재미로만 봐주세요! 감사합니다!");
				Thread.sleep(500);
				System.out.print(" ❤");
				Thread.sleep(120);
				System.out.print(" ♡");
				Thread.sleep(120);
				System.out.print(" ❤");
				Thread.sleep(120);
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("  ┌──────────────────────┐\n"
						+ "  │ 통신 중 오류가 발생했어요! │\n"
						+ "  └──────────────────────┘\n"
						+ "　　ᕱ ᕱ   ||\n"
						+ "　 (⸝⸝ㅜᴗㅜ⸝) ||\n"
						+ "　 /　つ づ ||\n"
						+ "");
			}
		}
		
	}		
}

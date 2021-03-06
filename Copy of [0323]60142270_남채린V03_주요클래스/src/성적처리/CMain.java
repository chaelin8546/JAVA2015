package 성적처리;

import Control.CGangjwaControl;
import Control.CGwamokControl;
import Control.CLoginControl;
import DAO.CGangjwaDAO;
import DAO.CGwamokDAO;
import DAO.CMemberDAO;
import Entity.CGangjwa;
import Entity.CGwamok;
import Entity.CMember;
import View.CGangjwaView;
import View.CGwamokView;
import View.CLoginView;

public class CMain {

		public static void main(String[] args){
			// login
			// 수정
			CLoginView loginView = new CLoginView();
			CMember member = loginView.login();	
			CLoginControl loginControl = new CLoginControl();
			member = loginControl.login(member); //암호화를 시켜줌.
			CMemberDAO memberDAO = new CMemberDAO(); // 키보드에서 읽고
			memberDAO.write(member); // 모니터에서 쓴다
			
			// 과목 개설
			CGwamokView gwamokView = new CGwamokView();
			CGwamok gwamok = gwamokView.getGwamok();
			CGwamokControl gwamokControl = new CGwamokControl();
			gwamok = gwamokControl.processGwamok(gwamok);
			CGwamokDAO gwamokDAO = new CGwamokDAO();
			gwamokDAO.write(gwamok);
			
			// 강좌 개설
			CGangjwaView GangjwaView = new CGangjwaView();
			CGangjwa Gangjwa = GangjwaView.getGangjwa();
			CGangjwaControl GangjwaControl = new CGangjwaControl();
			Gangjwa = GangjwaControl.processGangjwa(Gangjwa);
			CGangjwaDAO GangjwaDAO = new CGangjwaDAO();
			GangjwaDAO.write(Gangjwa);
			
			

		}
}

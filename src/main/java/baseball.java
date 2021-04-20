import java.util.Scanner;

public class baseball {
    public static void main(String[] args) {
        baseballFunction bbf = new baseballFunction();
        	while(bbf.runGame()) {
        		
        	}
        }
        
}


class baseballFunction{
	// 게임 시작 및 종료 메서드
    public boolean runGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String msg = sc.next();
        if(msg.equals("1")) {
        	System.out.println("게임시작");
        	return true;
        }else if(msg.equals("2")){
        	System.out.println("게임종료");
        }else {
        	System.out.println("입력값이 올바르지 않습니다.");
        }
        return false;
    }
}

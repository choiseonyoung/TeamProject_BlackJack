//package com.heart.impl;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//import com.heart.model.DeckVO;
//import com.heart.service.BlackjackRule;
//
//public class BlackJackRuleImplV3 implements BlackjackRule {
//
//	protected final int lineNum = 36;
//	protected Scanner scan;
//	Random rnd;
//	List<DeckVO> deckList;
//	String[] suit;
//	String[] strNum;
//	private int num;
//	DeckVO deckVO;
//	Integer gMoney;
//	List<DeckVO> gDeck; // 플레이어(gamer) 카드 리스트
//	List<DeckVO> dDeck; // 딜러 카드 리스트
//
//	public BlackJackRuleImplV3() {
//		scan = new Scanner(System.in);
//		rnd = new Random();
//		deckVO = new DeckVO();
//		deckList = new ArrayList<DeckVO>();
//		suit = new String[] { "Heart", "Diamond", "Clover", "Space" };
//		strNum = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J" };
//		gMoney = 10000;
//	}
//
//	@Override
//	public void gameMainScreen() {
//		// TODO 게임 첫 화면
//
//		System.out.println("*");
//		System.out.println("*" + "            " + "블랙잭게임" + "            " + "*");
//		System.out.println("*");
//
//		System.out.println("\n현재 겜블러의 재산은" + gMoney + "원 입니다.");
//
//		while (gMoney > 0) {
//			System.out.println("\n" + "-");
//			System.out.println("게임을 시작하시겠습니까?");
//			System.out.println("▷ GO : 게임하기");
//			System.out.println("▷ QUIT : 그만하기");
//			System.out.println("-");
//			System.out.print(" ▷ ");
//			String goQuit = scan.nextLine();
//
//			// 게임 선택
//			if (goQuit.equals("GO")) {
//				this.playScreen();
//			}
//
//			// 게임종료 선택
//			else if (goQuit.equals("QUIT")) {
//				System.out.println("\n게임을 종료합니다.");
//				return;
//			}
//
//			// 잘못입력
//			else {
//				System.out.println("입력은 GO / QUIT 만 가능합니다.");
//				continue;
//			}
//
//		}
//
//		System.out.println("<< GAME OVER!! >>"); // 잔액 0원
//
//	}
//
//	@Override
//	public void playScreen() {
//		// TODO 게임판
//
//		// 플레이어,딜러 카드 리스트를 생성자에서 바로 생성해놓고 게임 시작하기 안 할 수도 있으니까 게임 시작하면 생성
//		gDeck = new ArrayList<DeckVO>();
//		dDeck = new ArrayList<DeckVO>();
//
//		inputGamer();
//		bettingMoney();
//		createDeck();
//		shuffleDeck();
//		handDeck(gDeck);
//		handDeck(gDeck);
//		handDeck(dDeck);
//		handDeck(dDeck);
//		if (checkBJ() == true) { // 블랙잭이 맞다면
//			// 돈계산함수 실행
//		}
//		hitAndStand();
//
//	}
//
//	public void createDeck() {
//		// TODO 카드형식을 만들고 각 카드에 따른 값을 만듬
//		// 유빈
//		for (int i = 0; i < suit.length; i++) {
//			for (int j = 0; j < strNum.length; j++) {
//				String deck = suit[i] + " " + strNum[j];
//				// Heart A Diamond 2 형식으로
//				DeckVO deckVO = new DeckVO();
//				deckVO.setDeck(deck);
//				deckList.add(deckVO); // deckList에 저장
//				try {// strNum 을 Integer형으로 바꿈
//						// 오류가 없으면 strNum 에 담긴 값은 숫자값 >> 숫가 그대로
//						// deckVO클래스 의 value값에 담고 deckList에 저장
//					Integer intNum = Integer.valueOf(strNum[j]);
//					deckVO.setValue(intNum);
//					deckList.add(deckVO);
//				} catch (NumberFormatException e) {
//					// 만약 Integer 바꾸는데 오류가 났으면 숫자가 아닌 문자형이담긴 카드
//					// 만약 A라면 value 1을 그외의 문자는 10을 deckVO클래스에 담고 List 에 저장
//					if (strNum[j].equals("A")) {
//						Integer intNum = 1;
//						deckVO.setValue(intNum);
//						deckList.add(deckVO);
//					} else {
//						Integer intNum = 10;
//						deckVO.setValue(intNum);
//						deckList.add(deckVO);
//					}
//				}
//			}
//		}
//
//	}
//
//	@Override
//	public void inputGamer() {
//		// TODO 플레이어 정보 입력
//
//	}
//
//	@Override
//	public Integer bettingMoney() {
//		// TODO 돈 배팅
//		return null;
//	}
//
//	@Override
//	public void shuffleDeck() {
//		// TODO 카드 덱 셔플
//		// 아영
//
//		createDeck();
//
//		Collections.shuffle(deckList);
//
//	}
//
//	@Override
//	public void handDeck(List<DeckVO> list) {
//		// TODO 카드 한장 뽑아주기
//		// playScreen에서 참조값 num 설정해두어야 한다.
//		//// 매개변수로 플레이어카드리스트 OR 딜러카드리스트 받아서, 순서대로 뽑은 카드를 하나씩 추가해줌
//
//		num = 0; // 몇번째에 있는 카드 뽑을지
//		DeckVO vo = deckList.get(num);
//
//		vo.getDeck();
//		vo.getValue();
//
//		num++; // 중복된 카드 뽑으면 안 되니까 값 변하게
//
//		list.add(vo); // 플레이어 OR 딜러 카드 리스트에 추가
//	}
//
//	@Override
//	public boolean checkBJ() {
//		// TODO 블랙잭 판단
//		boolean blackjack = true;
//
//		if( (vo.getValue(0) ==1) && (vo.getValue(1) ==10) ) {
//			return true;
//		} else {
//			return false;
//		}
//		return false;
//	}
//
//	/*
//	 * 플레이어가 히트를 할 경우 딜러가 히트를 할 경우
//	 */
//	@Override
//	public void hitAndStand() {
//		// TODO Auto-generated method stub
//		// 플레이어의 카드와 점수
//		for (int i = 0; i < deckList.size(); i++) {
//			DeckVO vo = deckList.get(i);
//			System.out.println(vo.getDeck());
//			System.out.println(vo.getValue());
//		}
//
//		// 딜러의 카드와 점수
//
//		// hit stand 선택지
//		while (true) {
//			System.out.println("=".repeat(50));
//			System.out.println("HIT : 1");
//			System.out.println("STAND : 0");
//			System.out.println("=".repeat(50));
//			System.out.print(">> ");
//			Integer hOs = scan.nextInt();
//
//			// 플레이어
//			Integer gamerC = this.gamerRule(hOs);
//			if (gamerC == null) {
//				break;
//			} else {
//				DeckVO vo = new DeckVO();
//				// 뭔가 해야함
//				deckList.add(vo);
//			}
//
//			// 딜러
//			Integer dealerC = this.dealerRule(hOs);
//		} // while end
//	}
//
//	// 플레이어의 룰이 적용되는 히트 메서드
//	protected Integer gamerRule(Integer num) {
//		Integer result = null;
//		if (num == 1) {
//			result = this.hit();
//			// 플레이어의 규칙 : 21을 초과한 점수가 나올 시 Bust
//			if (result > 21) {
//				System.out.println("BUST!!");
//				// 뭔가하기
//				return null;
//			}
//			// 21미만이면 카드리스트에 추가하고 점수 계산하고 다시 히트스탠드로 돌아가기
//			// 스탠드를 선택했으면
//		} else if (num == 0) {
//			return null;
//		}
//		return result;
//	}
//
//	// 딜러의 룰이 적용되는 히트 메서드
//	protected Integer dealerRule(Integer num) {
//		Integer result = null;
//		if (num == 1) {
//			result = this.hit();
//			// 딜러의 규칙 : 17이상의 점수가 나올 시 히트 불가능
//			if (result > 17 && result <= 21) {
//				// 딜러리스트에 값을 저장하고 vo리턴?
//				return null;
//			} else if (result > 21)
//				return null;
//		} else if (num == 0) {
//			return null;
//		}
//		return result;
//	}
//
//	protected Integer hit() {
//		// TODO 히트하는 메서드
//		// handDeck
//
//		// handDeck 추가
//		// 계산 하기
//
//		// 계산된 점수값을 리턴하기 vo를 리턴하게 될 것 같음 아마...
//		return null;
//	}
//
//	@Override
//	public void gameResult() {
//		// TODO 게임 결과
//
//	}
//
//	@Override
//	public void gamerMoney() {
//		// TODO 돈계산
//
//	}
//
//	public void win() {
//		// TODO 플레이어가 이겼을 경우 돈계산
//	}
//
//	public void lose() {
//		// TODO 플레이어가 졌을 경우 돈계산
//	}
//
//	public void push() {
//		// TODO 비겼을 경우 돈계산
//	}
//
//}
